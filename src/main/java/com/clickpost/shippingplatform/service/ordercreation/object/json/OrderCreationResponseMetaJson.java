package com.clickpost.shippingplatform.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderCreationResponseMetaJson {
    @JsonProperty("status")
    private Integer statusCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("success")
    private Boolean success;

    public OrderCreationResponseMetaJson() {
    }

    public OrderCreationResponseMetaJson(Integer statusCode, String message, Boolean success) {
        this.statusCode = statusCode;
        this.message = message;
        this.success = success;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public Boolean getSuccess() {
        return success;
    }
}
