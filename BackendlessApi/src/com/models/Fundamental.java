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
@JsonPropertyOrder({ "symbol", "high52", "low52", "dividendAmount", "dividendYield", "dividendDate", "peRatio",
		"pegRatio", "pbRatio", "prRatio", "pcfRatio", "grossMarginTTM", "grossMarginMRQ", "netProfitMarginTTM",
		"netProfitMarginMRQ", "operatingMarginTTM", "operatingMarginMRQ", "returnOnEquity", "returnOnAssets",
		"returnOnInvestment", "quickRatio", "currentRatio", "interestCoverage", "totalDebtToCapital", "ltDebtToEquity",
		"totalDebtToEquity", "epsTTM", "epsChangePercentTTM", "epsChangeYear", "epsChange", "revChangeYear",
		"revChangeTTM", "revChangeIn", "sharesOutstanding", "marketCapFloat", "marketCap", "bookValuePerShare",
		"shortIntToFloat", "shortIntDayToCover", "divGrowthRate3Year", "dividendPayAmount", "dividendPayDate", "beta",
		"vol1DayAvg", "vol10DayAvg", "vol3MonthAvg" })
public class Fundamental {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("high52")
	private double high52;
	@JsonProperty("low52")
	private double low52;
	@JsonProperty("dividendAmount")
	private double dividendAmount;
	@JsonProperty("dividendYield")
	private double dividendYield;
	@JsonProperty("dividendDate")
	private String dividendDate;
	@JsonProperty("peRatio")
	private double peRatio;
	@JsonProperty("pegRatio")
	private double pegRatio;
	@JsonProperty("pbRatio")
	private double pbRatio;
	@JsonProperty("prRatio")
	private double prRatio;
	@JsonProperty("pcfRatio")
	private double pcfRatio;
	@JsonProperty("grossMarginTTM")
	private int grossMarginTTM;
	@JsonProperty("grossMarginMRQ")
	private int grossMarginMRQ;
	@JsonProperty("netProfitMarginTTM")
	private double netProfitMarginTTM;
	@JsonProperty("netProfitMarginMRQ")
	private double netProfitMarginMRQ;
	@JsonProperty("operatingMarginTTM")
	private double operatingMarginTTM;
	@JsonProperty("operatingMarginMRQ")
	private double operatingMarginMRQ;
	@JsonProperty("returnOnEquity")
	private double returnOnEquity;
	@JsonProperty("returnOnAssets")
	private double returnOnAssets;
	@JsonProperty("returnOnInvestment")
	private double returnOnInvestment;
	@JsonProperty("quickRatio")
	private int quickRatio;
	@JsonProperty("currentRatio")
	private double currentRatio;
	@JsonProperty("interestCoverage")
	private double interestCoverage;
	@JsonProperty("totalDebtToCapital")
	private double totalDebtToCapital;
	@JsonProperty("ltDebtToEquity")
	private double ltDebtToEquity;
	@JsonProperty("totalDebtToEquity")
	private double totalDebtToEquity;
	@JsonProperty("epsTTM")
	private double epsTTM;
	@JsonProperty("epsChangePercentTTM")
	private double epsChangePercentTTM;
	@JsonProperty("epsChangeYear")
	private double epsChangeYear;
	@JsonProperty("epsChange")
	private int epsChange;
	@JsonProperty("revChangeYear")
	private int revChangeYear;
	@JsonProperty("revChangeTTM")
	private double revChangeTTM;
	@JsonProperty("revChangeIn")
	private double revChangeIn;
	@JsonProperty("sharesOutstanding")
	private double sharesOutstanding;
	@JsonProperty("marketCapFloat")
	private double marketCapFloat;
	@JsonProperty("marketCap")
	private double marketCap;
	@JsonProperty("bookValuePerShare")
	private double bookValuePerShare;
	@JsonProperty("shortIntToFloat")
	private int shortIntToFloat;
	@JsonProperty("shortIntDayToCover")
	private int shortIntDayToCover;
	@JsonProperty("divGrowthRate3Year")
	private int divGrowthRate3Year;
	@JsonProperty("dividendPayAmount")
	private double dividendPayAmount;
	@JsonProperty("dividendPayDate")
	private String dividendPayDate;
	@JsonProperty("beta")
	private double beta;
	@JsonProperty("vol1DayAvg")
	private int vol1DayAvg;
	@JsonProperty("vol10DayAvg")
	private int vol10DayAvg;
	@JsonProperty("vol3MonthAvg")
	private int vol3MonthAvg;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Fundamental() {
	}

	/**
	 *
	 * @param quickRatio
	 * @param bookValuePerShare
	 * @param peRatio
	 * @param dividendAmount
	 * @param vol3MonthAvg
	 * @param ltDebtToEquity
	 * @param netProfitMarginTTM
	 * @param shortIntDayToCover
	 * @param revChangeYear
	 * @param sharesOutstanding
	 * @param pcfRatio
	 * @param pbRatio
	 * @param high52
	 * @param beta
	 * @param dividendYield
	 * @param shortIntToFloat
	 * @param returnOnAssets
	 * @param epsChangePercentTTM
	 * @param low52
	 * @param interestCoverage
	 * @param epsChangeYear
	 * @param revChangeIn
	 * @param netProfitMarginMRQ
	 * @param pegRatio
	 * @param marketCapFloat
	 * @param marketCap
	 * @param grossMarginMRQ
	 * @param symbol
	 * @param dividendPayDate
	 * @param prRatio
	 * @param revChangeTTM
	 * @param dividendDate
	 * @param returnOnInvestment
	 * @param totalDebtToCapital
	 * @param grossMarginTTM
	 * @param totalDebtToEquity
	 * @param divGrowthRate3Year
	 * @param epsChange
	 * @param dividendPayAmount
	 * @param returnOnEquity
	 * @param vol10DayAvg
	 * @param vol1DayAvg
	 * @param operatingMarginTTM
	 * @param currentRatio
	 * @param epsTTM
	 * @param operatingMarginMRQ
	 */
	public Fundamental(String symbol, double high52, double low52, double dividendAmount, double dividendYield,
			String dividendDate, double peRatio, double pegRatio, double pbRatio, double prRatio, double pcfRatio,
			int grossMarginTTM, int grossMarginMRQ, double netProfitMarginTTM, double netProfitMarginMRQ,
			double operatingMarginTTM, double operatingMarginMRQ, double returnOnEquity, double returnOnAssets,
			double returnOnInvestment, int quickRatio, double currentRatio, double interestCoverage,
			double totalDebtToCapital, double ltDebtToEquity, double totalDebtToEquity, double epsTTM,
			double epsChangePercentTTM, double epsChangeYear, int epsChange, int revChangeYear, double revChangeTTM,
			double revChangeIn, double sharesOutstanding, double marketCapFloat, double marketCap,
			double bookValuePerShare, int shortIntToFloat, int shortIntDayToCover, int divGrowthRate3Year,
			double dividendPayAmount, String dividendPayDate, double beta, int vol1DayAvg, int vol10DayAvg,
			int vol3MonthAvg) {
		super();
		this.symbol = symbol;
		this.high52 = high52;
		this.low52 = low52;
		this.dividendAmount = dividendAmount;
		this.dividendYield = dividendYield;
		this.dividendDate = dividendDate;
		this.peRatio = peRatio;
		this.pegRatio = pegRatio;
		this.pbRatio = pbRatio;
		this.prRatio = prRatio;
		this.pcfRatio = pcfRatio;
		this.grossMarginTTM = grossMarginTTM;
		this.grossMarginMRQ = grossMarginMRQ;
		this.netProfitMarginTTM = netProfitMarginTTM;
		this.netProfitMarginMRQ = netProfitMarginMRQ;
		this.operatingMarginTTM = operatingMarginTTM;
		this.operatingMarginMRQ = operatingMarginMRQ;
		this.returnOnEquity = returnOnEquity;
		this.returnOnAssets = returnOnAssets;
		this.returnOnInvestment = returnOnInvestment;
		this.quickRatio = quickRatio;
		this.currentRatio = currentRatio;
		this.interestCoverage = interestCoverage;
		this.totalDebtToCapital = totalDebtToCapital;
		this.ltDebtToEquity = ltDebtToEquity;
		this.totalDebtToEquity = totalDebtToEquity;
		this.epsTTM = epsTTM;
		this.epsChangePercentTTM = epsChangePercentTTM;
		this.epsChangeYear = epsChangeYear;
		this.epsChange = epsChange;
		this.revChangeYear = revChangeYear;
		this.revChangeTTM = revChangeTTM;
		this.revChangeIn = revChangeIn;
		this.sharesOutstanding = sharesOutstanding;
		this.marketCapFloat = marketCapFloat;
		this.marketCap = marketCap;
		this.bookValuePerShare = bookValuePerShare;
		this.shortIntToFloat = shortIntToFloat;
		this.shortIntDayToCover = shortIntDayToCover;
		this.divGrowthRate3Year = divGrowthRate3Year;
		this.dividendPayAmount = dividendPayAmount;
		this.dividendPayDate = dividendPayDate;
		this.beta = beta;
		this.vol1DayAvg = vol1DayAvg;
		this.vol10DayAvg = vol10DayAvg;
		this.vol3MonthAvg = vol3MonthAvg;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("high52")
	public double getHigh52() {
		return high52;
	}

	@JsonProperty("high52")
	public void setHigh52(double high52) {
		this.high52 = high52;
	}

	@JsonProperty("low52")
	public double getLow52() {
		return low52;
	}

	@JsonProperty("low52")
	public void setLow52(double low52) {
		this.low52 = low52;
	}

	@JsonProperty("dividendAmount")
	public double getDividendAmount() {
		return dividendAmount;
	}

	@JsonProperty("dividendAmount")
	public void setDividendAmount(double dividendAmount) {
		this.dividendAmount = dividendAmount;
	}

	@JsonProperty("dividendYield")
	public double getDividendYield() {
		return dividendYield;
	}

	@JsonProperty("dividendYield")
	public void setDividendYield(double dividendYield) {
		this.dividendYield = dividendYield;
	}

	@JsonProperty("dividendDate")
	public String getDividendDate() {
		return dividendDate;
	}

	@JsonProperty("dividendDate")
	public void setDividendDate(String dividendDate) {
		this.dividendDate = dividendDate;
	}

	@JsonProperty("peRatio")
	public double getPeRatio() {
		return peRatio;
	}

	@JsonProperty("peRatio")
	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}

	@JsonProperty("pegRatio")
	public double getPegRatio() {
		return pegRatio;
	}

	@JsonProperty("pegRatio")
	public void setPegRatio(double pegRatio) {
		this.pegRatio = pegRatio;
	}

	@JsonProperty("pbRatio")
	public double getPbRatio() {
		return pbRatio;
	}

	@JsonProperty("pbRatio")
	public void setPbRatio(double pbRatio) {
		this.pbRatio = pbRatio;
	}

	@JsonProperty("prRatio")
	public double getPrRatio() {
		return prRatio;
	}

	@JsonProperty("prRatio")
	public void setPrRatio(double prRatio) {
		this.prRatio = prRatio;
	}

	@JsonProperty("pcfRatio")
	public double getPcfRatio() {
		return pcfRatio;
	}

	@JsonProperty("pcfRatio")
	public void setPcfRatio(double pcfRatio) {
		this.pcfRatio = pcfRatio;
	}

	@JsonProperty("grossMarginTTM")
	public int getGrossMarginTTM() {
		return grossMarginTTM;
	}

	@JsonProperty("grossMarginTTM")
	public void setGrossMarginTTM(int grossMarginTTM) {
		this.grossMarginTTM = grossMarginTTM;
	}

	@JsonProperty("grossMarginMRQ")
	public int getGrossMarginMRQ() {
		return grossMarginMRQ;
	}

	@JsonProperty("grossMarginMRQ")
	public void setGrossMarginMRQ(int grossMarginMRQ) {
		this.grossMarginMRQ = grossMarginMRQ;
	}

	@JsonProperty("netProfitMarginTTM")
	public double getNetProfitMarginTTM() {
		return netProfitMarginTTM;
	}

	@JsonProperty("netProfitMarginTTM")
	public void setNetProfitMarginTTM(double netProfitMarginTTM) {
		this.netProfitMarginTTM = netProfitMarginTTM;
	}

	@JsonProperty("netProfitMarginMRQ")
	public double getNetProfitMarginMRQ() {
		return netProfitMarginMRQ;
	}

	@JsonProperty("netProfitMarginMRQ")
	public void setNetProfitMarginMRQ(double netProfitMarginMRQ) {
		this.netProfitMarginMRQ = netProfitMarginMRQ;
	}

	@JsonProperty("operatingMarginTTM")
	public double getOperatingMarginTTM() {
		return operatingMarginTTM;
	}

	@JsonProperty("operatingMarginTTM")
	public void setOperatingMarginTTM(double operatingMarginTTM) {
		this.operatingMarginTTM = operatingMarginTTM;
	}

	@JsonProperty("operatingMarginMRQ")
	public double getOperatingMarginMRQ() {
		return operatingMarginMRQ;
	}

	@JsonProperty("operatingMarginMRQ")
	public void setOperatingMarginMRQ(double operatingMarginMRQ) {
		this.operatingMarginMRQ = operatingMarginMRQ;
	}

	@JsonProperty("returnOnEquity")
	public double getReturnOnEquity() {
		return returnOnEquity;
	}

	@JsonProperty("returnOnEquity")
	public void setReturnOnEquity(double returnOnEquity) {
		this.returnOnEquity = returnOnEquity;
	}

	@JsonProperty("returnOnAssets")
	public double getReturnOnAssets() {
		return returnOnAssets;
	}

	@JsonProperty("returnOnAssets")
	public void setReturnOnAssets(double returnOnAssets) {
		this.returnOnAssets = returnOnAssets;
	}

	@JsonProperty("returnOnInvestment")
	public double getReturnOnInvestment() {
		return returnOnInvestment;
	}

	@JsonProperty("returnOnInvestment")
	public void setReturnOnInvestment(double returnOnInvestment) {
		this.returnOnInvestment = returnOnInvestment;
	}

	@JsonProperty("quickRatio")
	public int getQuickRatio() {
		return quickRatio;
	}

	@JsonProperty("quickRatio")
	public void setQuickRatio(int quickRatio) {
		this.quickRatio = quickRatio;
	}

	@JsonProperty("currentRatio")
	public double getCurrentRatio() {
		return currentRatio;
	}

	@JsonProperty("currentRatio")
	public void setCurrentRatio(double currentRatio) {
		this.currentRatio = currentRatio;
	}

	@JsonProperty("interestCoverage")
	public double getInterestCoverage() {
		return interestCoverage;
	}

	@JsonProperty("interestCoverage")
	public void setInterestCoverage(double interestCoverage) {
		this.interestCoverage = interestCoverage;
	}

	@JsonProperty("totalDebtToCapital")
	public double getTotalDebtToCapital() {
		return totalDebtToCapital;
	}

	@JsonProperty("totalDebtToCapital")
	public void setTotalDebtToCapital(double totalDebtToCapital) {
		this.totalDebtToCapital = totalDebtToCapital;
	}

	@JsonProperty("ltDebtToEquity")
	public double getLtDebtToEquity() {
		return ltDebtToEquity;
	}

	@JsonProperty("ltDebtToEquity")
	public void setLtDebtToEquity(double ltDebtToEquity) {
		this.ltDebtToEquity = ltDebtToEquity;
	}

	@JsonProperty("totalDebtToEquity")
	public double getTotalDebtToEquity() {
		return totalDebtToEquity;
	}

	@JsonProperty("totalDebtToEquity")
	public void setTotalDebtToEquity(double totalDebtToEquity) {
		this.totalDebtToEquity = totalDebtToEquity;
	}

	@JsonProperty("epsTTM")
	public double getEpsTTM() {
		return epsTTM;
	}

	@JsonProperty("epsTTM")
	public void setEpsTTM(double epsTTM) {
		this.epsTTM = epsTTM;
	}

	@JsonProperty("epsChangePercentTTM")
	public double getEpsChangePercentTTM() {
		return epsChangePercentTTM;
	}

	@JsonProperty("epsChangePercentTTM")
	public void setEpsChangePercentTTM(double epsChangePercentTTM) {
		this.epsChangePercentTTM = epsChangePercentTTM;
	}

	@JsonProperty("epsChangeYear")
	public double getEpsChangeYear() {
		return epsChangeYear;
	}

	@JsonProperty("epsChangeYear")
	public void setEpsChangeYear(double epsChangeYear) {
		this.epsChangeYear = epsChangeYear;
	}

	@JsonProperty("epsChange")
	public int getEpsChange() {
		return epsChange;
	}

	@JsonProperty("epsChange")
	public void setEpsChange(int epsChange) {
		this.epsChange = epsChange;
	}

	@JsonProperty("revChangeYear")
	public int getRevChangeYear() {
		return revChangeYear;
	}

	@JsonProperty("revChangeYear")
	public void setRevChangeYear(int revChangeYear) {
		this.revChangeYear = revChangeYear;
	}

	@JsonProperty("revChangeTTM")
	public double getRevChangeTTM() {
		return revChangeTTM;
	}

	@JsonProperty("revChangeTTM")
	public void setRevChangeTTM(double revChangeTTM) {
		this.revChangeTTM = revChangeTTM;
	}

	@JsonProperty("revChangeIn")
	public double getRevChangeIn() {
		return revChangeIn;
	}

	@JsonProperty("revChangeIn")
	public void setRevChangeIn(double revChangeIn) {
		this.revChangeIn = revChangeIn;
	}

	@JsonProperty("sharesOutstanding")
	public double getSharesOutstanding() {
		return sharesOutstanding;
	}

	@JsonProperty("sharesOutstanding")
	public void setSharesOutstanding(double sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}

	@JsonProperty("marketCapFloat")
	public double getMarketCapFloat() {
		return marketCapFloat;
	}

	@JsonProperty("marketCapFloat")
	public void setMarketCapFloat(double marketCapFloat) {
		this.marketCapFloat = marketCapFloat;
	}

	@JsonProperty("marketCap")
	public double getMarketCap() {
		return marketCap;
	}

	@JsonProperty("marketCap")
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	@JsonProperty("bookValuePerShare")
	public double getBookValuePerShare() {
		return bookValuePerShare;
	}

	@JsonProperty("bookValuePerShare")
	public void setBookValuePerShare(double bookValuePerShare) {
		this.bookValuePerShare = bookValuePerShare;
	}

	@JsonProperty("shortIntToFloat")
	public int getShortIntToFloat() {
		return shortIntToFloat;
	}

	@JsonProperty("shortIntToFloat")
	public void setShortIntToFloat(int shortIntToFloat) {
		this.shortIntToFloat = shortIntToFloat;
	}

	@JsonProperty("shortIntDayToCover")
	public int getShortIntDayToCover() {
		return shortIntDayToCover;
	}

	@JsonProperty("shortIntDayToCover")
	public void setShortIntDayToCover(int shortIntDayToCover) {
		this.shortIntDayToCover = shortIntDayToCover;
	}

	@JsonProperty("divGrowthRate3Year")
	public int getDivGrowthRate3Year() {
		return divGrowthRate3Year;
	}

	@JsonProperty("divGrowthRate3Year")
	public void setDivGrowthRate3Year(int divGrowthRate3Year) {
		this.divGrowthRate3Year = divGrowthRate3Year;
	}

	@JsonProperty("dividendPayAmount")
	public double getDividendPayAmount() {
		return dividendPayAmount;
	}

	@JsonProperty("dividendPayAmount")
	public void setDividendPayAmount(double dividendPayAmount) {
		this.dividendPayAmount = dividendPayAmount;
	}

	@JsonProperty("dividendPayDate")
	public String getDividendPayDate() {
		return dividendPayDate;
	}

	@JsonProperty("dividendPayDate")
	public void setDividendPayDate(String dividendPayDate) {
		this.dividendPayDate = dividendPayDate;
	}

	@JsonProperty("beta")
	public double getBeta() {
		return beta;
	}

	@JsonProperty("beta")
	public void setBeta(double beta) {
		this.beta = beta;
	}

	@JsonProperty("vol1DayAvg")
	public int getVol1DayAvg() {
		return vol1DayAvg;
	}

	@JsonProperty("vol1DayAvg")
	public void setVol1DayAvg(int vol1DayAvg) {
		this.vol1DayAvg = vol1DayAvg;
	}

	@JsonProperty("vol10DayAvg")
	public int getVol10DayAvg() {
		return vol10DayAvg;
	}

	@JsonProperty("vol10DayAvg")
	public void setVol10DayAvg(int vol10DayAvg) {
		this.vol10DayAvg = vol10DayAvg;
	}

	@JsonProperty("vol3MonthAvg")
	public int getVol3MonthAvg() {
		return vol3MonthAvg;
	}

	@JsonProperty("vol3MonthAvg")
	public void setVol3MonthAvg(int vol3MonthAvg) {
		this.vol3MonthAvg = vol3MonthAvg;
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