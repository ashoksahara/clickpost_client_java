package com.clickpost.client.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentItemInfoJson {
    @JsonProperty("sku")
    private String sku;

    @JsonProperty("description")
    private String description;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price")
    private float price;

    @JsonProperty("additional")
    private ShipmentItemAdditionalInfoJson shipmentItemAdditionalInfo;

    public ShipmentItemInfoJson() {
    }

    public ShipmentItemInfoJson(String sku, String description, int quantity, float price, ShipmentItemAdditionalInfoJson shipmentItemAdditionalInfo) {
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

    public ShipmentItemAdditionalInfoJson getShipmentItemAdditionalInfo() {
        return shipmentItemAdditionalInfo;
    }
}
