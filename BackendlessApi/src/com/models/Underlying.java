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
@JsonPropertyOrder({ "ask", "askSize", "bid", "bidSize", "change", "close", "delayed", "description", "exchangeName",
		"fiftyTwoWeekHigh", "fiftyTwoWeekLow", "highPrice", "last", "lowPrice", "mark", "markChange",
		"markPercentChange", "openPrice", "percentChange", "quoteTime", "symbol", "totalVolume", "tradeTime" })
public class Underlying {

	@JsonProperty("ask")
	private long ask;
	@JsonProperty("askSize")
	private long askSize;
	@JsonProperty("bid")
	private long bid;
	@JsonProperty("bidSize")
	private long bidSize;
	@JsonProperty("change")
	private long change;
	@JsonProperty("close")
	private long close;
	@JsonProperty("delayed")
	private boolean delayed;
	@JsonProperty("description")
	private String description;
	@JsonProperty("exchangeName")
	private String exchangeName;
	@JsonProperty("fiftyTwoWeekHigh")
	private long fiftyTwoWeekHigh;
	@JsonProperty("fiftyTwoWeekLow")
	private long fiftyTwoWeekLow;
	@JsonProperty("highPrice")
	private long highPrice;
	@JsonProperty("last")
	private long last;
	@JsonProperty("lowPrice")
	private long lowPrice;
	@JsonProperty("mark")
	private long mark;
	@JsonProperty("markChange")
	private long markChange;
	@JsonProperty("markPercentChange")
	private long markPercentChange;
	@JsonProperty("openPrice")
	private long openPrice;
	@JsonProperty("percentChange")
	private long percentChange;
	@JsonProperty("quoteTime")
	private long quoteTime;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("totalVolume")
	private long totalVolume;
	@JsonProperty("tradeTime")
	private long tradeTime;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Underlying() {
	}

	/**
	 *
	 * @param markPercentChange
	 * @param fiftyTwoWeekLow
	 * @param askSize
	 * @param symbol
	 * @param last
	 * @param tradeTime
	 * @param quoteTime
	 * @param delayed
	 * @param change
	 * @param exchangeName
	 * @param openPrice
	 * @param mark
	 * @param fiftyTwoWeekHigh
	 * @param lowPrice
	 * @param bidSize
	 * @param close
	 * @param totalVolume
	 * @param markChange
	 * @param percentChange
	 * @param description
	 * @param ask
	 * @param bid
	 * @param highPrice
	 */
	public Underlying(long ask, long askSize, long bid, long bidSize, long change, long close, boolean delayed,
			String description, String exchangeName, long fiftyTwoWeekHigh, long fiftyTwoWeekLow, long highPrice,
			long last, long lowPrice, long mark, long markChange, long markPercentChange, long openPrice,
			long percentChange, long quoteTime, String symbol, long totalVolume, long tradeTime) {
		super();
		this.ask = ask;
		this.askSize = askSize;
		this.bid = bid;
		this.bidSize = bidSize;
		this.change = change;
		this.close = close;
		this.delayed = delayed;
		this.description = description;
		this.exchangeName = exchangeName;
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
		this.highPrice = highPrice;
		this.last = last;
		this.lowPrice = lowPrice;
		this.mark = mark;
		this.markChange = markChange;
		this.markPercentChange = markPercentChange;
		this.openPrice = openPrice;
		this.percentChange = percentChange;
		this.quoteTime = quoteTime;
		this.symbol = symbol;
		this.totalVolume = totalVolume;
		this.tradeTime = tradeTime;
	}

	@JsonProperty("ask")
	public long getAsk() {
		return ask;
	}

	@JsonProperty("ask")
	public void setAsk(long ask) {
		this.ask = ask;
	}

	@JsonProperty("askSize")
	public long getAskSize() {
		return askSize;
	}

	@JsonProperty("askSize")
	public void setAskSize(long askSize) {
		this.askSize = askSize;
	}

	@JsonProperty("bid")
	public long getBid() {
		return bid;
	}

	@JsonProperty("bid")
	public void setBid(long bid) {
		this.bid = bid;
	}

	@JsonProperty("bidSize")
	public long getBidSize() {
		return bidSize;
	}

	@JsonProperty("bidSize")
	public void setBidSize(long bidSize) {
		this.bidSize = bidSize;
	}

	@JsonProperty("change")
	public long getChange() {
		return change;
	}

	@JsonProperty("change")
	public void setChange(long change) {
		this.change = change;
	}

	@JsonProperty("close")
	public long getClose() {
		return close;
	}

	@JsonProperty("close")
	public void setClose(long close) {
		this.close = close;
	}

	@JsonProperty("delayed")
	public boolean isDelayed() {
		return delayed;
	}

	@JsonProperty("delayed")
	public void setDelayed(boolean delayed) {
		this.delayed = delayed;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("exchangeName")
	public String getExchangeName() {
		return exchangeName;
	}

	@JsonProperty("exchangeName")
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	@JsonProperty("fiftyTwoWeekHigh")
	public long getFiftyTwoWeekHigh() {
		return fiftyTwoWeekHigh;
	}

	@JsonProperty("fiftyTwoWeekHigh")
	public void setFiftyTwoWeekHigh(long fiftyTwoWeekHigh) {
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
	}

	@JsonProperty("fiftyTwoWeekLow")
	public long getFiftyTwoWeekLow() {
		return fiftyTwoWeekLow;
	}

	@JsonProperty("fiftyTwoWeekLow")
	public void setFiftyTwoWeekLow(long fiftyTwoWeekLow) {
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
	}

	@JsonProperty("highPrice")
	public long getHighPrice() {
		return highPrice;
	}

	@JsonProperty("highPrice")
	public void setHighPrice(long highPrice) {
		this.highPrice = highPrice;
	}

	@JsonProperty("last")
	public long getLast() {
		return last;
	}

	@JsonProperty("last")
	public void setLast(long last) {
		this.last = last;
	}

	@JsonProperty("lowPrice")
	public long getLowPrice() {
		return lowPrice;
	}

	@JsonProperty("lowPrice")
	public void setLowPrice(long lowPrice) {
		this.lowPrice = lowPrice;
	}

	@JsonProperty("mark")
	public long getMark() {
		return mark;
	}

	@JsonProperty("mark")
	public void setMark(long mark) {
		this.mark = mark;
	}

	@JsonProperty("markChange")
	public long getMarkChange() {
		return markChange;
	}

	@JsonProperty("markChange")
	public void setMarkChange(long markChange) {
		this.markChange = markChange;
	}

	@JsonProperty("markPercentChange")
	public long getMarkPercentChange() {
		return markPercentChange;
	}

	@JsonProperty("markPercentChange")
	public void setMarkPercentChange(long markPercentChange) {
		this.markPercentChange = markPercentChange;
	}

	@JsonProperty("openPrice")
	public long getOpenPrice() {
		return openPrice;
	}

	@JsonProperty("openPrice")
	public void setOpenPrice(long openPrice) {
		this.openPrice = openPrice;
	}

	@JsonProperty("percentChange")
	public long getPercentChange() {
		return percentChange;
	}

	@JsonProperty("percentChange")
	public void setPercentChange(long percentChange) {
		this.percentChange = percentChange;
	}

	@JsonProperty("quoteTime")
	public long getQuoteTime() {
		return quoteTime;
	}

	@JsonProperty("quoteTime")
	public void setQuoteTime(long quoteTime) {
		this.quoteTime = quoteTime;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("totalVolume")
	public long getTotalVolume() {
		return totalVolume;
	}

	@JsonProperty("totalVolume")
	public void setTotalVolume(long totalVolume) {
		this.totalVolume = totalVolume;
	}

	@JsonProperty("tradeTime")
	public long getTradeTime() {
		return tradeTime;
	}

	@JsonProperty("tradeTime")
	public void setTradeTime(long tradeTime) {
		this.tradeTime = tradeTime;
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