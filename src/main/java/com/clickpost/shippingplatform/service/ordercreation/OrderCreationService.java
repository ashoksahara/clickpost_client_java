package com.clickpost.shippingplatform.service.ordercreation;


import com.clickpost.shippingplatform.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.shippingplatform.service.ordercreation.exception.OrderCreationException;
import com.clickpost.shippingplatform.service.ordercreation.object.OrderCreationObject;
import com.clickpost.shippingplatform.service.ordercreation.object.json.OrderCreationResponseResultJson;
import com.clickpost.shippingplatform.service.ordercreation.object.json.OrderCreationV3Json;

import java.io.IOException;
import java.net.URISyntaxException;

public interface OrderCreationService {
    public OrderCreationResponseResultJson createOrderOnClickPost(OrderCreationV3Json orderCreationObject, String userName, String key)
            throws ClickPostServerException, OrderCreationException, IOException, URISyntaxException;

    public OrderCreationV3Json buildOrderCreationJsonClassFromOrderCreationObject(OrderCreationObject orderCreationObject);
}
