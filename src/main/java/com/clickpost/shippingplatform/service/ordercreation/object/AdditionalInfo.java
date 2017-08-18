package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

public class AdditionalInfo {
    private final DeliveryType deliveryType_;
    private final String rvpReason_;
    private final boolean async_;

    @Nullable
    private final String awbNumber_;
    private final boolean label_;
    private final String priority_;
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
