package com.clickpost.shippingplatform.service.ordercreation.object;


public class OrderCreationResponseResult {
    private final String referenceNumber;
    private final String waybill;
    private final String label;

    public OrderCreationResponseResult(String referenceNumber, String waybill, String label) {
        this.referenceNumber = referenceNumber;
        this.waybill = waybill;
        this.label = label;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getWaybill() {
        return waybill;
    }

    public String getLabel() {
        return label;
    }
}
