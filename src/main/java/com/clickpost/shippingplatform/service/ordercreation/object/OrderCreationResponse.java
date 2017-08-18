package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

public class OrderCreationResponse {
    private final OrderCreationResponseMeta orderCreationResponseMeta_;

    @Nullable
    private final OrderCreationResponseResult orderCreationResponseResult_;

    public OrderCreationResponse(OrderCreationResponseMeta orderCreationResponseMeta, OrderCreationResponseResult orderCreationResponseResult) {
        orderCreationResponseMeta_ = orderCreationResponseMeta;
        orderCreationResponseResult_ = orderCreationResponseResult;
    }

    public OrderCreationResponseMeta getOrderCreationResponseMeta() {
        return orderCreationResponseMeta_;
    }

    public OrderCreationResponseResult getOrderCreationResponseResult() {
        return orderCreationResponseResult_;
    }
}
