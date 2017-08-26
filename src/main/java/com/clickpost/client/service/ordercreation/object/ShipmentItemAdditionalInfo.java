package com.clickpost.client.service.ordercreation.object;


public class ShipmentItemAdditionalInfo {
    private final int weight;
    private final int breadth;
    private final int length;
    private final int height;

    private ShipmentItemAdditionalInfo(ShipmentItemAdditionalInfoBuilder shipmentItemAdditionalInfoBuilder) {
        this.weight = shipmentItemAdditionalInfoBuilder.weight;
        this.breadth = shipmentItemAdditionalInfoBuilder.breadth;
        this.length = shipmentItemAdditionalInfoBuilder.length;
        this.height = shipmentItemAdditionalInfoBuilder.height;
    }

    public int getWeight() {
        return weight;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public static class ShipmentItemAdditionalInfoBuilder {
        private final int weight;
        private final int breadth;
        private final int length;
        private final int height;

        public ShipmentItemAdditionalInfoBuilder(int weight, int breadth, int length, int height) {
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
