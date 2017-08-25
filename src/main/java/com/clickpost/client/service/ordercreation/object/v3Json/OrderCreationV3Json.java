package com.clickpost.client.service.ordercreation.object.v3Json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderCreationV3Json {
    @JsonProperty("pickup_info")
    private PickupInfoV3Json pickupInfo;

    @JsonProperty("shipment_details")
    private ShipmentDetailV3Json shipmentDetail;

    @JsonProperty("additional")
    private AdditionalInfoV3Json additionalInfo;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("drop_info")
    private DropInfoV3Json dropInfo;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("gst_info")
    private GstInfoV3Json gstInfoV3Json;

    public OrderCreationV3Json() {
    }

    public OrderCreationV3Json(PickupInfoV3Json pickupInfo, ShipmentDetailV3Json shipmentDetail, AdditionalInfoV3Json additionalInfo,
                               DropInfoV3Json dropInfo, GstInfoV3Json gstInfoV3Json) {
        this.pickupInfo = pickupInfo;
        this.shipmentDetail = shipmentDetail;
        this.additionalInfo = additionalInfo;
        this.dropInfo = dropInfo;
        this.gstInfoV3Json = gstInfoV3Json;
    }

    public PickupInfoV3Json getPickupInfo() {
        return pickupInfo;
    }

    public ShipmentDetailV3Json getShipmentDetail() {
        return shipmentDetail;
    }

    public AdditionalInfoV3Json getAdditionalInfo() {
        return additionalInfo;
    }

    public DropInfoV3Json getDropInfo() {
        return dropInfo;
    }

    public GstInfoV3Json getGstInfoV3Json() {
        return gstInfoV3Json;
    }
}
