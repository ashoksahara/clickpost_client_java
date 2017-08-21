package com.clickpost.client.service.ordercreation.object;


public class ShipmentItemAdditionalInfo {
    private final int weight_;
    private final int breadth_;
    private final int length_;
    private final int height_;

    public ShipmentItemAdditionalInfo(int weight, int breadth, int length, int height) {
        weight_ = weight;
        breadth_ = breadth;
        length_ = length;
        height_ = height;
    }

    public int getWeight() {
        return weight_;
    }

    public int getBreadth() {
        return breadth_;
    }

    public int getLength() {
        return length_;
    }

    public int getHeight() {
        return height_;
    }
}
