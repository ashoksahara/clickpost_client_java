package com.clickpost.client.service.ordercreation.object;

import org.testng.internal.Nullable;

public class OrderCreationObject {
    private final PickupInfo pickupInfo;
    private final ShipmentDetail shipmentDetail;

    @Nullable
    private final AdditionalInfo additionalInfo;
    private final DropInfo dropInfo;

    @Nullable
    private final ReturnInfo returnInfo;

    @Nullable
    private final GstInfo gstInfo;

    public OrderCreationObject(PickupInfo pickupInfo, ShipmentDetail shipmentDetail, AdditionalInfo additionalInfo, DropInfo dropInfo,
                               ReturnInfo returnInfo, GstInfo gstInfo) {
        this.pickupInfo = pickupInfo;
        this.shipmentDetail = shipmentDetail;
        this.additionalInfo = additionalInfo;
        this.dropInfo = dropInfo;
        this.returnInfo = returnInfo;
        this.gstInfo = gstInfo;
    }

    public PickupInfo getPickupInfo() {
        return pickupInfo;
    }

    public ShipmentDetail getShipmentDetail() {
        return shipmentDetail;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public DropInfo getDropInfo() {
        return dropInfo;
    }

    public ReturnInfo getReturnInfo() {
        return returnInfo;
    }

    public GstInfo getGstInfo() {
        return gstInfo;
    }
}
