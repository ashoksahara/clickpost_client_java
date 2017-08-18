package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

public class ShipmentItemInfo {
    private final String sku_;
    private final String description_;
    private final int quantity_;
    private final float price_;

    @Nullable
    private final ShipmentItemAdditionalInfo shipmentItemAdditionalInfo_;

    public ShipmentItemInfo(String sku, String description, int quantity, float price,
                            ShipmentItemAdditionalInfo shipmentItemAdditionalInfo) {
        sku_ = sku;
        description_ = description;
        quantity_ = quantity;
        price_ = price;
        shipmentItemAdditionalInfo_ = shipmentItemAdditionalInfo;
    }

    public String getSku() {
        return sku_;
    }

    public String getDescription() {
        return description_;
    }

    public int getQuantity() {
        return quantity_;
    }

    public float getPrice() {
        return price_;
    }

    public ShipmentItemAdditionalInfo getShipmentItemAdditionalInfo() {
        return shipmentItemAdditionalInfo_;
    }
}
