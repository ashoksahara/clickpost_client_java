package com.clickpost.shippingplatform.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OrderCreationV3Json {
    @JsonProperty("pickup_info")
    private PickupInfoJson pickupInfo;

    @JsonProperty("shipment_details")
    private ShipmentDetailJson shipmentDetail;

    @JsonProperty("additional")
    private AdditionalInfoJson additionalInfo;

    @JsonProperty("drop_info")
    private DropInfoJson dropInfo;

    public OrderCreationV3Json() {
    }

    public OrderCreationV3Json(PickupInfoJson pickupInfo, ShipmentDetailJson shipmentDetail, AdditionalInfoJson additionalInfo,
                               DropInfoJson dropInfo) {
        this.pickupInfo = pickupInfo;
        this.shipmentDetail = shipmentDetail;
        this.additionalInfo = additionalInfo;
        this.dropInfo = dropInfo;
    }

    public PickupInfoJson getPickupInfo() {
        return pickupInfo;
    }

    public ShipmentDetailJson getShipmentDetail() {
        return shipmentDetail;
    }

    public AdditionalInfoJson getAdditionalInfo() {
        return additionalInfo;
    }

    public DropInfoJson getDropInfo() {
        return dropInfo;
    }

    
}
