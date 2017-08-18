package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

public class OrderCreationResponse {
    private final OrderCreationResponseMeta orderCreationResponseMeta;

    @Nullable
    private final OrderCreationResponseResult orderCreationResponseResult;

    public OrderCreationResponse(OrderCreationResponseMeta orderCreationResponseMeta, OrderCreationResponseResult orderCreationResponseResult) {
        this.orderCreationResponseMeta = orderCreationResponseMeta;
        this.orderCreationResponseResult = orderCreationResponseResult;
    }

    public OrderCreationResponseMeta getOrderCreationResponseMeta() {
        return orderCreationResponseMeta;
    }

    public OrderCreationResponseResult getOrderCreationResponseResult() {
        return orderCreationResponseResult;
    }
}
