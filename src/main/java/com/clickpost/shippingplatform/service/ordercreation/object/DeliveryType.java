package com.clickpost.shippingplatform.service.ordercreation.object;


public enum DeliveryType {
    FORWARD(1, "FORWARD"),
    REVERSE(2, "REVERSE");

    private int ordinal;
    private String name;


    private DeliveryType(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getOrdinal() {
        return this.ordinal;
    }

    public static DeliveryType getDeliveryTypeByOrdinal(int ordinal) {
        for (DeliveryType e : DeliveryType.values()) {
            if (e.ordinal == ordinal) {
                return e;
            }
        }
        return null;
    }

    public static DeliveryType getDeliveryTypeByName(String name) {
        for (DeliveryType e : DeliveryType.values()) {
            if (e.name.equals(name)) {
                return e;
            }
        }
        return null;
    }
}
