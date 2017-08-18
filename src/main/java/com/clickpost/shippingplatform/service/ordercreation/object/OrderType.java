package com.clickpost.shippingplatform.service.ordercreation.object;


public enum OrderType {
    COD(1, "COD"),
    PREPAID(2, "PREPAID");

    private int ordinal_;
    private String name_;

    private OrderType(int ordinal, String name) {
        ordinal_ = ordinal;
        name_ = name;
    }

    public static OrderType getOrderTypeByOrdinal(int ordinal) {
        for (OrderType e : OrderType.values()) {
            if (e.ordinal_ == ordinal) {
                return e;
            }
        }
        return null;
    }

    public static OrderType getOrderTypeByName(String name) {
        for (OrderType e : OrderType.values()) {
            if (e.name_.equals(name)) {
                return e;
            }
        }
        return null;
    }
}
