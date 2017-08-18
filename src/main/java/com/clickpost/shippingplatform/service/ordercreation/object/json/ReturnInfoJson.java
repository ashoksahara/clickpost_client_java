package com.clickpost.shippingplatform.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnInfoJson {
    @JsonProperty("name")
    private String name;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("address")
    private String address;

    @JsonProperty("pincode")
    private String pinCode;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("country")
    private String country;

    public ReturnInfoJson() {
    }

    public ReturnInfoJson(String name, String phone, String address, String pinCode, String city, String state, String country) {
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
