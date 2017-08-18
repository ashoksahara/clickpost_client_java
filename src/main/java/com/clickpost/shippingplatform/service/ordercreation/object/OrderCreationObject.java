package com.clickpost.shippingplatform.service.ordercreation.object;

public class OrderCreationObject {
    private final PickupInfo pickupInfo_;
    private final ShipmentDetail shipmentDetail_;
    private final AdditionalInfo additionalInfo_;
    private final DropInfo dropInfo_;

    public OrderCreationObject(PickupInfo pickupInfo, ShipmentDetail shipmentDetail, AdditionalInfo additionalInfo, DropInfo dropInfo) {
        pickupInfo_ = pickupInfo;
        shipmentDetail_ = shipmentDetail;
        additionalInfo_ = additionalInfo;
        dropInfo_ = dropInfo;
    }

    public PickupInfo getPickupInfo() {
        return pickupInfo_;
    }

    public ShipmentDetail getShipmentDetail() {
        return shipmentDetail_;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo_;
    }

    public DropInfo getDropInfo() {
        return dropInfo_;
    }
}
