package com.clickpost.shippingplatform.service.ordercreation.object;


public enum OrderType {
    COD(1, "COD"),
    PREPAID(2, "PREPAID");

    private int ordinal;
    private String name;

    private OrderType(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public static OrderType getOrderTypeByOrdinal(int ordinal) {
        for (OrderType e : OrderType.values()) {
            if (e.ordinal == ordinal) {
                return e;
            }
        }
        return null;
    }

    public static OrderType getOrderTypeByName(String name) {
        for (OrderType e : OrderType.values()) {
            if (e.name.equals(name)) {
                return e;
            }
        }
        return null;
    }
}
