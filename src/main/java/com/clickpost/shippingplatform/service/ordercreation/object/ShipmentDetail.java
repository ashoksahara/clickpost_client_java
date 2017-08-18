package com.clickpost.shippingplatform.service.ordercreation.object;


import java.util.Date;

public class ShipmentDetail {
    private final ShipmentItemInfo[] shipmentItemInfo_;
    private final int length_;
    private final int height_;
    private final int breadth_;
    private final float weight_;
    private final OrderType orderType_;
    private final float codValue_;
    private final String referenceNumber_;
    private final String invoiceNumber_;
    private final float invoiceValue_;
    private final Date invoiceDate_;
    private final int courierPartner_;


    public ShipmentDetail(ShipmentItemInfo[] shipmentItemInfo, int length, int height, int breadth, float weight,
                          OrderType orderType, float codValue, String referenceNumber, String invoiceNumber,
                          float invoiceValue, Date invoiceDate, int courierPartner) {
        shipmentItemInfo_ = shipmentItemInfo;
        length_ = length;
        height_ = height;
        breadth_ = breadth;
        weight_ = weight;
        orderType_ = orderType;
        codValue_ = codValue;
        referenceNumber_ = referenceNumber;
        invoiceNumber_ = invoiceNumber;
        invoiceValue_ = invoiceValue;
        invoiceDate_ = invoiceDate;
        courierPartner_ = courierPartner;
    }

    public ShipmentItemInfo[] getShipmentItemInfo() {
        return shipmentItemInfo_;
    }

    public int getLength() {
        return length_;
    }

    public int getHeight() {
        return height_;
    }

    public int getBreadth() {
        return breadth_;
    }

    public float getWeight() {
        return weight_;
    }

    public OrderType getOrderType() {
        return orderType_;
    }

    public float getCodValue() {
        return codValue_;
    }

    public String getReferenceNumber() {
        return referenceNumber_;
    }

    public String getInvoiceNumber() {
        return invoiceNumber_;
    }

    public float getInvoiceValue() {
        return invoiceValue_;
    }

    public Date getInvoiceDate() {
        return invoiceDate_;
    }

    public int getCourierPartner() {
        return courierPartner_;
    }
}
