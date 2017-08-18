package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

public class AdditionalInfo {
    @Nullable
    private final DeliveryType deliveryType_;

    @Nullable
    private final String rvpReason_;

    @Nullable
    private final boolean async_;

    @Nullable
    private final String awbNumber_;

    @Nullable
    private final boolean label_;

    @Nullable
    private final String priority_;

    @Nullable
    private final ReturnInfo returnInfo_;

    public AdditionalInfo(DeliveryType deliveryType, String rvpReason, boolean async, String awbNumber, boolean label,
                          String priority, ReturnInfo returnInfo) {
        deliveryType_ = deliveryType;
        rvpReason_ = rvpReason;
        async_ = async;
        awbNumber_ = awbNumber;
        label_ = label;
        priority_ = priority;
        returnInfo_ = returnInfo;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType_;
    }

    public String getRvpReason() {
        return rvpReason_;
    }

    public boolean isAsync() {
        return async_;
    }

    public String getAwbNumber() {
        return awbNumber_;
    }

    public boolean isLabel() {
        return label_;
    }

    public String getPriority() {
        return priority_;
    }

    public ReturnInfo getReturnInfo() {
        return returnInfo_;
    }
}
