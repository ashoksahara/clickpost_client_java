package com.clickpost.shippingplatform.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonProperty;


public class PickupInfoJson {
    @JsonProperty("pickup_name")
    private String name;

    @JsonProperty("pickup_phone")
    private String phone;

    @JsonProperty("pickup_address")
    private String address;

    @JsonProperty("pickup_pincode")
    private String pinCode;

    @JsonProperty("pickup_city")
    private String city;

    @JsonProperty("pickup_state")
    private String state;

    @JsonProperty("pickup_country")
    private String country;

    @JsonProperty("email")
    private String email;

    @JsonProperty("tin")
    private String tin;

    @JsonProperty("pickup_time")
    private String pickupTime;

    public PickupInfoJson() {
    }

    public PickupInfoJson(String name, String phone, String address, String pinCode, String city, String state,
                          String country, String email, String tin, String pickupTime) {
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

    public String getPickupTime() {
        return pickupTime;
    }
}
