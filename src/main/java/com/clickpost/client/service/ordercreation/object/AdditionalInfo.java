package com.clickpost.client.service.ordercreation.object;


import org.testng.internal.Nullable;

public class AdditionalInfo {
    @Nullable
    private final DeliveryType deliveryType;

    @Nullable
    private final String rvpReason;

    @Nullable
    private final Boolean async;

    @Nullable
    private final String awbNumber;

    @Nullable
    private final Boolean label;

    @Nullable
    private final String priority;


    private AdditionalInfo(AdditionalInfoBuilder additionalInfoBuilder) {
        this.deliveryType = additionalInfoBuilder.deliveryType;
        this.rvpReason = additionalInfoBuilder.rvpReason;
        this.async = additionalInfoBuilder.async;
        this.awbNumber = additionalInfoBuilder.awbNumber;
        this.label = additionalInfoBuilder.label;
        this.priority = additionalInfoBuilder.priority;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public String getRvpReason() {
        return rvpReason;
    }

    public Boolean isAsync() {
        return async;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public Boolean isLabel() {
        return label;
    }

    public String getPriority() {
        return priority;
    }

    public static class AdditionalInfoBuilder {
        private DeliveryType deliveryType;

        private String rvpReason;

        private boolean async;

        private String awbNumber;

        private boolean label;

        private String priority;

        public AdditionalInfoBuilder() {
        }

        public void setDeliveryType(DeliveryType deliveryType) {
            this.deliveryType = deliveryType;
        }

        public void setRvpReason(String rvpReason) {
            this.rvpReason = rvpReason;
        }

        public void setAsync(boolean async) {
            this.async = async;
        }

        public void setAwbNumber(String awbNumber) {
            this.awbNumber = awbNumber;
        }

        public void setLabel(boolean label) {
            this.label = label;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public AdditionalInfo build() {
            return new AdditionalInfo(this);
        }
    }
}
