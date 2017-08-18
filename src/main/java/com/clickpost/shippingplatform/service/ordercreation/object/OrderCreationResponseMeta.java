package com.clickpost.shippingplatform.service.ordercreation.object;


public class OrderCreationResponseMeta {
    private final int statusCode;
    private final String message;
    private final boolean success;

    public OrderCreationResponseMeta(int statusCode, String message, boolean success) {
        this.statusCode = statusCode;
        this.message = message;
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}
