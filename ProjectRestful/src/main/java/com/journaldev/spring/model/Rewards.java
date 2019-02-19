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
"frequencyPointsFlag",
"accountType",
"managerPercent",
"individualPercent"
})
public class Rewards implements Serializable
{

@JsonProperty("frequencyPointsFlag")
private String frequencyPointsFlag;
@JsonProperty("accountType")
private String accountType;
@JsonProperty("managerPercent")
private String managerPercent;
@JsonProperty("individualPercent")
private String individualPercent;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 5976179004069439172L;

@JsonProperty("frequencyPointsFlag")
public String getFrequencyPointsFlag() {
return frequencyPointsFlag;
}

@JsonProperty("frequencyPointsFlag")
public void setFrequencyPointsFlag(String frequencyPointsFlag) {
this.frequencyPointsFlag = frequencyPointsFlag;
}

@JsonProperty("accountType")
public String getAccountType() {
return accountType;
}

@JsonProperty("accountType")
public void setAccountType(String accountType) {
this.accountType = accountType;
}

@JsonProperty("managerPercent")
public String getManagerPercent() {
return managerPercent;
}

@JsonProperty("managerPercent")
public void setManagerPercent(String managerPercent) {
this.managerPercent = managerPercent;
}

@JsonProperty("individualPercent")
public String getIndividualPercent() {
return individualPercent;
}

@JsonProperty("individualPercent")
public void setIndividualPercent(String individualPercent) {
this.individualPercent = individualPercent;
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