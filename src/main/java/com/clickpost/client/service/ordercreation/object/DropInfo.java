package com.clickpost.client.service.ordercreation.object;


public class DropInfo {
    private final String name;
    private final String phone;
    private final String address;
    private final String pinCode;
    private final String city;
    private final String state;
    private final String country;

    private DropInfo(DropInfoBuilder dropInfoBuilder) {
        this.name = dropInfoBuilder.name;
        this.phone = dropInfoBuilder.phone;
        this.address = dropInfoBuilder.address;
        this.pinCode = dropInfoBuilder.pinCode;
        this.city = dropInfoBuilder.city;
        this.state = dropInfoBuilder.state;
        this.country = dropInfoBuilder.country;
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

    public static class DropInfoBuilder {
        private final String name;
        private final String phone;
        private final String address;
        private final String pinCode;
        private final String city;
        private final String state;
        private final String country;

        public DropInfoBuilder(String name, String phone, String address, String pinCode, String city, String state, String country) {
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.pinCode = pinCode;
            this.city = city;
            this.state = state;
            this.country = country;
        }

        public DropInfo build() {
            return new DropInfo(this);
        }
    }
}
