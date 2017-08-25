package com.clickpost.client.service.ordercreation.object.v3Json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalInfoV3Json {
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("delivery_type")
    private String deliveryType;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("rvp_reason")
    private String rvpReason;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("async")
    private Boolean async;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("awb_number")
    private String awbNumber;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("label")
    private Boolean label;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("priority")
    private String priority;

    @JsonProperty("return_info")
    @JsonInclude(Include.NON_NULL)
    private ReturnInfoV3Json returnInfoV3Json;

    public AdditionalInfoV3Json() {
    }

    public AdditionalInfoV3Json(String deliveryType, String rvpReason, Boolean async, String awbNumber,
                                Boolean label, String priority, ReturnInfoV3Json returnIInfoJson) {
        this.deliveryType = deliveryType;
        this.rvpReason = rvpReason;
        this.async = async;
        this.awbNumber = awbNumber;
        this.label = label;
        this.priority = priority;
        this.returnInfoV3Json = returnIInfoJson;
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

    public ReturnInfoV3Json getReturnIInfoJson() {
        return returnInfoV3Json;
    }


}
