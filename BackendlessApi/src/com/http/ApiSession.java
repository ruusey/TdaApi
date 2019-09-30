package com.http;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;

import org.apache.commons.lang3.tuple.Pair;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.methods.Endpoint;
import com.models.AccountList;
import com.models.CashAccount;
import com.models.FrequencyType;
import com.models.Location;
import com.models.Login;
import com.models.Period;
import com.models.PeriodType;
import com.models.PriceHistory;
import com.models.SecuritiesAccount;
import com.models.Token;
import com.models.User;
import com.tda.methods.Tda;
import com.util.Util;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ApiSession {
	public OkHttpClient client;
	public String BASE_URL;
	private Gson gson;
	public static final MediaType JSON = MediaType.get("application/json");

	public ApiSession(String baseUrl) {
		client = new OkHttpClient();
		this.BASE_URL = baseUrl;
		gson = new Gson();
	}

	public ApiSession(String baseUrl, String appId, String apiKey) {
		String auth = appId + "/" + apiKey;
		client = new OkHttpClient();
		this.BASE_URL = baseUrl + auth;
		gson = new Gson();
	}

	public String executeGetWithBearer(String endpoint, String bearer) throws IOException {
		Request request = new Request.Builder().url(this.BASE_URL + endpoint).get()
				.addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer " + bearer).build();

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

	public void saveProps(Properties newProps) {
		try (OutputStream output = new FileOutputStream("C:/temp/tda-api.properties")) {
			newProps.store(output, null);
			System.out.println(newProps);

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
//		Pair<String,String> apiCreds = Util.loadApiCredentials("C:/temp/backendless.properties");
//		
//		ApiSession util = new ApiSession("https://api.backendless.com/",apiCreds.getKey(),apiCreds.getValue());
//		
//		Login login = new Login("robert.usey@soltech.net", "Ruboy123#back");
//		//String response = util.executePost(Endpoint.LOGIN, login);
//		Function<String, User> doLogin = response->util.parseResponse(response, User.class);
//		User session= doLogin.apply(util.executePost(Endpoint.LOGIN, login));
//		//User session = util.parseResponse(response, User.class);
//		List<Location> locs = util.parseResponseList(util.executeGetWithToken(Endpoint.GEOCATEGORIES, session),Location.class);
//		util.printJson(locs);
		try (InputStream input = new FileInputStream("C:/temp/tda-api.properties")) {
			Properties prop = new Properties();

			prop.load(input);

			String clientId = prop.getProperty("tda.client_id");
			String baseUrl = prop.getProperty("tda.http.path");
			String refreshToken = prop.getProperty("tda.token.refresh");

			ApiSession tda = new ApiSession(baseUrl);

			Token token = Tda.postTdaApiTokens(tda,refreshToken, clientId);
			tda.printJson(token);

			prop.setProperty("tda.token.refresh", token.getRefreshToken());
			prop.setProperty("tda.token.access", token.getAccessToken());
			
			tda.saveProps(prop);
			String bearer = prop.getProperty("tda.token.access");
			String response = tda.executeGetWithBearer("marketdata/ice/quotes", bearer);
			System.out.println(bearer);
			PriceHistory history = Tda.getTdaSymbolHistory(tda, "AAPL", bearer,PeriodType.DAY,Period.ONE,FrequencyType.MINUTE,Period.FIVE,true);
			List<AccountList> account = Tda.getTdaCashAccount(tda, bearer);
			tda.printJson(account);
			tda.printJson(history);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
