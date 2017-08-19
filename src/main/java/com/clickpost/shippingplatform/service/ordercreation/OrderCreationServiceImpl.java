package com.clickpost.shippingplatform.service.ordercreation;


import com.clickpost.shippingplatform.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.shippingplatform.service.ordercreation.exception.OrderCreationException;
import com.clickpost.shippingplatform.service.ordercreation.object.*;
import com.clickpost.shippingplatform.service.ordercreation.object.json.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class OrderCreationServiceImpl implements OrderCreationService {
    @Override
    public OrderCreationResponse createOrderOnClickPost(OrderCreationObject orderCreationObject, String userName, String apiKey)
            throws ClickPostServerException, OrderCreationException {
        return null;
    }

    @Override
    public OrderCreationV3Json buildOrderCreationJsonClassFromOrderCreationObject(OrderCreationObject orderCreationObject) {
        return new OrderCreationV3Json(getPickupInfoJsonFromPickupInfo(orderCreationObject.getPickupInfo()),
                getShipmentDetailJsonFromShipmentDetail(orderCreationObject.getShipmentDetail()),
                getAdditionalInfoJsonFromAdditionalInfo(orderCreationObject.getAdditionalInfo()),
                getDropInfoJsonFromDropInfo(orderCreationObject.getDropInfo()));
    }

    private PickupInfoJson getPickupInfoJsonFromPickupInfo(PickupInfo pickupInfo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        String pickupTime = simpleDateFormat.format(pickupInfo.getPickupTime());
        return new PickupInfoJson(pickupInfo.getName(), pickupInfo.getPhone(), pickupInfo.getAddress(),
                pickupInfo.getPinCode(), pickupInfo.getCity(), pickupInfo.getState(), pickupInfo.getCountry(), pickupInfo.getEmail(),
                pickupInfo.getTin(), pickupTime);

    }

    private DropInfoJson getDropInfoJsonFromDropInfo(DropInfo dropInfo) {
        return new DropInfoJson(dropInfo.getName(), dropInfo.getPhone(), dropInfo.getAddress(), dropInfo.getPinCode(),
                dropInfo.getCity(), dropInfo.getState(), dropInfo.getCountry());
    }

    private ReturnInfoJson getReturnInfoJsonFromReturnInfo(ReturnInfo returnInfo) {
        if (returnInfo == null) {
            return null;
        }
        return new ReturnInfoJson(returnInfo.getName(), returnInfo.getPhone(), returnInfo.getAddress(), returnInfo.getPinCode(),
                returnInfo.getCity(), returnInfo.getState(), returnInfo.getCountry());
    }

    private AdditionalInfoJson getAdditionalInfoJsonFromAdditionalInfo(AdditionalInfo additionalInfo) {
        return new AdditionalInfoJson(additionalInfo.getDeliveryType().getName(), additionalInfo.getRvpReason(),
                additionalInfo.isAsync(), additionalInfo.getAwbNumber(), additionalInfo.isLabel(), additionalInfo.getPriority(),
                getReturnInfoJsonFromReturnInfo(additionalInfo.getReturnInfo()));
    }

    private ShipmentDetailJson getShipmentDetailJsonFromShipmentDetail(ShipmentDetail shipmentDetail) {
        ShipmentItemInfo[] shipmentItemInfoList = shipmentDetail.getShipmentItemInfo();
        ArrayList<ShipmentItemInfoJson> shipmentItemInfoJsonList = new ArrayList<>();
        for (ShipmentItemInfo shipmentItemInfo : shipmentItemInfoList) {
            shipmentItemInfoJsonList.add(new ShipmentItemInfoJson(shipmentItemInfo.getSku(), shipmentItemInfo.getDescription(),
                    shipmentItemInfo.getQuantity(), shipmentItemInfo.getPrice(),
                    new ShipmentItemAdditionalInfoJson(shipmentItemInfo.getShipmentItemAdditionalInfo().getWeight(),
                            shipmentItemInfo.getShipmentItemAdditionalInfo().getBreadth(),
                            shipmentItemInfo.getShipmentItemAdditionalInfo().getLength(),
                            shipmentItemInfo.getShipmentItemAdditionalInfo().getHeight())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String invoiceDate = simpleDateFormat.format(shipmentDetail.getInvoiceDate());
        return new ShipmentDetailJson(shipmentItemInfoJsonList, shipmentDetail.getLength(), shipmentDetail.getHeight(),
                shipmentDetail.getBreadth(), shipmentDetail.getWeight(), shipmentDetail.getInvoiceNumber(), shipmentDetail.getCodValue(),
                shipmentDetail.getReferenceNumber(), shipmentDetail.getInvoiceNumber(), shipmentDetail.getInvoiceValue(), invoiceDate,
                shipmentDetail.getCourierPartner());
    }
}
