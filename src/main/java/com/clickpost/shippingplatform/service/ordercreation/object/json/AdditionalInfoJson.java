package com.clickpost.shippingplatform.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalInfoJson {
    @JsonProperty("delivery_type")
    private String deliveryType;

    @JsonProperty("rvp_reason")
    private String rvpReason;

    @JsonProperty("async")
    private Boolean async;

    @JsonProperty("awb_number")
    private String awbNumber;

    @JsonProperty("label")
    private Boolean label;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("return_info")
    private ReturnInfoJson returnInfoJson;

    public AdditionalInfoJson() {
    }

    public AdditionalInfoJson(String deliveryType, String rvpReason, Boolean async, String awbNumber,
                              Boolean label, String priority, ReturnInfoJson returnIInfoJson) {
        this.deliveryType = deliveryType;
        this.rvpReason = rvpReason;
        this.async = async;
        this.awbNumber = awbNumber;
        this.label = label;
        this.priority = priority;
        this.returnInfoJson = returnIInfoJson;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public String getRvpReason() {
        return rvpReason;
    }

    public Boolean getAsync() {
        return async;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public Boolean getLabel() {
        return label;
    }

    public String getPriority() {
        return priority;
    }

    public ReturnInfoJson getReturnIInfoJson() {
        return returnInfoJson;
    }
}
