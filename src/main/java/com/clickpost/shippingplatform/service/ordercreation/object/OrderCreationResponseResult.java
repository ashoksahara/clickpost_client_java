package com.clickpost.shippingplatform.service.ordercreation.object;


public class OrderCreationResponseResult {
    private final String referenceNumber_;
    private final String waybill_;
    private final String label_;

    public OrderCreationResponseResult(String referenceNumber, String waybill, String label) {
        referenceNumber_ = referenceNumber;
        waybill_ = waybill;
        label_ = label;
    }

    public String getReferenceNumber() {
        return referenceNumber_;
    }

    public String getWaybill() {
        return waybill_;
    }

    public String getLabel() {
        return label_;
    }
}
