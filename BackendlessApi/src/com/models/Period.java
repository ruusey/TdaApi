package com.models;

import java.util.HashMap;
import java.util.Map;

public enum Period {
	ONE("1"),
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	TEN("10"),
	FIFTEEN("15"),
	TWENTY("20"),
	THIRTY("30");
	
	public static Map<String, Period> map = new HashMap<String, Period>();
	static {
        for (Period e : Period.values()) {
            map.put(e.period, e);
        }
    }
	
	public String period;
	Period(String period){
		this.period=period;
	}
}
