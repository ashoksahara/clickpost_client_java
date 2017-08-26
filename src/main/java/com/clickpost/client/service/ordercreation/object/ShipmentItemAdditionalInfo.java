package com.clickpost.client.service.ordercreation.object;


public class ShipmentItemAdditionalInfo {
    private final Integer weight;
    private final Integer breadth;
    private final Integer length;
    private final Integer height;

    private ShipmentItemAdditionalInfo(ShipmentItemAdditionalInfoBuilder shipmentItemAdditionalInfoBuilder) {
        this.weight = shipmentItemAdditionalInfoBuilder.weight;
        this.breadth = shipmentItemAdditionalInfoBuilder.breadth;
        this.length = shipmentItemAdditionalInfoBuilder.length;
        this.height = shipmentItemAdditionalInfoBuilder.height;
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

    public static class ShipmentItemAdditionalInfoBuilder {
        private final Integer weight;
        private final Integer breadth;
        private final Integer length;
        private final Integer height;

        public ShipmentItemAdditionalInfoBuilder(Integer weight, Integer breadth, Integer length, Integer height) {
            this.weight = weight;
            this.breadth = breadth;
            this.length = length;
            this.height = height;
        }

        public ShipmentItemAdditionalInfo build() {
            return new ShipmentItemAdditionalInfo(this);
        }
    }
}
