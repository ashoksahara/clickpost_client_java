package com.clickpost.client.service.ordercreation.object;


import java.util.Date;

public class ShipmentDetail {
    private final ShipmentItemInfo[] shipmentItemInfo;
    private final Integer length;
    private final Integer height;
    private final Integer breadth;
    private final Float weight;
    private final OrderType orderType;
    private final Float codValue;
    private final String referenceNumber;
    private final String invoiceNumber;
    private final Float invoiceValue;
    private final Date invoiceDate;
    private final Integer courierPartner;

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

    public OrderType getOrderType() {
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

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public Integer getCourierPartner() {
        return courierPartner;
    }

    public static class ShipmentDetailBuilder {
        private final ShipmentItemInfo[] shipmentItemInfo;
        private final Integer length;
        private final Integer height;
        private final Integer breadth;
        private final Float weight;
        private final OrderType orderType;
        private final Float codValue;
        private final String referenceNumber;
        private final String invoiceNumber;
        private final Float invoiceValue;
        private final Date invoiceDate;
        private final Integer courierPartner;

        public ShipmentDetailBuilder(ShipmentItemInfo[] shipmentItemInfo, Integer length, Integer height, Integer breadth, Float weight, OrderType orderType, Float codValue, String referenceNumber, String invoiceNumber, Float invoiceValue, Date invoiceDate, Integer courierPartner) {
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
