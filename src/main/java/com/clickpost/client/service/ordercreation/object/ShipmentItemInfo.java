package com.clickpost.client.service.ordercreation.object;


import org.testng.internal.Nullable;

public class ShipmentItemInfo {
    private final String sku;
    private final String description;
    private final int quantity;
    private final float price;

    @Nullable
    private final ShipmentItemAdditionalInfo shipmentItemAdditionalInfo;


    private ShipmentItemInfo(ShipmentItemInfoBuilder shipmentItemInfoBuilder) {
        this.sku = shipmentItemInfoBuilder.sku;
        this.description = shipmentItemInfoBuilder.description;
        this.quantity = shipmentItemInfoBuilder.quantity;
        this.price = shipmentItemInfoBuilder.price;
        this.shipmentItemAdditionalInfo = shipmentItemInfoBuilder.shipmentItemAdditionalInfo;
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

    public static class ShipmentItemInfoBuilder {
        private final String sku;
        private final String description;
        private final int quantity;
        private final float price;

        private ShipmentItemAdditionalInfo shipmentItemAdditionalInfo;

        public ShipmentItemInfoBuilder(String sku, String description, int quantity, float price) {
            this.sku = sku;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
        }

        public void setShipmentItemAdditionalInfo(ShipmentItemAdditionalInfo shipmentItemAdditionalInfo) {
            this.shipmentItemAdditionalInfo = shipmentItemAdditionalInfo;
        }

        public ShipmentItemInfo build() {
            return new ShipmentItemInfo(this);
        }
    }
}
