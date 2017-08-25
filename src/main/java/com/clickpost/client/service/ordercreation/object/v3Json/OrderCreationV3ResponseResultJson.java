package com.clickpost.client.service.ordercreation.object.v3Json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderCreationV3ResponseResultJson {
    @JsonProperty("result")
    private OrderCreationResponseResultBodyJson responseResultBodyJson;

    @JsonProperty("meta")
    private OrderCreationV3ResponseMetaJson responseMetaJson;

    public OrderCreationV3ResponseResultJson() {
    }

    public OrderCreationV3ResponseResultJson(OrderCreationResponseResultBodyJson responseResultBodyJson, OrderCreationV3ResponseMetaJson responseMetaJson) {
        this.responseResultBodyJson = responseResultBodyJson;
        this.responseMetaJson = responseMetaJson;
    }

    public OrderCreationResponseResultBodyJson getResponseResultBodyJson() {
        return responseResultBodyJson;
    }

    public OrderCreationV3ResponseMetaJson getResponseMetaJson() {
        return responseMetaJson;
    }
}
