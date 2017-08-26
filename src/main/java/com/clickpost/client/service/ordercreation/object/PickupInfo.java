package com.clickpost.client.service.ordercreation.object;


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

    private PickupInfo(PickupInfoBuilder pickupInfoBuilder) {
        this.name = pickupInfoBuilder.name;
        this.phone = pickupInfoBuilder.phone;
        this.address = pickupInfoBuilder.address;
        this.pinCode = pickupInfoBuilder.pinCode;
        this.city = pickupInfoBuilder.city;
        this.state = pickupInfoBuilder.state;
        this.country = pickupInfoBuilder.country;
        this.email = pickupInfoBuilder.email;
        this.tin = pickupInfoBuilder.tin;
        this.pickupTime = pickupInfoBuilder.pickupTime;
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


    public static class PickupInfoBuilder {
        private final String name;
        private final String phone;
        private final String address;
        private final String pinCode;

        private final String city;
        private final String state;
        private final String country;


        private final String tin;
        private final Date pickupTime;

        private String email;

        public PickupInfoBuilder(String name, String phone, String address, String pinCode, String city, String state, String country, String tin, Date pickupTime) {
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.pinCode = pinCode;
            this.city = city;
            this.state = state;
            this.country = country;
            this.tin = tin;
            this.pickupTime = pickupTime;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public PickupInfo build() {
            return new PickupInfo(this);
        }
    }
}
