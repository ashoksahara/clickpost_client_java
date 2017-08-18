package com.clickpost.shippingplatform.service.ordercreation.object;


import com.sun.istack.internal.Nullable;

public class PickupAddress {
    private final String name_;
    private final String phone_;
    
    @Nullable
    private final String email_;
    private final String city_;
    private final String state_;
    private final String pinCode_;
    private final String country_;
    private final String address_;

    public PickupAddress(String name, String phone, String email, String city, String state, String pinCode, String country,
                         String address) {
        name_ = name;
        phone_ = phone;
        email_ = email;
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

    public String getEmail() {
        return email_;
    }

    public String getCity() {
        return city_;
    }

    public String getState() {
        return state_;
    }

    public String getPinCode() {
        return pinCode_;
    }

    public String getCountry() {
        return country_;
    }

    public String getAddress() {
        return address_;
    }
}
