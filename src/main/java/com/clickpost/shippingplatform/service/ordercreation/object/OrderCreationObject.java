package com.clickpost.shippingplatform.service.ordercreation.object;

public class OrderCreationObject {
    private final PickupInfo pickupInfo;
    private final ShipmentDetail shipmentDetail;
    private final AdditionalInfo additionalInfo;
    private final DropInfo dropInfo;

    public OrderCreationObject(PickupInfo pickupInfo, ShipmentDetail shipmentDetail, AdditionalInfo additionalInfo, DropInfo dropInfo) {
        this.pickupInfo = pickupInfo;
        this.shipmentDetail = shipmentDetail;
        this.additionalInfo = additionalInfo;
        this.dropInfo = dropInfo;
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
}
