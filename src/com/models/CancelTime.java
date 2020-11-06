package com.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "date", "shortFormat" })
public class CancelTime {

	@JsonProperty("date")
	private String date;
	@JsonProperty("shortFormat")
	private boolean shortFormat;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public CancelTime() {
	}

	/**
	 *
	 * @param shortFormat
	 * @param date
	 */
	public CancelTime(String date, boolean shortFormat) {
		super();
		this.date = date;
		this.shortFormat = shortFormat;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("shortFormat")
	public boolean isShortFormat() {
		return shortFormat;
	}

	@JsonProperty("shortFormat")
	public void setShortFormat(boolean shortFormat) {
		this.shortFormat = shortFormat;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}