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
"iata",
"agencyName",
"address",
"phoneNo",
"commissionFlag",
"pseudoIATAFlag",
"consortiumCode",
"tmsUpdatedTimestamp"
})
public class GeneralData implements Serializable
{

@JsonProperty("iata")
private String iata;
@JsonProperty("agencyName")
private String agencyName;
@JsonProperty("address")
private Address address;
@JsonProperty("phoneNo")
private String phoneNo;
@JsonProperty("commissionFlag")
private String commissionFlag;
@JsonProperty("pseudoIATAFlag")
private String pseudoIATAFlag;
@JsonProperty("consortiumCode")
private String consortiumCode;
@JsonProperty("tmsUpdatedTimestamp")
private String tmsUpdatedTimestamp;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 8955249966045164639L;

@JsonProperty("iata")
public String getIata() {
return iata;
}

@JsonProperty("iata")
public void setIata(String iata) {
this.iata = iata;
}

@JsonProperty("agencyName")
public String getAgencyName() {
return agencyName;
}

@JsonProperty("agencyName")
public void setAgencyName(String agencyName) {
this.agencyName = agencyName;
}

@JsonProperty("address")
public Address getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(Address address) {
this.address = address;
}

@JsonProperty("phoneNo")
public String getPhoneNo() {
return phoneNo;
}

@JsonProperty("phoneNo")
public void setPhoneNo(String phoneNo) {
this.phoneNo = phoneNo;
}

@JsonProperty("commissionFlag")
public String getCommissionFlag() {
return commissionFlag;
}

@JsonProperty("commissionFlag")
public void setCommissionFlag(String commissionFlag) {
this.commissionFlag = commissionFlag;
}

@JsonProperty("pseudoIATAFlag")
public String getPseudoIATAFlag() {
return pseudoIATAFlag;
}

@JsonProperty("pseudoIATAFlag")
public void setPseudoIATAFlag(String pseudoIATAFlag) {
this.pseudoIATAFlag = pseudoIATAFlag;
}

@JsonProperty("consortiumCode")
public String getConsortiumCode() {
return consortiumCode;
}

@JsonProperty("consortiumCode")
public void setConsortiumCode(String consortiumCode) {
this.consortiumCode = consortiumCode;
}

@JsonProperty("tmsUpdatedTimestamp")
public String getTmsUpdatedTimestamp() {
return tmsUpdatedTimestamp;
}

@JsonProperty("tmsUpdatedTimestamp")
public void setTmsUpdatedTimestamp(String tmsUpdatedTimestamp) {
this.tmsUpdatedTimestamp = tmsUpdatedTimestamp;
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