package com.clickpost.client.service.ordercreation.object.v3Json;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentItemInfoV3Json {
    @JsonProperty("sku")
    private String sku;

    @JsonProperty("description")
    private String description;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price")
    private float price;

    @JsonProperty("additional")
    private ShipmentItemAdditionalInfoV3Json shipmentItemAdditionalInfo;

    public ShipmentItemInfoV3Json() {
    }

    public ShipmentItemInfoV3Json(String sku, String description, int quantity, float price, ShipmentItemAdditionalInfoV3Json shipmentItemAdditionalInfo) {
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

    public ShipmentItemAdditionalInfoV3Json getShipmentItemAdditionalInfo() {
        return shipmentItemAdditionalInfo;
    }
}
