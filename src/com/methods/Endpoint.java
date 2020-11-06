package com.methods;

import java.util.HashMap;
import java.util.Map;


public enum Endpoint {
	LOGIN("/users/login"),
	LOGOUT("/users/logout"),
	GEOCATEGORIES("/geo/categories"),
	GEOPOINTS("/geo/points"),
	USERSCHEMA("/users/userclassprops"),
	SENDEMAIL("/messaging/email"),
	PUBSUB("/messaging/"),
	DATA("/data/");
	
	public static Map<String, Endpoint> map = new HashMap<String, Endpoint>();
	static {
        for (Endpoint e : Endpoint.values()) {
            map.put(e.path, e);
        }
    }
	
	public String path;
	Endpoint(String path){
		this.path=path;
	}
//	@Override
//	public static Endpoint valueOf(String type) {
//        return map.get(type);
//    }
}
