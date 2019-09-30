package com.models;

import java.util.HashMap;
import java.util.Map;

public enum PeriodType {
	DAY("day"),
	MONTH("month"),
	YEAR("year"),
	YTD("ytd");
	
	public static Map<String, PeriodType> map = new HashMap<String, PeriodType>();
	static {
        for (PeriodType e : PeriodType.values()) {
            map.put(e.name, e);
        }
    }
	
	public String name;
	PeriodType(String name){
		this.name=name;
	}
}
