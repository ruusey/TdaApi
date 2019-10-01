package com.tda.methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.http.ApiSession;
import com.models.Account;
import com.models.AccountList;
import com.models.CashAccount;
import com.models.ContractType;
import com.models.FrequencyType;
import com.models.Index;
import com.models.Market;
import com.models.MarketHours;
import com.models.Mover;
import com.models.Option;
import com.models.Order;
import com.models.Period;
import com.models.PeriodType;
import com.models.PriceHistory;
import com.models.Quote;
import com.models.SecuritiesAccount;
import com.models.StrikeRange;
import com.models.Symbol;
import com.models.SymbolFundamental;
import com.models.Token;
import com.models.Transaction;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Tda {
	static final Logger LOGGER = LogManager.getLogger(Tda.class);

	public static ApiSession initializeTdaApi(String propertiesPath) {
		long start = Tda.getStartTime();
		try (InputStream input = new FileInputStream(propertiesPath)) {
			LOGGER.info("Loading API properties from " + propertiesPath);
			Properties prop = new Properties();
			prop.load(input);
			String clientId = prop.getProperty("tda.client_id");
			String baseUrl = prop.getProperty("tda.http.path");
			String refreshToken = prop.getProperty("tda.token.refresh");
			ApiSession tda = new ApiSession(baseUrl);
			LOGGER.info("Fetching API access token");
			Token token = Tda.postTdaApiTokens(tda, refreshToken, clientId);
			tda.printJson(token);
			prop.setProperty("tda.token.refresh", token.getRefreshToken());
			prop.setProperty("tda.token.access", token.getAccessToken());
			tda.saveProps(prop, propertiesPath);
			tda.bearerToken = prop.getProperty("tda.token.access");
			LOGGER.info("Succesfully initialized TDA API in "+Tda.getTimeSince(start));
			return tda;
		} catch (IOException ex) {
			LOGGER.error(ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}
	
	public static Token postTdaApiTokens(ApiSession session, String initialRefreshToken, String clientId)
			throws IOException {
		String url = session.BASE_URL + "oauth2/token";
		String query1 = "grant_type=refresh_token&refresh_token=" + URLEncoder.encode(initialRefreshToken)
				+ "&access_type=offline&code=&client_id=" + URLEncoder.encode(clientId)
				+ "&redirect_uri=https%3A%2F%2F127.0.0.1";
		Request request = new Request.Builder().url(url)
				.post(RequestBody.create(query1, MediaType.get("application/x-www-form-urlencoded"))).build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponse(response.body().string(), Token.class);
		}
	}
	public static MarketHours getMarketHours(ApiSession session, Market market) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching market hours for " + market);
		String url = session.BASE_URL + "marketdata/hours?markets="+market+"&date="+Tda.getCurrentDateISO();
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched market hours in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), MarketHours.class);
		}
	}
	public static Option getOptionChain(ApiSession session, String symbol, ContractType contractType, int strikeCount, StrikeRange range) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching option chain for " + symbol);
		String url = session.BASE_URL + "marketdata/chains";
		url+="?symbol="+symbol+"&contractType="+contractType+"&strikeCount="+strikeCount+"&range="+range;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched option chain in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), Option.class);
		}
		
	}
	public static Object replaceTdaOrder(ApiSession session, String accountId, String orderId, Order order)
			throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Replacing order " + orderId);
		String url = session.BASE_URL + "accounts/" + accountId + "/orders/" + orderId;
		RequestBody body = RequestBody.create(session.gson.toJson(order), ApiSession.JSON);
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.put(body).build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Replaced order in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), Object.class);
		}
	}

	public static Object placeTdaOrder(ApiSession session, String accountId, Order order) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Placing new order for account " + accountId);
		String url = session.BASE_URL + "accounts/" + accountId + "/orders";
		RequestBody body = RequestBody.create(session.gson.toJson(order), ApiSession.JSON);
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.post(body).build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Placed new order in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), Object.class);
		}
	}

	public static List<Transaction> getTdaTransactions(ApiSession session, String accountId, String symbol)
			throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching transactions for account " + accountId);
		String url = session.BASE_URL + "accounts/" + accountId + "/transactions";
		if (symbol != null) {
			url += "?symbol=" + symbol;
		}
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched transactions in " + Tda.getTimeSince(start));
			return session.parseResponseList(response.body().string(), Transaction.class);
		}
	}

	public static SymbolFundamental getTdaInstrumentFundamental(ApiSession session, String symbol) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching fundamental data for symbol " + symbol);
		String url = session.BASE_URL + "instruments?symbol=" + symbol + "&projection=fundamental";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched fundamental data in " + Tda.getTimeSince(start));
			String inner = session.gson.toJson(session.parseResponse(response.body().string(), SymbolFundamental.class)
					.getAdditionalProperties().get(symbol));
			return session.parseResponse(inner, SymbolFundamental.class);
		}
	}

	public static Symbol getTdaInstrumentSearch(ApiSession session, String symbol) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching symbol data for " + symbol);
		String url = session.BASE_URL + "instruments?symbol=" + symbol + "&projection=symbol-search";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched symbol data in " + Tda.getTimeSince(start));
			String inner = session.gson.toJson(session.parseResponse(response.body().string(), Symbol.class)
					.getAdditionalProperties().get(symbol));
			return session.parseResponse(inner, Symbol.class);
		}
	}

	public static Transaction getTdaTransaction(ApiSession session, String accountId, String transactionId)
			throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching transaction " + transactionId);
		String url = session.BASE_URL + "accounts/" + accountId + "/transactions/" + transactionId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched transaction in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), Transaction.class);
		}
	}

	public static Order getTdaOrder(ApiSession session, String accountId, String orderId) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching order " + orderId);
		String url = session.BASE_URL + "accounts/" + accountId + "/orders/" + orderId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched order in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), Order.class);
		}
	}

	public static Object deleteTdaOrder(ApiSession session, String accountId, String orderId) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Deleting order " + orderId);
		String url = session.BASE_URL + "accounts/" + accountId + "/orders/" + orderId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.delete().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Deleted order in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), Object.class);
		}
	}

	public static List<Mover> getTdaMovers(ApiSession session, Index index) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching movers for " + index.name);
		String url = session.BASE_URL + "marketdata/" + index.name + "/movers";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched movers in " + Tda.getTimeSince(start));
			return session.parseResponseList(response.body().string(), Mover.class);
		}
	}

	public static List<Order> getTdaOrders(ApiSession session) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching orders");
		String url = session.BASE_URL + "orders/";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched orders in " + Tda.getTimeSince(start));
			return session.parseResponseList(response.body().string(), Order.class);
		}
	}

	public static List<Order> getTdaOdersByAccount(ApiSession session, String accountId) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching order for account " + accountId);
		String url = session.BASE_URL + "accounts/" + accountId + "/orders";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched orders in " + Tda.getTimeSince(start));
			return session.parseResponseList(response.body().string(), Order.class);
		}
	}

	public static Quote getTdaSymbolQuote(ApiSession session, String symbol) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching symbol quote for " + symbol);
		String url = session.BASE_URL + "marketdata/" + symbol + "/quotes";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched symbol quote in " + Tda.getTimeSince(start));
			String inner = session.gson.toJson(
					session.parseResponse(response.body().string(), Quote.class).getAdditionalProperties().get(symbol));
			return session.parseResponse(inner, Quote.class);
		}
	}

	public static PriceHistory getTdaSymbolHistory(ApiSession session, String symbol, PeriodType periodType,
			Period period, FrequencyType frequencyType, Period frequency, Long endDate, Long startDate,
			boolean needExtendedHours) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching symbol price history for " + symbol + " [periodType=" + periodType + " , period=" + period
				+ " , frequencyType=" + frequencyType + " , frequency=" + frequency + " , needExtendedHoursData="
				+ needExtendedHours + "]");
		String url = session.BASE_URL + "marketdata/" + symbol + "/pricehistory?periodType=" + periodType.name
				+ "&period=" + period.period + "&frequencyType=" + frequencyType.name + "&frequency=" + frequency.period
				+ "&endDate=" + endDate + "&startDate=" + startDate + "&needExtendedHoursData=" + needExtendedHours;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched symbol price history in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), PriceHistory.class);
		}
	}

	public static PriceHistory getTdaSymbolHistory(ApiSession session, String symbol, PeriodType periodType,
			Period period, FrequencyType frequencyType, Period frequency, boolean needExtendedHours)
			throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching symbol price history for " + symbol + " [periodType=" + periodType + " , period=" + period
				+ " , frequencyType=" + frequencyType + " , frequency=" + frequency + " , needExtendedHoursData="
				+ needExtendedHours + "]");
		String url = session.BASE_URL + "marketdata/" + symbol + "/pricehistory?periodType=" + periodType.name
				+ "&period=" + period.period + "&frequencyType=" + frequencyType.name + "&frequency=" + frequency.period
				+ "&needExtendedHoursData=" + needExtendedHours;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched symbol price history in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), PriceHistory.class);
		}
	}

	public static List<SecuritiesAccount> getTdaCashAccount(ApiSession session) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching user accounts");
		String url = session.BASE_URL + "accounts";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched user accounts in " + Tda.getTimeSince(start));
			return session.parseResponseList(response.body().string(), SecuritiesAccount.class);
		}
	}

	public static SecuritiesAccount getTdaCashAccount(ApiSession session, String accountId) throws IOException {
		long start = Tda.getStartTime();
		LOGGER.info("Fetching user account " + accountId);
		String url = session.BASE_URL + "accounts/" + accountId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			LOGGER.info("Fetched user account in " + Tda.getTimeSince(start));
			return session.parseResponse(response.body().string(), SecuritiesAccount.class);
		}
	}
	public static String getCurrentDateISO() {
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); // Quoted "Z" to indicate UTC, no timezone offset
		df.setTimeZone(tz);
		return df.format(new Date());
	}
//	public static String formatDateISO() {
//		TimeZone tz = TimeZone.getTimeZone("UTC");
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
//		df.setTimeZone(tz);
//		df.f
//	}
	public static long getStartTime() {
		return System.currentTimeMillis();
	}

	public static String getTimeSince(long start) {
		return (System.currentTimeMillis() - start) + "ms";
	}
}
