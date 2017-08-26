package com.clickpost.client.service.ordercreation;


import com.clickpost.client.service.ordercreation.exception.ClickPostServerException;
import com.clickpost.client.service.ordercreation.exception.OrderCreationException;
import com.clickpost.client.service.ordercreation.object.*;
import com.clickpost.client.service.ordercreation.object.v3Json.*;
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
            OrderCreationV3Json orderCreationV3Json = buildOrderCreationV3JsonObject(orderCreationObject);
            String jsonString = this.objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderCreationV3Json);
            StringEntity stringEntity = new StringEntity(jsonString);
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            System.out.println(response.getStatusLine().getStatusCode());
            InputStream responseStream = response.getEntity().getContent();
            OrderCreationV3ResponseResultJson orderCreationV3ResponseResultJson = objectMapper.readValue(responseStream
                    , OrderCreationV3ResponseResultJson.class);
            response.close();
            if (orderCreationV3ResponseResultJson.getResponseMetaJson().getStatusCode() != 200) {
                throw new OrderCreationException(orderCreationV3ResponseResultJson.getResponseMetaJson().getMessage());
            }
            return buildOrderCreationResponseFromJson(orderCreationV3ResponseResultJson);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            throw new OrderCreationException(e.getMessage());
        }

    }

    @Override
    public OrderCreationV3Json buildOrderCreationV3JsonObject(OrderCreationObject orderCreationObject) {
        return new OrderCreationV3Json(getPickupInfoJsonFromPickupInfo(orderCreationObject.getPickupInfo()),
                getShipmentDetailJsonFromShipmentDetail(orderCreationObject.getShipmentDetail()),
                getAdditionalInfoJsonFromAdditionalInfo(orderCreationObject.getAdditionalInfo(), orderCreationObject.getReturnInfo()),
                getDropInfoJsonFromDropInfo(orderCreationObject.getDropInfo()), getGstInfoJsonFromGstInfo(orderCreationObject.getGstInfo()));
    }

    private PickupInfoV3Json getPickupInfoJsonFromPickupInfo(PickupInfo pickupInfo) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        String pickupTime = simpleDateFormat.format(pickupInfo.getPickupTime());
        return new PickupInfoV3Json(pickupInfo.getName(), pickupInfo.getPhone(), pickupInfo.getAddress(),
                pickupInfo.getPinCode(), pickupInfo.getCity(), pickupInfo.getState(), pickupInfo.getCountry(), pickupInfo.getEmail(),
                pickupInfo.getTin(), pickupTime);

    }


    private OrderCreationResponse buildOrderCreationResponseFromJson(OrderCreationV3ResponseResultJson orderCreationV3ResponseResultJson) {
        OrderCreationResponseMeta orderCreationResponseMeta = null;
        OrderCreationResponseResult orderCreationResponseResult = null;
        if (orderCreationV3ResponseResultJson.getResponseMetaJson() != null) {
            orderCreationResponseMeta = new OrderCreationResponseMeta(orderCreationV3ResponseResultJson.getResponseMetaJson().getStatusCode(),
                    orderCreationV3ResponseResultJson.getResponseMetaJson().getMessage(),
                    orderCreationV3ResponseResultJson.getResponseMetaJson().getSuccess());
        }
        if (orderCreationV3ResponseResultJson.getResponseResultBodyJson() != null) {
            orderCreationResponseResult = new OrderCreationResponseResult(orderCreationV3ResponseResultJson.getResponseResultBodyJson().getReferenceNumber(),
                    orderCreationV3ResponseResultJson.getResponseResultBodyJson().getWaybill(),
                    orderCreationV3ResponseResultJson.getResponseResultBodyJson().getLabel());
        }
        return new OrderCreationResponse(orderCreationResponseMeta, orderCreationResponseResult);
    }

    private DropInfoV3Json getDropInfoJsonFromDropInfo(DropInfo dropInfo) {
        return new DropInfoV3Json(dropInfo.getName(), dropInfo.getPhone(), dropInfo.getAddress(), dropInfo.getPinCode(),
                dropInfo.getCity(), dropInfo.getState(), dropInfo.getCountry());
    }

    private ReturnInfoV3Json getReturnInfoJsonFromReturnInfo(ReturnInfo returnInfo) {
        if (returnInfo == null) {
            return null;
        }
        return new ReturnInfoV3Json(returnInfo.getName(), returnInfo.getPhone(), returnInfo.getAddress(), returnInfo.getPinCode(),
                returnInfo.getCity(), returnInfo.getState(), returnInfo.getCountry());
    }

    private AdditionalInfoV3Json getAdditionalInfoJsonFromAdditionalInfo(AdditionalInfo additionalInfo, ReturnInfo returnInfo) {
        return new AdditionalInfoV3Json(additionalInfo.getDeliveryType().getName(), additionalInfo.getRvpReason(),
                additionalInfo.isAsync(), additionalInfo.getAwbNumber(), additionalInfo.isLabel(), additionalInfo.getPriority(),
                getReturnInfoJsonFromReturnInfo(returnInfo));
    }

    private ShipmentDetailV3Json getShipmentDetailJsonFromShipmentDetail(ShipmentDetail shipmentDetail) {
        ShipmentItemInfo[] shipmentItemInfoList = shipmentDetail.getShipmentItemInfo();
        ArrayList<ShipmentItemInfoV3Json> shipmentItemInfoV3JsonList = new ArrayList<>();
        for (ShipmentItemInfo shipmentItemInfo : shipmentItemInfoList) {
            shipmentItemInfoV3JsonList.add(new ShipmentItemInfoV3Json(shipmentItemInfo.getSku(), shipmentItemInfo.getDescription(),
                    shipmentItemInfo.getQuantity(), shipmentItemInfo.getPrice(),
                    new ShipmentItemAdditionalInfoV3Json(shipmentItemInfo.getShipmentItemAdditionalInfo().getWeight(),
                            shipmentItemInfo.getShipmentItemAdditionalInfo().getBreadth(),
                            shipmentItemInfo.getShipmentItemAdditionalInfo().getLength(),
                            shipmentItemInfo.getShipmentItemAdditionalInfo().getHeight())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String invoiceDate = simpleDateFormat.format(shipmentDetail.getInvoiceDate());
        return new ShipmentDetailV3Json(shipmentItemInfoV3JsonList, shipmentDetail.getLength(), shipmentDetail.getHeight(),
                shipmentDetail.getBreadth(), shipmentDetail.getWeight(), shipmentDetail.getInvoiceNumber(), shipmentDetail.getCodValue(),
                shipmentDetail.getReferenceNumber(), shipmentDetail.getInvoiceNumber(), shipmentDetail.getInvoiceValue(), invoiceDate,
                shipmentDetail.getCourierPartner());
    }

    private GstInfoV3Json getGstInfoJsonFromGstInfo(GstInfo gstInfo) {
        if (gstInfo == null) {
            return null;
        }
        return new GstInfoV3Json(gstInfo.getSellerGstin(), gstInfo.getEnterpriseGstin(), gstInfo.getConsigneeGstin(), gstInfo.getHsnCode(),
                gstInfo.getInvoiceReference(), gstInfo.getSellerRegisteredUnderGst(), gstInfo.getTaxableValue(), gstInfo.getPlaceOfSupply(),
                gstInfo.getEwaybillSerialNumber(), gstInfo.getSgstAmount(), gstInfo.getCgstAmount(), gstInfo.getIgstAmount(), gstInfo.getGstTaxBase(),
                gstInfo.getGstDiscount(), gstInfo.getSgstTaxRate(), gstInfo.getCgstTaxRate(), gstInfo.getIgstTaxRate(), gstInfo.getGstTotalTax());
    }


}
