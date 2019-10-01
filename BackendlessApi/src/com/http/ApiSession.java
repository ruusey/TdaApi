package com.http;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ta4j.core.Strategy;
import org.ta4j.core.TimeSeries;
import org.ta4j.core.TimeSeriesManager;
import org.ta4j.core.TradingRecord;
import org.ta4j.core.analysis.criteria.TotalProfitCriterion;
import org.ta4j.core.num.Num;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.methods.Endpoint;
import com.models.Account;
import com.models.AccountList;
import com.models.CashAccount;
import com.models.ContractType;
import com.models.FrequencyType;
import com.models.Index;
import com.models.Location;
import com.models.Login;
import com.models.Market;
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
import com.models.User;
import com.strategy.CCICorrectionStrategy;
import com.strategy.GlobalExtremaStrategy;
import com.strategy.MovingMomentumStrategy;
import com.strategy.RSI2Strategy;
import com.tda.methods.Tda;
import com.util.AnalysisUtil;
import com.util.Util;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ApiSession {
	static final Logger LOGGER = LogManager.getLogger(ApiSession.class);
	public OkHttpClient client;
	public String BASE_URL;
	public Gson gson;
	public static final MediaType JSON = MediaType.get("application/json");
	public String bearerToken;
	public ApiSession(String baseUrl) {
		client = new OkHttpClient();
		this.BASE_URL = baseUrl;
		gson = new GsonBuilder().setPrettyPrinting().create();
		LOGGER.info("Created API session to "+this.BASE_URL);
	}

	public ApiSession(String baseUrl, String appId, String apiKey) {
		String auth = appId + "/" + apiKey;
		client = new OkHttpClient();
		this.BASE_URL = baseUrl + auth;
		gson = new GsonBuilder().setPrettyPrinting().create();
	}

	public String executeGetWithBearer(String endpoint) throws IOException {
		Request request = new Request.Builder().url(this.BASE_URL + endpoint).get()
				.addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer " + this.bearerToken).build();

		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public String executeGetWithToken(Endpoint endpoint, User user, String path) throws IOException {
		Request request = new Request.Builder().url(this.BASE_URL + endpoint.path + "/" + path).get()
				.addHeader("Content-Type", "application/json").addHeader("user-token", user.getUserToken()).build();

		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public String executeGetWithToken(Endpoint endpoint, User user) throws IOException {
		Request request = new Request.Builder().url(this.BASE_URL + endpoint.path).get()
				.addHeader("Content-Type", "application/json").addHeader("user-token", user.getUserToken()).build();

		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public String executePostWithToken(Endpoint endpoint, Serializable json, User user) throws IOException {
		System.out.println(gson.toJson(json));
		RequestBody body = RequestBody.create(gson.toJson(json), JSON);
		System.out.println(gson.toJson(body.contentType()));
		Request request = new Request.Builder().url(this.BASE_URL + endpoint.path).post(body)
				.addHeader("user-token", user.getUserToken()).build();

		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public String executePost(Endpoint endpoint, Serializable json) throws IOException {
		System.out.println(gson.toJson(json));
		RequestBody body = RequestBody.create(gson.toJson(json), JSON);
		System.out.println(gson.toJson(body.contentType()));
		Request request = new Request.Builder().url(this.BASE_URL + endpoint.path).post(body).build();

		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public String executePost(String url, Serializable json) throws IOException {
		System.out.println(gson.toJson(json));
		RequestBody body = RequestBody.create(gson.toJson(json), JSON);
		System.out.println(gson.toJson(body.contentType()));
		Request request = new Request.Builder().url(this.BASE_URL + url).post(body).build();

		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public String executePost(String url, String json) throws IOException {
		RequestBody body = RequestBody.create(json, JSON);
		Request request = new Request.Builder().url(this.BASE_URL + url).post(body).build();
		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public String executePost(String url) throws IOException {
		RequestBody body = RequestBody.create("", JSON);
		Request request = new Request.Builder().url(this.BASE_URL + url).post(body).build();
		try (Response response = this.client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public void printJson(Object o) {
		System.out.println(gson.toJson(o));
	}
	public <T> TypeReference<Map<String,T>> parseDynamic(String response, Class<T> clazz) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(response, new TypeReference<Map<String,T>>(){});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public <T> T parseResponse(String response, Class<T> clazz) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(response, clazz);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public <T> List<T> parseResponseList(String response, Class<T> clazz) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(response, new TypeReference<List<T>>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void saveProps(Properties newProps,String path) {
		try (OutputStream output = new FileOutputStream(path)) {
			newProps.store(output, null);
			//System.out.println(newProps);

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
//		Pair<String,String> apiCreds = Util.loadApiCredentials("C:/temp/backendless.properties");
//		
//		ApiSession util = new ApiSession("https://api.backendless.com/",apiCreds.getKey(),apiCreds.getValue());
//		

//		//String response = util.executePost(Endpoint.LOGIN, login);
//		Function<String, User> doLogin = response->util.parseResponse(response, User.class);
//		User session= doLogin.apply(util.executePost(Endpoint.LOGIN, login));
//		//User session = util.parseResponse(response, User.class);
//		List<Location> locs = util.parseResponseList(util.executeGetWithToken(Endpoint.GEOCATEGORIES, session),Location.class);
//		util.printJson(locs);
			
			if(args==null || args[0] == null) {
				System.out.println("missing argument <path-to-tda-api.properties>");
				System.exit(0);
			}
			String path = args[0];
			ApiSession tda = Tda.initializeTdaApi(path);
			System.out.println(tda.bearerToken);
			//Quote quote = Tda.getTdaSymbolQuote(tda, "ICE");
			//tda.printJson(quote);
			
			//PriceHistory history = 
			//tda.printJson(history);
			
			//SecuritiesAccount account = Tda.getTdaCashAccount(tda,"496140950");
			//List<Mover> movers = Tda.getTdaMovers(tda, Index.SPXX);
			//List<Order> accountOrders = Tda.getTdaOdersByAccount(tda, bearer, "496140950");
			//tda.printJson(Tda.getMarketHours(tda, Market.INDEX));
			//SymbolFundamental symbol = Tda.getTdaInstrumentFundamental(tda, "T");
			//Option option = Tda.getOptionChain(tda, "T", ContractType.ALL, 2, StrikeRange.ITM);
			//tda.printJson(Tda.getTdaInstrumentFundamental(tda, "T"));
			//tda.printJson(Tda.getTdaInstrumentSearch(tda, "T"));
			
			PriceHistory history = Tda.getTdaSymbolHistory(tda, "T",PeriodType.DAY,Period.TEN,FrequencyType.MINUTE,Period.FIVE,true);
			//tda.printJson(history);
			
	        // Run trading strat
	        RSI2Strategy.run(history);

	        // Running the strategy
	       
			//tda.printJson(Tda.getOptionChain(tda, "T", ContractType.ALL, 1, StrikeRange.ITM));
		
	}
}
