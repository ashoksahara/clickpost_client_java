package com.clickpost.shippingplatform.service.ordercreation.exception;


public class ClickPostServerException extends Exception {
    public ClickPostServerException() {
    }

    public ClickPostServerException(String message) {
        super(message);
    }

    public ClickPostServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClickPostServerException(Throwable cause) {
        super(cause);
    }
}
