package com.tda.methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Properties;

import com.google.gson.Gson;
import com.http.ApiSession;
import com.models.Account;
import com.models.AccountList;
import com.models.CashAccount;
import com.models.FrequencyType;
import com.models.Index;
import com.models.Mover;
import com.models.Order;
import com.models.Period;
import com.models.PeriodType;
import com.models.PriceHistory;
import com.models.Quote;
import com.models.SecuritiesAccount;
import com.models.Symbol;
import com.models.SymbolFundamental;
import com.models.Token;
import com.models.Transaction;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Tda {
	public static ApiSession initializeTdaApi(String propertiesPath) {
		try (InputStream input = new FileInputStream(propertiesPath)) {
			Properties prop = new Properties();
			prop.load(input);
			String clientId = prop.getProperty("tda.client_id");
			String baseUrl = prop.getProperty("tda.http.path");
			String refreshToken = prop.getProperty("tda.token.refresh");
			ApiSession tda = new ApiSession(baseUrl);
			Token token = Tda.postTdaApiTokens(tda, refreshToken, clientId);
			tda.printJson(token);
			prop.setProperty("tda.token.refresh", token.getRefreshToken());
			prop.setProperty("tda.token.access", token.getAccessToken());
			tda.saveProps(prop, propertiesPath);
			tda.bearerToken = prop.getProperty("tda.token.access");
			return tda;
		} catch (IOException ex) {
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

	public static Object replaceTdaOrder(ApiSession session, String accountId, String orderId, Order order)
			throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId + "/orders/" + orderId;
		RequestBody body = RequestBody.create(session.gson.toJson(order), ApiSession.JSON);
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.put(body).build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponse(response.body().string(), Object.class);
		}
	}

	public static Object placeTdaOrder(ApiSession session, String accountId, Order order) throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId + "/orders";
		RequestBody body = RequestBody.create(session.gson.toJson(order), ApiSession.JSON);
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.post(body).build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponse(response.body().string(), Object.class);
		}
	}
	public static List<Transaction> getTdaTransactions(ApiSession session, String accountId, String symbol) throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId + "/transactions";
		if(symbol!=null) {
			url+="?symbol="+symbol;
		}
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponseList(response.body().string(), Transaction.class);
		}
	}
	public static SymbolFundamental getTdaInstrumentFundamental(ApiSession session, String symbol) throws IOException {
		String url = session.BASE_URL + "instruments?symbol="+symbol+"&projection=fundamental";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			String inner = session.gson.toJson(
					session.parseResponse(response.body().string(), SymbolFundamental.class).getAdditionalProperties().get(symbol));
			return session.parseResponse(inner, SymbolFundamental.class);
		}
	}
	public static Symbol getTdaInstrumentSearch(ApiSession session, String symbol) throws IOException {
		String url = session.BASE_URL + "instruments?symbol="+symbol+"&projection=symbol-search";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			String inner = session.gson.toJson(
					session.parseResponse(response.body().string(), Symbol.class).getAdditionalProperties().get(symbol));
			return session.parseResponse(inner, Symbol.class);
		}
	}
	public static Transaction getTdaTransaction(ApiSession session, String accountId, String transactionId) throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId + "/transactions/" + transactionId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponse(response.body().string(), Transaction.class);
		}
	}
	public static Order getTdaOrder(ApiSession session, String accountId, String orderId) throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId + "/orders/" + orderId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponse(response.body().string(), Order.class);
		}
	}

	public static Object deleteTdaOrder(ApiSession session, String accountId, String orderId) throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId + "/orders/" + orderId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.delete().build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponse(response.body().string(), Object.class);
		}
	}

	public static List<Mover> getTdaMovers(ApiSession session, Index index) throws IOException {
		String url = session.BASE_URL + "marketdata/" + index.name + "/movers";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponseList(response.body().string(), Mover.class);
		}
	}

	public static List<Order> getTdaOrders(ApiSession session) throws IOException {
		String url = session.BASE_URL + "orders/";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			return session.parseResponseList(response.body().string(), Order.class);
		}
	}

	public static Quote getTdaSymbolQuote(ApiSession session, String symbol) throws IOException {
		String url = session.BASE_URL + "marketdata/" + symbol + "/quotes";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			String inner = session.gson.toJson(
					session.parseResponse(response.body().string(), Quote.class).getAdditionalProperties().get(symbol));
			return session.parseResponse(inner, Quote.class);
		}
	}

	public static PriceHistory getTdaSymbolHistory(ApiSession session, String symbol, PeriodType periodType,
			Period period, FrequencyType frequencyType, Period frequency, Long endDate, Long startDate,
			boolean needExtendedHours) throws IOException {
		String url = session.BASE_URL + "marketdata/" + symbol + "/pricehistory?periodType=" + periodType.name
				+ "&period=" + period.period + "&frequencyType=" + frequencyType.name + "&frequency=" + frequency.period
				+ "&endDate=" + endDate + "&startDate=" + startDate + "&needExtendedHoursData=" + needExtendedHours;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			// System.out.println(response.headers());
			return session.parseResponse(response.body().string(), PriceHistory.class);
		}
	}

	public static PriceHistory getTdaSymbolHistory(ApiSession session, String symbol, PeriodType periodType,
			Period period, FrequencyType frequencyType, Period frequency, boolean needExtendedHours)
			throws IOException {
		String url = session.BASE_URL + "marketdata/" + symbol + "/pricehistory?periodType=" + periodType.name
				+ "&period=" + period.period + "&frequencyType=" + frequencyType.name + "&frequency=" + frequency.period
				+ "&needExtendedHoursData=" + needExtendedHours;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			// System.out.println(response.headers());
			return session.parseResponse(response.body().string(), PriceHistory.class);
		}
	}

	public static List<SecuritiesAccount> getTdaCashAccount(ApiSession session) throws IOException {
		String url = session.BASE_URL + "accounts";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			// System.out.println(response.headers());
			return session.parseResponseList(response.body().string(), SecuritiesAccount.class);
		}
	}

	public static SecuritiesAccount getTdaCashAccount(ApiSession session, String accountId) throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			// System.out.println(response.headers());
			return session.parseResponse(response.body().string(), SecuritiesAccount.class);
		}
	}

	public static List<Order> getTdaOdersByAccount(ApiSession session, String accountId) throws IOException {
		String url = session.BASE_URL + "accounts/" + accountId + "/orders";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + session.bearerToken)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			// System.out.println(response.headers());
			return session.parseResponseList(response.body().string(), Order.class);
		}
	}
}
