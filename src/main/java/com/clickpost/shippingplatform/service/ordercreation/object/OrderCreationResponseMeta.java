package com.clickpost.shippingplatform.service.ordercreation.object;


public class OrderCreationResponseMeta {
    private final int statusCode_;
    private final String message_;
    private final boolean success_;

    public OrderCreationResponseMeta(int statusCode, String message, boolean success) {
        statusCode_ = statusCode;
        message_ = message;
        success_ = success;
    }

    public int getStatusCode() {
        return statusCode_;
    }

    public String getMessage() {
        return message_;
    }

    public boolean isSuccess() {
        return success_;
    }
}
