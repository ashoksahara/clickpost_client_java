package com.clickpost.client.service.ordercreation.object.v3Json;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;


public class ShipmentDetailV3Json {
    @JsonProperty("items")
    private ArrayList<ShipmentItemInfoV3Json> shipmentItemInfo;

    @JsonProperty("length")
    private Integer length;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("breadth")
    private Integer breadth;

    @JsonProperty("weight")
    private Float weight;

    @JsonProperty("order_type")
    private String orderType;

    @JsonProperty("cod_value")
    private Float codValue;

    @JsonProperty("reference_number")
    private String referenceNumber;

    @JsonProperty("invoice_number")
    private String invoiceNumber;

    @JsonProperty("invoice_value")
    private Float invoiceValue;

    @JsonProperty("invoice_date")
    private String invoiceDate;

    @JsonProperty("courier_partner")
    private Integer courierPartner;

    public ShipmentDetailV3Json() {
    }

    public ShipmentDetailV3Json(ArrayList<ShipmentItemInfoV3Json> shipmentItemInfo, Integer length, Integer height, Integer breadth,
                                Float weight, String orderType, Float codValue, String referenceNumber, String invoiceNumber,
                                Float invoiceValue, String invoiceDate, Integer courierPartner) {
        this.shipmentItemInfo = shipmentItemInfo;
        this.length = length;
        this.height = height;
        this.breadth = breadth;
        this.weight = weight;
        this.orderType = orderType;
        this.codValue = codValue;
        this.referenceNumber = referenceNumber;
        this.invoiceNumber = invoiceNumber;
        this.invoiceValue = invoiceValue;
        this.invoiceDate = invoiceDate;
        this.courierPartner = courierPartner;
    }

    public ArrayList<ShipmentItemInfoV3Json> getShipmentItemInfo() {
        return shipmentItemInfo;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public Float getWeight() {
        return weight;
    }

    public String getOrderType() {
        return orderType;
    }

    public Float getCodValue() {
        return codValue;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Float getInvoiceValue() {
        return invoiceValue;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public Integer getCourierPartner() {
        return courierPartner;
    }
}
