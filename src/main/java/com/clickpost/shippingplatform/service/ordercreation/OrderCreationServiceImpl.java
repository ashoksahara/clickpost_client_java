package com.clickpost.shippingplatform.service.ordercreation;


import com.clickpost.shippingplatform.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.shippingplatform.service.ordercreation.exception.OrderCreationException;
import com.clickpost.shippingplatform.service.ordercreation.object.*;
import com.clickpost.shippingplatform.service.ordercreation.object.json.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class OrderCreationServiceImpl implements OrderCreationService {
    private PoolingHttpClientConnectionManager connectionManager;
    private ObjectMapper objectMapper;

    public OrderCreationServiceImpl() {
        this.connectionManager = new PoolingHttpClientConnectionManager();
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public OrderCreationResponse createOrderOnClickPost(OrderCreationObject orderCreationObject, String userName,
                                                        String apiKey, ClickPostConfig clickPostConfig)
            throws ClickPostServerException, OrderCreationException {
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(this.connectionManager).build();
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme(clickPostConfig.getScheme()).setHost(clickPostConfig.getHost()).setPath(clickPostConfig.getPath())
                .setParameter("username", userName)
                .setParameter("key", apiKey);
        HttpPost httpPost;
        try {
            httpPost = new HttpPost(uriBuilder.build());
            OrderCreationV3Json orderCreationV3Json = buildOrderCreationJsonClassFromOrderCreationObject(orderCreationObject);
            String jsonString = this.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderCreationV3Json);
            StringEntity stringEntity = new StringEntity(jsonString);
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            System.out.println(response.getStatusLine().getStatusCode());
            InputStream responseStream = response.getEntity().getContent();
            OrderCreationResponseResultJson orderCreationResponseResultJson = objectMapper.readValue(responseStream
                    , OrderCreationResponseResultJson.class);
            if (orderCreationResponseResultJson.getResponseMetaJson().getStatusCode() != 200) {
                throw new OrderCreationException(orderCreationResponseResultJson.getResponseMetaJson().getMessage());
            }
            return buildOrderCreationResponseFromJson(orderCreationResponseResultJson);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            throw new OrderCreationException(e.getMessage());
        }

    }

    @Override
    public OrderCreationV3Json buildOrderCreationJsonClassFromOrderCreationObject(OrderCreationObject orderCreationObject) {
        return new OrderCreationV3Json(getPickupInfoJsonFromPickupInfo(orderCreationObject.getPickupInfo()),
                getShipmentDetailJsonFromShipmentDetail(orderCreationObject.getShipmentDetail()),
                getAdditionalInfoJsonFromAdditionalInfo(orderCreationObject.getAdditionalInfo(), orderCreationObject.getReturnInfo()),
                getDropInfoJsonFromDropInfo(orderCreationObject.getDropInfo()), getGstInfoJsonFromGstInfo(orderCreationObject.getGstInfo()));
    }

    private PickupInfoJson getPickupInfoJsonFromPickupInfo(PickupInfo pickupInfo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        String pickupTime = simpleDateFormat.format(pickupInfo.getPickupTime());
        return new PickupInfoJson(pickupInfo.getName(), pickupInfo.getPhone(), pickupInfo.getAddress(),
                pickupInfo.getPinCode(), pickupInfo.getCity(), pickupInfo.getState(), pickupInfo.getCountry(), pickupInfo.getEmail(),
                pickupInfo.getTin(), pickupTime);

    }


    private OrderCreationResponse buildOrderCreationResponseFromJson(OrderCreationResponseResultJson orderCreationResponseResultJson) {
        OrderCreationResponseMeta orderCreationResponseMeta = null;
        OrderCreationResponseResult orderCreationResponseResult = null;
        if (orderCreationResponseResultJson.getResponseMetaJson() != null) {
            orderCreationResponseMeta = new OrderCreationResponseMeta(orderCreationResponseResultJson.getResponseMetaJson().getStatusCode(),
                    orderCreationResponseResultJson.getResponseMetaJson().getMessage(),
                    orderCreationResponseResultJson.getResponseMetaJson().getSuccess());
        }
        if (orderCreationResponseResultJson.getResponseResultBodyJson() != null) {
            orderCreationResponseResult = new OrderCreationResponseResult(orderCreationResponseResultJson.getResponseResultBodyJson().getReferenceNumber(),
                    orderCreationResponseResultJson.getResponseResultBodyJson().getWaybill(),
                    orderCreationResponseResultJson.getResponseResultBodyJson().getLabel());
        }
        return new OrderCreationResponse(orderCreationResponseMeta, orderCreationResponseResult);
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

    private AdditionalInfoJson getAdditionalInfoJsonFromAdditionalInfo(AdditionalInfo additionalInfo, ReturnInfo returnInfo) {
        return new AdditionalInfoJson(additionalInfo.getDeliveryType().getName(), additionalInfo.getRvpReason(),
                additionalInfo.isAsync(), additionalInfo.getAwbNumber(), additionalInfo.isLabel(), additionalInfo.getPriority(),
                getReturnInfoJsonFromReturnInfo(returnInfo));
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

    private GstInfoJson getGstInfoJsonFromGstInfo(GstInfo gstInfo) {
        if (gstInfo == null) {
            return null;
        }
        return new GstInfoJson(gstInfo.getSellerGstin(), gstInfo.getEnterpriseGstin(), gstInfo.getConsigneeGstin(), gstInfo.getHsnCode(),
                gstInfo.getInvoiceReference(), gstInfo.getSellerRegisteredUnderGst(), gstInfo.getTaxableValue(), gstInfo.getPlaceOfSupply(),
                gstInfo.getEwaybillSerialNumber(), gstInfo.getSgstAmount(), gstInfo.getCgstAmount(), gstInfo.getIgstAmount(), gstInfo.getGstTaxBase(),
                gstInfo.getGstDiscount(), gstInfo.getSgstTaxRate(), gstInfo.getCgstTaxRate(), gstInfo.getIgstTaxRate(), gstInfo.getGstTotalTax());
    }


}
