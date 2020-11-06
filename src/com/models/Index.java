package com.models;

import java.util.HashMap;
import java.util.Map;

public enum Index {
	SPXX("$SPX.X"),
	DJI("$DJI"),
	COMPX("$COMPX");
	
	public static Map<String, Index> map = new HashMap<String, Index>();
	static {
        for (Index e : Index.values()) {
            map.put(e.name, e);
        }
    }
	
	public String name;
	Index(String name){
		this.name=name;
	}
}
