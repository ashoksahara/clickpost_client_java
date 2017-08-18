package com.clickpost.shippingplatform.service.ordercreation.object;


import java.util.Date;

public class ShipmentDetail {
    private final ShipmentItemInfo[] shipmentItemInfo_;
    private final String referenceNumber_;
    private final float invoiceValue_;
    private final float length_;
    private final OrderType orderType_;
    private final int height_;
    private final int courierPartner_;
    private final float weight_;
    private final String gstNumber_;
    private final float breadth_;
    private final float codValue_;
    private final String invoiceNumber_;
    private final Date invoiceDate_;


    public ShipmentDetail(ShipmentItemInfo[] shipmentItemInfo, String referenceNumber, float invoiceValue,
                          float length, OrderType orderType, int height, int courierPartner, float weight,
                          String gstNumber, float breadth, float codValue, String invoiceNumber, Date invoiceDate) {
        shipmentItemInfo_ = shipmentItemInfo;
        referenceNumber_ = referenceNumber;
        invoiceValue_ = invoiceValue;
        length_ = length;
        orderType_ = orderType;
        height_ = height;
        courierPartner_ = courierPartner;
        weight_ = weight;
        gstNumber_ = gstNumber;
        breadth_ = breadth;
        codValue_ = codValue;
        invoiceNumber_ = invoiceNumber;
        invoiceDate_ = invoiceDate;
    }

    public ShipmentItemInfo[] getShipmentItemInfo() {
        return shipmentItemInfo_;
    }

    public String getReferenceNumber() {
        return referenceNumber_;
    }

    public float getInvoiceValue() {
        return invoiceValue_;
    }

    public float getLength() {
        return length_;
    }

    public OrderType getOrderType() {
        return orderType_;
    }

    public int getHeight() {
        return height_;
    }

    public int getCourierPartner() {
        return courierPartner_;
    }

    public float getWeight() {
        return weight_;
    }

    public String getGstNumber() {
        return gstNumber_;
    }

    public float getBreadth() {
        return breadth_;
    }

    public float getCodValue() {
        return codValue_;
    }

    public String getInvoiceNumber() {
        return invoiceNumber_;
    }

    public Date getInvoiceDate() {
        return invoiceDate_;
    }
}
