package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

public class AdditionalInfo {
    @Nullable
    private final DeliveryType deliveryType;

    @Nullable
    private final String rvpReason;

    @Nullable
    private final boolean async;

    @Nullable
    private final String awbNumber;

    @Nullable
    private final boolean label;

    @Nullable
    private final String priority;


    public AdditionalInfo(DeliveryType deliveryType, String rvpReason, boolean async, String awbNumber, boolean label,
                          String priority) {
        this.deliveryType = deliveryType;
        this.rvpReason = rvpReason;
        this.async = async;
        this.awbNumber = awbNumber;
        this.label = label;
        this.priority = priority;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public String getRvpReason() {
        return rvpReason;
    }

    public boolean isAsync() {
        return async;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public boolean isLabel() {
        return label;
    }

    public String getPriority() {
        return priority;
    }

}
