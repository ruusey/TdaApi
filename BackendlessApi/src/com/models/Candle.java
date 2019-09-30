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
@JsonPropertyOrder({ "close", "datetime", "high", "low", "open", "volume" })
public class Candle {

	@JsonProperty("close")
	private int close;
	@JsonProperty("datetime")
	private int datetime;
	@JsonProperty("high")
	private int high;
	@JsonProperty("low")
	private int low;
	@JsonProperty("open")
	private int open;
	@JsonProperty("volume")
	private int volume;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Candle() {
	}

	/**
	 *
	 * @param open
	 * @param volume
	 * @param high
	 * @param low
	 * @param datetime
	 * @param close
	 */
	public Candle(int close, int datetime, int high, int low, int open, int volume) {
		super();
		this.close = close;
		this.datetime = datetime;
		this.high = high;
		this.low = low;
		this.open = open;
		this.volume = volume;
	}

	@JsonProperty("close")
	public int getClose() {
		return close;
	}

	@JsonProperty("close")
	public void setClose(int close) {
		this.close = close;
	}

	@JsonProperty("datetime")
	public int getDatetime() {
		return datetime;
	}

	@JsonProperty("datetime")
	public void setDatetime(int datetime) {
		this.datetime = datetime;
	}

	@JsonProperty("high")
	public int getHigh() {
		return high;
	}

	@JsonProperty("high")
	public void setHigh(int high) {
		this.high = high;
	}

	@JsonProperty("low")
	public int getLow() {
		return low;
	}

	@JsonProperty("low")
	public void setLow(int low) {
		this.low = low;
	}

	@JsonProperty("open")
	public int getOpen() {
		return open;
	}

	@JsonProperty("open")
	public void setOpen(int open) {
		this.open = open;
	}

	@JsonProperty("volume")
	public int getVolume() {
		return volume;
	}

	@JsonProperty("volume")
	public void setVolume(int volume) {
		this.volume = volume;
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