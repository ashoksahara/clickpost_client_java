package com.clickpost.client.service.ordercreation.object.v3Json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnInfoV3Json {
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("phone")
    private String phone;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("address")
    private String address;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("pincode")
    private String pinCode;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("city")
    private String city;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("state")
    private String state;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("country")
    private String country;

    public ReturnInfoV3Json() {
    }

    public ReturnInfoV3Json(String name, String phone, String address, String pinCode, String city, String state, String country) {
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
