package com.clickpost.shippingplatform.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderCreationV3Json {
    @JsonProperty("pickup_info")
    private PickupInfoJson pickupInfo;

    @JsonProperty("shipment_details")
    private ShipmentDetailJson shipmentDetail;

    @JsonProperty("additional")
    private AdditionalInfoJson additionalInfo;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("drop_info")
    private DropInfoJson dropInfo;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("gst_info")
    private GstInfoJson gstInfoJson;

    public OrderCreationV3Json() {
    }

    public OrderCreationV3Json(PickupInfoJson pickupInfo, ShipmentDetailJson shipmentDetail, AdditionalInfoJson additionalInfo,
                               DropInfoJson dropInfo, GstInfoJson gstInfoJson) {
        this.pickupInfo = pickupInfo;
        this.shipmentDetail = shipmentDetail;
        this.additionalInfo = additionalInfo;
        this.dropInfo = dropInfo;
        this.gstInfoJson = gstInfoJson;
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

    public GstInfoJson getGstInfoJson() {
        return gstInfoJson;
    }
}
