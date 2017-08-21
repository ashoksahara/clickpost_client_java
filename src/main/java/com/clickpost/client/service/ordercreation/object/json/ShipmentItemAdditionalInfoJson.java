package com.clickpost.client.service.ordercreation.object.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentItemAdditionalInfoJson {
    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("breadth")
    private Integer breadth;

    @JsonProperty("length")
    private Integer length;

    @JsonProperty("height")
    private Integer height;

    public ShipmentItemAdditionalInfoJson() {
    }

    public ShipmentItemAdditionalInfoJson(Integer weight, Integer breadth, Integer length, Integer height) {
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
