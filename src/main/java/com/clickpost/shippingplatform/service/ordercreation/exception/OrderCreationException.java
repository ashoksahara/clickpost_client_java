package com.clickpost.shippingplatform.service.ordercreation.exception;


public class OrderCreationException extends Exception {
    public OrderCreationException() {
    }

    public OrderCreationException(String message) {
        super(message);
    }

    public OrderCreationException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderCreationException(Throwable cause) {
        super(cause);
    }
}
