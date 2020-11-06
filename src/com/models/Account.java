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
@JsonPropertyOrder({ "securitiesAccount" })
public class Account {

	@JsonProperty("securitiesAccount")
	private SecuritiesAccount securitiesAccount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Account() {
	}

	/**
	 *
	 * @param securitiesAccount
	 */
	public Account(SecuritiesAccount securitiesAccount) {
		super();
		this.securitiesAccount = securitiesAccount;
	}

	@JsonProperty("securitiesAccount")
	public SecuritiesAccount getSecuritiesAccount() {
		return securitiesAccount;
	}

	@JsonProperty("securitiesAccount")
	public void setSecuritiesAccount(SecuritiesAccount securitiesAccount) {
		this.securitiesAccount = securitiesAccount;
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