package com.clickpost.client.service.ordercreation.object.v3Json;


import com.fasterxml.jackson.annotation.JsonProperty;

public class DropInfoV3Json {
    @JsonProperty("drop_name")
    private String name;

    @JsonProperty("drop_phone")
    private String phone;

    @JsonProperty("drop_address")
    private String address;

    @JsonProperty("drop_pincode")
    private String pinCode;

    @JsonProperty("drop_city")
    private String city;

    @JsonProperty("drop_state")
    private String state;

    @JsonProperty("drop_country")
    private String country;

    public DropInfoV3Json() {
    }

    public DropInfoV3Json(String name, String phone, String address, String pinCode, String city, String state, String country) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
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
}
