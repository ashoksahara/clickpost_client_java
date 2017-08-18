package com.clickpost.shippingplatform.service.ordercreation;


import com.clickpost.shippingplatform.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.shippingplatform.service.ordercreation.exception.OrderCreationException;
import com.clickpost.shippingplatform.service.ordercreation.object.OrderCreationObject;
import com.clickpost.shippingplatform.service.ordercreation.object.OrderCreationResponse;


public class OrderCreationServiceImpl implements OrderCreationService {
    @Override
    public OrderCreationResponse createOrderOnClickPost(OrderCreationObject orderCreationObject, String userName, String apiKey)
            throws ClickPostServerException, OrderCreationException {
        return null;
    }
}
