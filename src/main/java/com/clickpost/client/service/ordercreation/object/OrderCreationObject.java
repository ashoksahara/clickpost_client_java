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

    private OrderCreationObject(OrderCreationObjectBuilder orderCreationObjectBuilder) {
        this.pickupInfo = orderCreationObjectBuilder.pickupInfo;
        this.shipmentDetail = orderCreationObjectBuilder.shipmentDetail;
        this.additionalInfo = orderCreationObjectBuilder.additionalInfo;
        this.dropInfo = orderCreationObjectBuilder.dropInfo;
        this.returnInfo = orderCreationObjectBuilder.returnInfo;
        this.gstInfo = orderCreationObjectBuilder.gstInfo;
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

    public static class OrderCreationObjectBuilder {
        private final PickupInfo pickupInfo;
        private final ShipmentDetail shipmentDetail;

        private final DropInfo dropInfo;

        private AdditionalInfo additionalInfo;

        private ReturnInfo returnInfo;

        private GstInfo gstInfo;

        public OrderCreationObjectBuilder(PickupInfo pickupInfo, ShipmentDetail shipmentDetail, DropInfo dropInfo) {
            this.pickupInfo = pickupInfo;
            this.shipmentDetail = shipmentDetail;
            this.dropInfo = dropInfo;
        }

        public void setAdditionalInfo(AdditionalInfo additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public void setReturnInfo(ReturnInfo returnInfo) {
            this.returnInfo = returnInfo;
        }

        public void setGstInfo(GstInfo gstInfo) {
            this.gstInfo = gstInfo;
        }

        public OrderCreationObject build() {
            return new OrderCreationObject(this);
        }
    }
}
