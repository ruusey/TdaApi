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
@JsonPropertyOrder({ "textmessage", "htmlmessage" })
public class Bodyparts {

	@JsonProperty("textmessage")
	private String textmessage;
	@JsonProperty("htmlmessage")
	private String htmlmessage;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Bodyparts() {
	}

	/**
	 *
	 * @param textmessage
	 * @param htmlmessage
	 */
	public Bodyparts(String textmessage, String htmlmessage) {
		super();
		this.textmessage = textmessage;
		this.htmlmessage = htmlmessage;
	}

	@JsonProperty("textmessage")
	public String getTextmessage() {
		return textmessage;
	}

	@JsonProperty("textmessage")
	public void setTextmessage(String textmessage) {
		this.textmessage = textmessage;
	}

	@JsonProperty("htmlmessage")
	public String getHtmlmessage() {
		return htmlmessage;
	}

	@JsonProperty("htmlmessage")
	public void setHtmlmessage(String htmlmessage) {
		this.htmlmessage = htmlmessage;
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