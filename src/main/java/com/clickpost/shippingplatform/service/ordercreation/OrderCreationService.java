package com.clickpost.shippingplatform.service.ordercreation;


import com.clickpost.shippingplatform.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.shippingplatform.service.ordercreation.exception.OrderCreationException;
import com.clickpost.shippingplatform.service.ordercreation.object.OrderCreationObject;
import com.clickpost.shippingplatform.service.ordercreation.object.OrderCreationResponse;
import com.clickpost.shippingplatform.service.ordercreation.object.json.OrderCreationV3Json;

public interface OrderCreationService {
    public OrderCreationResponse createOrderOnClickPost(OrderCreationObject orderCreationObject, String userName, String key)
            throws ClickPostServerException, OrderCreationException;

    public OrderCreationV3Json buildOrderCreationJsonClassFromOrderCreationObject(OrderCreationObject orderCreationObject);
}
