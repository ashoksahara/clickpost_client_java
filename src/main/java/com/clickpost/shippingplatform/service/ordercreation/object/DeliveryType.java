package com.clickpost.shippingplatform.service.ordercreation.object;


public enum DeliveryType {
    FORWARD(1, "FORWARD"),
    REVERSE(2, "REVERSE");

    private int ordinal_;
    private String name_;


    private DeliveryType(int ordinal, String name) {
        ordinal_ = ordinal;
        name_ = name;
    }

    public static DeliveryType getDeliveryTypeByOrdinal(int ordinal) {
        for (DeliveryType e : DeliveryType.values()) {
            if (e.ordinal_ == ordinal) {
                return e;
            }
        }
        return null;
    }

    public static DeliveryType getDeliveryTypeByName(String name) {
        for (DeliveryType e : DeliveryType.values()) {
            if (e.name_.equals(name)) {
                return e;
            }
        }
        return null;
    }
}
