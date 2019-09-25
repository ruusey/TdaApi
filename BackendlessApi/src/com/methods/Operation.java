package com.methods;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

import com.http.ApiSession;
import com.models.Location;
import com.models.Login;
import com.models.User;

public class Operation {
	public static User doLogin(ApiSession session, Login login) {
		Function<String, User> doLogin = response->session.parseResponse(response, User.class);
		try {
			return doLogin.apply(session.executePost(Endpoint.LOGIN, login));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void doLogout(ApiSession session, User user) {
		try {
			session.executeGetWithToken(Endpoint.LOGOUT, user);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static List<Location> getLocations(ApiSession session){
		return null;
	}
	public static List<Location> getLocationsInRadius(ApiSession session){
		return null;
	}
}
