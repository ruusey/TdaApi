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
@JsonPropertyOrder({ "assetType", "symbol", "description", "bidPrice", "bidSize", "bidId", "askPrice", "askSize",
		"askId", "lastPrice", "lastSize", "lastId", "openPrice", "highPrice", "lowPrice", "bidTick", "closePrice",
		"netChange", "totalVolume", "quoteTimeInLong", "tradeTimeInLong", "mark", "exchange", "exchangeName",
		"marginable", "shortable", "volatility", "digits", "52WkHigh", "52WkLow", "nAV", "peRatio", "divAmount",
		"divYield", "divDate", "securityStatus", "regularMarketLastPrice", "regularMarketLastSize",
		"regularMarketNetChange", "regularMarketTradeTimeInLong", "netPercentChangeInDouble", "markChangeInDouble",
		"markPercentChangeInDouble", "regularMarketPercentChangeInDouble", "delayed" })
public class Quote {

	@JsonProperty("assetType")
	private String assetType;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("description")
	private String description;
	@JsonProperty("bidPrice")
	private double bidPrice;
	@JsonProperty("bidSize")
	private int bidSize;
	@JsonProperty("bidId")
	private String bidId;
	@JsonProperty("askPrice")
	private double askPrice;
	@JsonProperty("askSize")
	private int askSize;
	@JsonProperty("askId")
	private String askId;
	@JsonProperty("lastPrice")
	private double lastPrice;
	@JsonProperty("lastSize")
	private int lastSize;
	@JsonProperty("lastId")
	private String lastId;
	@JsonProperty("openPrice")
	private double openPrice;
	@JsonProperty("highPrice")
	private double highPrice;
	@JsonProperty("lowPrice")
	private double lowPrice;
	@JsonProperty("bidTick")
	private String bidTick;
	@JsonProperty("closePrice")
	private double closePrice;
	@JsonProperty("netChange")
	private double netChange;
	@JsonProperty("totalVolume")
	private int totalVolume;
	@JsonProperty("quoteTimeInLong")
	private int quoteTimeInLong;
	@JsonProperty("tradeTimeInLong")
	private int tradeTimeInLong;
	@JsonProperty("mark")
	private double mark;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("exchangeName")
	private String exchangeName;
	@JsonProperty("marginable")
	private boolean marginable;
	@JsonProperty("shortable")
	private boolean shortable;
	@JsonProperty("volatility")
	private double volatility;
	@JsonProperty("digits")
	private int digits;
	@JsonProperty("52WkHigh")
	private double _52WkHigh;
	@JsonProperty("52WkLow")
	private double _52WkLow;
	@JsonProperty("nAV")
	private int nAV;
	@JsonProperty("peRatio")
	private double peRatio;
	@JsonProperty("divAmount")
	private double divAmount;
	@JsonProperty("divYield")
	private double divYield;
	@JsonProperty("divDate")
	private String divDate;
	@JsonProperty("securityStatus")
	private String securityStatus;
	@JsonProperty("regularMarketLastPrice")
	private double regularMarketLastPrice;
	@JsonProperty("regularMarketLastSize")
	private int regularMarketLastSize;
	@JsonProperty("regularMarketNetChange")
	private double regularMarketNetChange;
	@JsonProperty("regularMarketTradeTimeInLong")
	private int regularMarketTradeTimeInLong;
	@JsonProperty("netPercentChangeInDouble")
	private double netPercentChangeInDouble;
	@JsonProperty("markChangeInDouble")
	private double markChangeInDouble;
	@JsonProperty("markPercentChangeInDouble")
	private double markPercentChangeInDouble;
	@JsonProperty("regularMarketPercentChangeInDouble")
	private double regularMarketPercentChangeInDouble;
	@JsonProperty("delayed")
	private boolean delayed;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Quote() {
	}

	/**
	 *
	 * @param markChangeInDouble
	 * @param peRatio
	 * @param askSize
	 * @param divAmount
	 * @param regularMarketLastPrice
	 * @param marginable
	 * @param bidTick
	 * @param exchangeName
	 * @param openPrice
	 * @param volatility
	 * @param bidPrice
	 * @param closePrice
	 * @param totalVolume
	 * @param assetType
	 * @param _52WkHigh
	 * @param description
	 * @param _52WkLow
	 * @param netPercentChangeInDouble
	 * @param digits
	 * @param askId
	 * @param exchange
	 * @param nAV
	 * @param regularMarketLastSize
	 * @param symbol
	 * @param delayed
	 * @param divDate
	 * @param lastPrice
	 * @param mark
	 * @param regularMarketTradeTimeInLong
	 * @param bidSize
	 * @param lowPrice
	 * @param quoteTimeInLong
	 * @param regularMarketNetChange
	 * @param securityStatus
	 * @param tradeTimeInLong
	 * @param regularMarketPercentChangeInDouble
	 * @param markPercentChangeInDouble
	 * @param divYield
	 * @param netChange
	 * @param lastId
	 * @param bidId
	 * @param highPrice
	 * @param shortable
	 * @param askPrice
	 * @param lastSize
	 */
	public Quote(String assetType, String symbol, String description, double bidPrice, int bidSize, String bidId,
			double askPrice, int askSize, String askId, double lastPrice, int lastSize, String lastId, double openPrice,
			double highPrice, double lowPrice, String bidTick, double closePrice, double netChange, int totalVolume,
			int quoteTimeInLong, int tradeTimeInLong, double mark, String exchange, String exchangeName,
			boolean marginable, boolean shortable, double volatility, int digits, double _52WkHigh, double _52WkLow,
			int nAV, double peRatio, double divAmount, double divYield, String divDate, String securityStatus,
			double regularMarketLastPrice, int regularMarketLastSize, double regularMarketNetChange,
			int regularMarketTradeTimeInLong, double netPercentChangeInDouble, double markChangeInDouble,
			double markPercentChangeInDouble, double regularMarketPercentChangeInDouble, boolean delayed) {
		super();
		this.assetType = assetType;
		this.symbol = symbol;
		this.description = description;
		this.bidPrice = bidPrice;
		this.bidSize = bidSize;
		this.bidId = bidId;
		this.askPrice = askPrice;
		this.askSize = askSize;
		this.askId = askId;
		this.lastPrice = lastPrice;
		this.lastSize = lastSize;
		this.lastId = lastId;
		this.openPrice = openPrice;
		this.highPrice = highPrice;
		this.lowPrice = lowPrice;
		this.bidTick = bidTick;
		this.closePrice = closePrice;
		this.netChange = netChange;
		this.totalVolume = totalVolume;
		this.quoteTimeInLong = quoteTimeInLong;
		this.tradeTimeInLong = tradeTimeInLong;
		this.mark = mark;
		this.exchange = exchange;
		this.exchangeName = exchangeName;
		this.marginable = marginable;
		this.shortable = shortable;
		this.volatility = volatility;
		this.digits = digits;
		this._52WkHigh = _52WkHigh;
		this._52WkLow = _52WkLow;
		this.nAV = nAV;
		this.peRatio = peRatio;
		this.divAmount = divAmount;
		this.divYield = divYield;
		this.divDate = divDate;
		this.securityStatus = securityStatus;
		this.regularMarketLastPrice = regularMarketLastPrice;
		this.regularMarketLastSize = regularMarketLastSize;
		this.regularMarketNetChange = regularMarketNetChange;
		this.regularMarketTradeTimeInLong = regularMarketTradeTimeInLong;
		this.netPercentChangeInDouble = netPercentChangeInDouble;
		this.markChangeInDouble = markChangeInDouble;
		this.markPercentChangeInDouble = markPercentChangeInDouble;
		this.regularMarketPercentChangeInDouble = regularMarketPercentChangeInDouble;
		this.delayed = delayed;
	}

	@JsonProperty("assetType")
	public String getAssetType() {
		return assetType;
	}

	@JsonProperty("assetType")
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("bidPrice")
	public double getBidPrice() {
		return bidPrice;
	}

	@JsonProperty("bidPrice")
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	@JsonProperty("bidSize")
	public int getBidSize() {
		return bidSize;
	}

	@JsonProperty("bidSize")
	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}

	@JsonProperty("bidId")
	public String getBidId() {
		return bidId;
	}

	@JsonProperty("bidId")
	public void setBidId(String bidId) {
		this.bidId = bidId;
	}

	@JsonProperty("askPrice")
	public double getAskPrice() {
		return askPrice;
	}

	@JsonProperty("askPrice")
	public void setAskPrice(double askPrice) {
		this.askPrice = askPrice;
	}

	@JsonProperty("askSize")
	public int getAskSize() {
		return askSize;
	}

	@JsonProperty("askSize")
	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}

	@JsonProperty("askId")
	public String getAskId() {
		return askId;
	}

	@JsonProperty("askId")
	public void setAskId(String askId) {
		this.askId = askId;
	}

	@JsonProperty("lastPrice")
	public double getLastPrice() {
		return lastPrice;
	}

	@JsonProperty("lastPrice")
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}

	@JsonProperty("lastSize")
	public int getLastSize() {
		return lastSize;
	}

	@JsonProperty("lastSize")
	public void setLastSize(int lastSize) {
		this.lastSize = lastSize;
	}

	@JsonProperty("lastId")
	public String getLastId() {
		return lastId;
	}

	@JsonProperty("lastId")
	public void setLastId(String lastId) {
		this.lastId = lastId;
	}

	@JsonProperty("openPrice")
	public double getOpenPrice() {
		return openPrice;
	}

	@JsonProperty("openPrice")
	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}

	@JsonProperty("highPrice")
	public double getHighPrice() {
		return highPrice;
	}

	@JsonProperty("highPrice")
	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}

	@JsonProperty("lowPrice")
	public double getLowPrice() {
		return lowPrice;
	}

	@JsonProperty("lowPrice")
	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}

	@JsonProperty("bidTick")
	public String getBidTick() {
		return bidTick;
	}

	@JsonProperty("bidTick")
	public void setBidTick(String bidTick) {
		this.bidTick = bidTick;
	}

	@JsonProperty("closePrice")
	public double getClosePrice() {
		return closePrice;
	}

	@JsonProperty("closePrice")
	public void setClosePrice(double closePrice) {
		this.closePrice = closePrice;
	}

	@JsonProperty("netChange")
	public double getNetChange() {
		return netChange;
	}

	@JsonProperty("netChange")
	public void setNetChange(double netChange) {
		this.netChange = netChange;
	}

	@JsonProperty("totalVolume")
	public int getTotalVolume() {
		return totalVolume;
	}

	@JsonProperty("totalVolume")
	public void setTotalVolume(int totalVolume) {
		this.totalVolume = totalVolume;
	}

	@JsonProperty("quoteTimeInLong")
	public int getQuoteTimeInLong() {
		return quoteTimeInLong;
	}

	@JsonProperty("quoteTimeInLong")
	public void setQuoteTimeInLong(int quoteTimeInLong) {
		this.quoteTimeInLong = quoteTimeInLong;
	}

	@JsonProperty("tradeTimeInLong")
	public int getTradeTimeInLong() {
		return tradeTimeInLong;
	}

	@JsonProperty("tradeTimeInLong")
	public void setTradeTimeInLong(int tradeTimeInLong) {
		this.tradeTimeInLong = tradeTimeInLong;
	}

	@JsonProperty("mark")
	public double getMark() {
		return mark;
	}

	@JsonProperty("mark")
	public void setMark(double mark) {
		this.mark = mark;
	}

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("exchangeName")
	public String getExchangeName() {
		return exchangeName;
	}

	@JsonProperty("exchangeName")
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	@JsonProperty("marginable")
	public boolean isMarginable() {
		return marginable;
	}

	@JsonProperty("marginable")
	public void setMarginable(boolean marginable) {
		this.marginable = marginable;
	}

	@JsonProperty("shortable")
	public boolean isShortable() {
		return shortable;
	}

	@JsonProperty("shortable")
	public void setShortable(boolean shortable) {
		this.shortable = shortable;
	}

	@JsonProperty("volatility")
	public double getVolatility() {
		return volatility;
	}

	@JsonProperty("volatility")
	public void setVolatility(double volatility) {
		this.volatility = volatility;
	}

	@JsonProperty("digits")
	public int getDigits() {
		return digits;
	}

	@JsonProperty("digits")
	public void setDigits(int digits) {
		this.digits = digits;
	}

	@JsonProperty("52WkHigh")
	public double get52WkHigh() {
		return _52WkHigh;
	}

	@JsonProperty("52WkHigh")
	public void set52WkHigh(double _52WkHigh) {
		this._52WkHigh = _52WkHigh;
	}

	@JsonProperty("52WkLow")
	public double get52WkLow() {
		return _52WkLow;
	}

	@JsonProperty("52WkLow")
	public void set52WkLow(double _52WkLow) {
		this._52WkLow = _52WkLow;
	}

	@JsonProperty("nAV")
	public int getNAV() {
		return nAV;
	}

	@JsonProperty("nAV")
	public void setNAV(int nAV) {
		this.nAV = nAV;
	}

	@JsonProperty("peRatio")
	public double getPeRatio() {
		return peRatio;
	}

	@JsonProperty("peRatio")
	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}

	@JsonProperty("divAmount")
	public double getDivAmount() {
		return divAmount;
	}

	@JsonProperty("divAmount")
	public void setDivAmount(double divAmount) {
		this.divAmount = divAmount;
	}

	@JsonProperty("divYield")
	public double getDivYield() {
		return divYield;
	}

	@JsonProperty("divYield")
	public void setDivYield(double divYield) {
		this.divYield = divYield;
	}

	@JsonProperty("divDate")
	public String getDivDate() {
		return divDate;
	}

	@JsonProperty("divDate")
	public void setDivDate(String divDate) {
		this.divDate = divDate;
	}

	@JsonProperty("securityStatus")
	public String getSecurityStatus() {
		return securityStatus;
	}

	@JsonProperty("securityStatus")
	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}

	@JsonProperty("regularMarketLastPrice")
	public double getRegularMarketLastPrice() {
		return regularMarketLastPrice;
	}

	@JsonProperty("regularMarketLastPrice")
	public void setRegularMarketLastPrice(double regularMarketLastPrice) {
		this.regularMarketLastPrice = regularMarketLastPrice;
	}

	@JsonProperty("regularMarketLastSize")
	public int getRegularMarketLastSize() {
		return regularMarketLastSize;
	}

	@JsonProperty("regularMarketLastSize")
	public void setRegularMarketLastSize(int regularMarketLastSize) {
		this.regularMarketLastSize = regularMarketLastSize;
	}

	@JsonProperty("regularMarketNetChange")
	public double getRegularMarketNetChange() {
		return regularMarketNetChange;
	}

	@JsonProperty("regularMarketNetChange")
	public void setRegularMarketNetChange(double regularMarketNetChange) {
		this.regularMarketNetChange = regularMarketNetChange;
	}

	@JsonProperty("regularMarketTradeTimeInLong")
	public int getRegularMarketTradeTimeInLong() {
		return regularMarketTradeTimeInLong;
	}

	@JsonProperty("regularMarketTradeTimeInLong")
	public void setRegularMarketTradeTimeInLong(int regularMarketTradeTimeInLong) {
		this.regularMarketTradeTimeInLong = regularMarketTradeTimeInLong;
	}

	@JsonProperty("netPercentChangeInDouble")
	public double getNetPercentChangeInDouble() {
		return netPercentChangeInDouble;
	}

	@JsonProperty("netPercentChangeInDouble")
	public void setNetPercentChangeInDouble(double netPercentChangeInDouble) {
		this.netPercentChangeInDouble = netPercentChangeInDouble;
	}

	@JsonProperty("markChangeInDouble")
	public double getMarkChangeInDouble() {
		return markChangeInDouble;
	}

	@JsonProperty("markChangeInDouble")
	public void setMarkChangeInDouble(double markChangeInDouble) {
		this.markChangeInDouble = markChangeInDouble;
	}

	@JsonProperty("markPercentChangeInDouble")
	public double getMarkPercentChangeInDouble() {
		return markPercentChangeInDouble;
	}

	@JsonProperty("markPercentChangeInDouble")
	public void setMarkPercentChangeInDouble(double markPercentChangeInDouble) {
		this.markPercentChangeInDouble = markPercentChangeInDouble;
	}

	@JsonProperty("regularMarketPercentChangeInDouble")
	public double getRegularMarketPercentChangeInDouble() {
		return regularMarketPercentChangeInDouble;
	}

	@JsonProperty("regularMarketPercentChangeInDouble")
	public void setRegularMarketPercentChangeInDouble(double regularMarketPercentChangeInDouble) {
		this.regularMarketPercentChangeInDouble = regularMarketPercentChangeInDouble;
	}

	@JsonProperty("delayed")
	public boolean isDelayed() {
		return delayed;
	}

	@JsonProperty("delayed")
	public void setDelayed(boolean delayed) {
		this.delayed = delayed;
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