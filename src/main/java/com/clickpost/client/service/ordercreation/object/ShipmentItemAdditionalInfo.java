package com.clickpost.client.service.ordercreation.object;


public class ShipmentItemAdditionalInfo {
    private final int weight;
    private final int breadth;
    private final int length;
    private final int height;

    public ShipmentItemAdditionalInfo(int weight, int breadth, int length, int height) {
        this.weight = weight;
        this.breadth = breadth;
        this.length = length;
        this.height = height;
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
}
