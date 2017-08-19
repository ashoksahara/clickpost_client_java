package com.clickpost.shippingplatform.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderCreationResponseResultBodyJson {
    @JsonProperty("reference_number")
    private String referenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("waybill")
    private String waybill;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("label")
    private String label;

    public OrderCreationResponseResultBodyJson() {
    }

    public OrderCreationResponseResultBodyJson(String referenceNumber, String waybill, String label) {
        this.referenceNumber = referenceNumber;
        this.waybill = waybill;
        this.label = label;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getWaybill() {
        return waybill;
    }

    public String getLabel() {
        return label;
    }
}
