package com.clickpost.client.service.ordercreation.object;


import org.testng.internal.Nullable;

public class ShipmentItemInfo {
    private final String sku;
    private final String description;
    private final Integer quantity;
    private final Float price;

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

    public Integer getQuantity() {
        return quantity;
    }

    public Float getPrice() {
        return price;
    }

    public ShipmentItemAdditionalInfo getShipmentItemAdditionalInfo() {
        return shipmentItemAdditionalInfo;
    }

    public static class ShipmentItemInfoBuilder {
        private final String sku;
        private final String description;
        private final Integer quantity;
        private final Float price;

        private ShipmentItemAdditionalInfo shipmentItemAdditionalInfo;

        public ShipmentItemInfoBuilder(String sku, String description, Integer quantity, Float price) {
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
