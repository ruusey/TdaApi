package com.methods;

import java.util.HashMap;
import java.util.Map;

public enum Subquery {
	DATAPROPS("/properties"),
	SUBSCRIBE("/subscribe");
	
	public static Map<String, Subquery> map = new HashMap<String, Subquery>();
	static {
        for (Subquery e : Subquery.values()) {
            map.put(e.path, e);
        }
    }
	
	public String path;
	Subquery(String path){
		this.path=path;
	}
//	@Override
//	public static Endpoint valueOf(String type) {
//        return map.get(type);
//    }
}
