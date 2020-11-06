package com.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "subject", "bodyparts", "to", "attachment" })
public class Email {

	@JsonProperty("subject")
	private String subject;
	@JsonProperty("bodyparts")
	private Bodyparts bodyparts;
	@JsonProperty("to")
	private List<String> to = null;
	@JsonProperty("attachment")
	private List<String> attachment = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Email() {
	}

	/**
	 *
	 * @param to
	 * @param bodyparts
	 * @param subject
	 * @param attachment
	 */
	public Email(String subject, Bodyparts bodyparts, List<String> to, List<String> attachment) {
		super();
		this.subject = subject;
		this.bodyparts = bodyparts;
		this.to = to;
		this.attachment = attachment;
	}

	@JsonProperty("subject")
	public String getSubject() {
		return subject;
	}

	@JsonProperty("subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@JsonProperty("bodyparts")
	public Bodyparts getBodyparts() {
		return bodyparts;
	}

	@JsonProperty("bodyparts")
	public void setBodyparts(Bodyparts bodyparts) {
		this.bodyparts = bodyparts;
	}

	@JsonProperty("to")
	public List<String> getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(List<String> to) {
		this.to = to;
	}

	@JsonProperty("attachment")
	public List<String> getAttachment() {
		return attachment;
	}

	@JsonProperty("attachment")
	public void setAttachment(List<String> attachment) {
		this.attachment = attachment;
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