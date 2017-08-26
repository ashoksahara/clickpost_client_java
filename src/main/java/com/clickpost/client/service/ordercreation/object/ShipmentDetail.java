package com.clickpost.client.service.ordercreation.object;


import java.util.Date;

public class ShipmentDetail {
    private final ShipmentItemInfo[] shipmentItemInfo;
    private final int length;
    private final int height;
    private final int breadth;
    private final float weight;
    private final OrderType orderType;
    private final float codValue;
    private final String referenceNumber;
    private final String invoiceNumber;
    private final float invoiceValue;
    private final Date invoiceDate;
    private final int courierPartner;

    private ShipmentDetail(ShipmentDetailBuilder shipmentDetailBuilder) {
        this.shipmentItemInfo = shipmentDetailBuilder.shipmentItemInfo;
        this.length = shipmentDetailBuilder.length;
        this.height = shipmentDetailBuilder.height;
        this.breadth = shipmentDetailBuilder.breadth;
        this.weight = shipmentDetailBuilder.weight;
        this.orderType = shipmentDetailBuilder.orderType;
        this.codValue = shipmentDetailBuilder.codValue;
        this.referenceNumber = shipmentDetailBuilder.referenceNumber;
        this.invoiceNumber = shipmentDetailBuilder.invoiceNumber;
        this.invoiceValue = shipmentDetailBuilder.invoiceValue;
        this.invoiceDate = shipmentDetailBuilder.invoiceDate;
        this.courierPartner = shipmentDetailBuilder.courierPartner;
    }

    public ShipmentItemInfo[] getShipmentItemInfo() {
        return shipmentItemInfo;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getBreadth() {
        return breadth;
    }

    public float getWeight() {
        return weight;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public float getCodValue() {
        return codValue;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public float getInvoiceValue() {
        return invoiceValue;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public int getCourierPartner() {
        return courierPartner;
    }

    public static class ShipmentDetailBuilder {
        private final ShipmentItemInfo[] shipmentItemInfo;
        private final int length;
        private final int height;
        private final int breadth;
        private final float weight;
        private final OrderType orderType;
        private final float codValue;
        private final String referenceNumber;
        private final String invoiceNumber;
        private final float invoiceValue;
        private final Date invoiceDate;
        private final int courierPartner;

        public ShipmentDetailBuilder(ShipmentItemInfo[] shipmentItemInfo, int length, int height, int breadth, float weight, OrderType orderType, float codValue, String referenceNumber, String invoiceNumber, float invoiceValue, Date invoiceDate, int courierPartner) {
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

        public ShipmentDetail build() {
            return new ShipmentDetail(this);
        }
    }
}
