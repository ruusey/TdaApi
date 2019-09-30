package com.tda.methods;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import com.http.ApiSession;
import com.models.AccountList;
import com.models.CashAccount;
import com.models.FrequencyType;
import com.models.Period;
import com.models.PeriodType;
import com.models.PriceHistory;
import com.models.SecuritiesAccount;
import com.models.Token;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Tda {
	public static Token postTdaApiTokens(ApiSession session, String initialRefreshToken, String clientId) throws IOException {
		String url = session.BASE_URL + "oauth2/token";
		String query1 = "grant_type=refresh_token&refresh_token=" + URLEncoder.encode(initialRefreshToken)
				+ "&access_type=offline&code=&client_id=" + URLEncoder.encode(clientId)
				+ "&redirect_uri=https%3A%2F%2F127.0.0.1";
		Request request = new Request.Builder().url(url)
				.post(RequestBody.create(query1, MediaType.get("application/x-www-form-urlencoded"))).build();
		//session.printJson(request);
		try (Response response = session.client.newCall(request).execute()) {
			//System.out.println(response.headers());
			return session.parseResponse(response.body().string(), Token.class);
		}
	}
	public static PriceHistory getTdaSymbolHistory(ApiSession session, String symbol, String bearer, PeriodType periodType, Period period, FrequencyType frequencyType,Period frequency, Long endDate, Long startDate, boolean needExtendedHours) throws IOException {
		String url = session.BASE_URL + "marketdata/"+symbol+"/pricehistory?periodType="+periodType.name+"&period="+period.period+"&frequencyType="+frequencyType.name+"&frequency="+frequency.period+"&endDate="+endDate+"&startDate="+startDate+"&needExtendedHoursData="+needExtendedHours;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + bearer)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			//System.out.println(response.headers());
			return session.parseResponse(response.body().string(), PriceHistory.class);
		}
	}
	public static PriceHistory getTdaSymbolHistory(ApiSession session, String symbol, String bearer, PeriodType periodType, Period period, FrequencyType frequencyType,Period frequency,boolean needExtendedHours) throws IOException {
		String url = session.BASE_URL + "marketdata/"+symbol+"/pricehistory?periodType="+periodType.name+"&period="+period.period+"&frequencyType="+frequencyType.name+"&frequency="+frequency.period+"&needExtendedHoursData="+needExtendedHours;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + bearer)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			//System.out.println(response.headers());
			return session.parseResponse(response.body().string(), PriceHistory.class);
		}
	}
	public static List<AccountList> getTdaCashAccount(ApiSession session,String bearer) throws IOException {
		String url = session.BASE_URL + "accounts";
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + bearer)
				.get().build();
		try (Response response = session.client.newCall(request).execute()) {
			//System.out.println(response.headers());
			return session.parseResponseList(response.body().string(), AccountList.class);
		}
	}
}
