package com.clickpost.shippingplatform.service.ordercreation;


import com.clickpost.shippingplatform.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.shippingplatform.service.ordercreation.exception.OrderCreationException;
import com.clickpost.shippingplatform.service.ordercreation.object.OrderCreationObject;
import com.clickpost.shippingplatform.service.ordercreation.object.OrderCreationResponse;

public interface OrderCreationService {
    public OrderCreationResponse createOrderOnClickPost(OrderCreationObject orderCreationObject, String userName, String key)
            throws ClickPostServerException, OrderCreationException;
}
