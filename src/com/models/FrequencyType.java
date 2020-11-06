package com.models;

import java.util.HashMap;
import java.util.Map;

public enum FrequencyType {
	MINUTE("minute"),
	DAILY("daily"),
	WEEKLY("weekly"),
	MONTHLY("monthly");
	
	public static Map<String, FrequencyType> map = new HashMap<String, FrequencyType>();
	static {
        for (FrequencyType e : FrequencyType.values()) {
            map.put(e.name, e);
        }
    }
	
	public String name;
	FrequencyType(String name){
		this.name=name;
	}
}
