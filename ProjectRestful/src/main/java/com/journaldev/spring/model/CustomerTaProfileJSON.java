package com.journaldev.spring.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"customerTaProfile"
})
public class CustomerTaProfileJSON implements Serializable
{

@JsonProperty("customerTaProfile")
private CustomerTaProfile customerTaProfile;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 1678331218286031030L;
private Date createdDate;

@JsonProperty("customerTaProfile")
public CustomerTaProfile getCustomerTaProfile() {
return customerTaProfile;
}

@JsonProperty("customerTaProfile")
public void setCustomerTaProfile(CustomerTaProfile customerTaProfile) {
this.customerTaProfile = customerTaProfile;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@JsonSerialize(using=DateSerializer.class)
public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = new Date(System.currentTimeMillis());
	
}

}