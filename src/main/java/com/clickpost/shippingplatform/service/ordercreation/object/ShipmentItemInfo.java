package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

public class ShipmentItemInfo {
    private final String sku;
    private final String description;
    private final int quantity;
    private final float price;

    @Nullable
    private final ShipmentItemAdditionalInfo shipmentItemAdditionalInfo;


    public ShipmentItemInfo(String sku, String description, int quantity, float price, ShipmentItemAdditionalInfo shipmentItemAdditionalInfo) {
        this.sku = sku;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.shipmentItemAdditionalInfo = shipmentItemAdditionalInfo;
    }

    public String getSku() {
        return sku;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public ShipmentItemAdditionalInfo getShipmentItemAdditionalInfo() {
        return shipmentItemAdditionalInfo;
    }
}
