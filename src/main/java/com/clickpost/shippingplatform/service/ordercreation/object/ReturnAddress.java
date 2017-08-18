package com.clickpost.shippingplatform.service.ordercreation.object;

public class ReturnAddress {
    private final String pinCode_;
    private final String city_;
    private final String country_;
    private final String name_;
    private final String state_;
    private final String phone_;
    private final String address_;

    public ReturnAddress(String pinCode, String city, String country, String name, String state, String phone, String address) {
        pinCode_ = pinCode;
        city_ = city;
        country_ = country;
        name_ = name;
        state_ = state;
        phone_ = phone;
        address_ = address;
    }

    public String getPinCode() {
        return pinCode_;
    }

    public String getCity() {
        return city_;
    }

    public String getCountry() {
        return country_;
    }

    public String getName() {
        return name_;
    }

    public String getState() {
        return state_;
    }

    public String getPhone() {
        return phone_;
    }

    public String getAddress() {
        return address_;
    }
}
