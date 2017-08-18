package com.clickpost.shippingplatform.service.ordercreation.object;


import org.testng.internal.Nullable;

import java.util.Date;

public class PickupInfo {
    private final String name;
    private final String phone;
    private final String address;
    private final String pinCode;

    private final String city;
    private final String state;
    private final String country;

    @Nullable
    private final String email;
    private final String tin;
    private final Date pickupTime;

    public PickupInfo(String name, String phone, String address, String pinCode, String city, String state,
                      String country, String email, String tin, Date pickupTime) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.email = email;
        this.tin = tin;
        this.pickupTime = pickupTime;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getTin() {
        return tin;
    }

    public Date getPickupTime() {
        return pickupTime;
    }
}
