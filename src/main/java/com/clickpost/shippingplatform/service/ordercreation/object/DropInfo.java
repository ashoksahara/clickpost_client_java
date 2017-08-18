package com.clickpost.shippingplatform.service.ordercreation.object;


public class DropInfo {
    private final String name_;
    private final String phone_;
    private final String address_;
    private final String pinCode_;
    private final String city_;
    private final String state_;
    private final String country_;

    public DropInfo(String name, String phone, String address, String pinCode, String city, String state, String country) {
        name_ = name;
        phone_ = phone;
        city_ = city;
        state_ = state;
        pinCode_ = pinCode;
        country_ = country;
        address_ = address;
    }

    public String getName() {
        return name_;
    }

    public String getPhone() {
        return phone_;
    }

    public String getAddress() {
        return address_;
    }

    public String getPinCode() {
        return pinCode_;
    }

    public String getCity() {
        return city_;
    }

    public String getState() {
        return state_;
    }

    public String getCountry() {
        return country_;
    }
}
