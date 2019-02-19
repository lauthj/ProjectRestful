package com.journaldev.spring.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"line1",
"line2",
"line3",
"city",
"stateCode",
"postalCode",
"countryCode"
})
public class Address implements Serializable
{

@JsonProperty("line1")
private String line1;
@JsonProperty("line2")
private String line2;
@JsonProperty("line3")
private String line3;
@JsonProperty("city")
private String city;
@JsonProperty("stateCode")
private String stateCode;
@JsonProperty("postalCode")
private String postalCode;
@JsonProperty("countryCode")
private String countryCode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 4067528230860329704L;

@JsonProperty("line1")
public String getLine1() {
return line1;
}

@JsonProperty("line1")
public void setLine1(String line1) {
this.line1 = line1;
}

@JsonProperty("line2")
public String getLine2() {
return line2;
}

@JsonProperty("line2")
public void setLine2(String line2) {
this.line2 = line2;
}

@JsonProperty("line3")
public String getLine3() {
return line3;
}

@JsonProperty("line3")
public void setLine3(String line3) {
this.line3 = line3;
}

@JsonProperty("city")
public String getCity() {
return city;
}

@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("stateCode")
public String getStateCode() {
return stateCode;
}

@JsonProperty("stateCode")
public void setStateCode(String stateCode) {
this.stateCode = stateCode;
}

@JsonProperty("postalCode")
public String getPostalCode() {
return postalCode;
}

@JsonProperty("postalCode")
public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
}

@JsonProperty("countryCode")
public String getCountryCode() {
return countryCode;
}

@JsonProperty("countryCode")
public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
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