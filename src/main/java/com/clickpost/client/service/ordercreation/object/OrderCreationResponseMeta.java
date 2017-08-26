package com.clickpost.client.service.ordercreation.object;


public class OrderCreationResponseMeta {
    private final Integer statusCode;
    private final String message;
    private final Boolean success;

    public OrderCreationResponseMeta(Integer statusCode, String message, Boolean success) {
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

    public Boolean isSuccess() {
        return success;
    }
}
