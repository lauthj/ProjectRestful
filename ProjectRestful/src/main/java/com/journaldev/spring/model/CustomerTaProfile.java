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
"generalData",
"rewards"
})
public class CustomerTaProfile implements Serializable
{

@JsonProperty("generalData")
private GeneralData generalData;
@JsonProperty("rewards")
private Rewards rewards;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -2553373590607531697L;

@JsonProperty("generalData")
public GeneralData getGeneralData() {
return generalData;
}

@JsonProperty("generalData")
public void setGeneralData(GeneralData generalData) {
this.generalData = generalData;
}

@JsonProperty("rewards")
public Rewards getRewards() {
return rewards;
}

@JsonProperty("rewards")
public void setRewards(Rewards rewards) {
this.rewards = rewards;
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