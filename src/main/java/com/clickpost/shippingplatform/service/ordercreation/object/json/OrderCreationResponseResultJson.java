package com.clickpost.shippingplatform.service.ordercreation.object.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderCreationResponseResultJson {
    @JsonProperty("result")
    private OrderCreationResponseResultBodyJson responseResultBodyJson;

    @JsonProperty("meta")
    private OrderCreationResponseMetaJson responseMetaJson;

    public OrderCreationResponseResultJson() {
    }

    public OrderCreationResponseResultJson(OrderCreationResponseResultBodyJson responseResultBodyJson, OrderCreationResponseMetaJson responseMetaJson) {
        this.responseResultBodyJson = responseResultBodyJson;
        this.responseMetaJson = responseMetaJson;
    }

    public OrderCreationResponseResultBodyJson getResponseResultBodyJson() {
        return responseResultBodyJson;
    }

    public OrderCreationResponseMetaJson getResponseMetaJson() {
        return responseMetaJson;
    }
}
