package com.clickpost.client.service.ordercreation;


import com.clickpost.client.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.client.service.ordercreation.exception.OrderCreationException;
import com.clickpost.client.service.ordercreation.object.ClickPostConfig;
import com.clickpost.client.service.ordercreation.object.OrderCreationObject;
import com.clickpost.client.service.ordercreation.object.OrderCreationResponse;
import com.clickpost.client.service.ordercreation.object.v3Json.OrderCreationV3Json;

public interface OrderCreationService {
    OrderCreationResponse createOrderOnClickPost(OrderCreationObject orderCreationObject, String userName,
                                                 String key, ClickPostConfig clickPostConfig)
            throws ClickPostServerException, OrderCreationException;

    OrderCreationV3Json buildOrderCreationV3JsonObject(OrderCreationObject orderCreationObject);
}
