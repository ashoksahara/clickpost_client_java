package com.clickpost.client.service.ordercreation.object.v3Json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentItemAdditionalInfoV3Json {
    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("breadth")
    private Integer breadth;

    @JsonProperty("length")
    private Integer length;

    @JsonProperty("height")
    private Integer height;

    public ShipmentItemAdditionalInfoV3Json() {
    }

    public ShipmentItemAdditionalInfoV3Json(Integer weight, Integer breadth, Integer length, Integer height) {
        this.weight = weight;
        this.breadth = breadth;
        this.length = length;
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getHeight() {
        return height;
    }
}
