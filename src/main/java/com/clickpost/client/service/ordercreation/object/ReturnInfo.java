package com.clickpost.client.service.ordercreation.object;

public class ReturnInfo {
    private final String name;
    private final String phone;
    private final String address;
    private final String pinCode;

    private final String city;
    private final String state;
    private final String country;

    private ReturnInfo(ReturnInfoBuilder returnInfoBuilder) {
        this.name = returnInfoBuilder.name;
        this.phone = returnInfoBuilder.phone;
        this.address = returnInfoBuilder.address;
        this.pinCode = returnInfoBuilder.pinCode;
        this.city = returnInfoBuilder.city;
        this.state = returnInfoBuilder.state;
        this.country = returnInfoBuilder.country;
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

    public static class ReturnInfoBuilder {
        private final String name;
        private final String phone;
        private final String address;
        private final String pinCode;

        private final String city;
        private final String state;
        private final String country;

        public ReturnInfoBuilder(String name, String phone, String address, String pinCode, String city, String state, String country) {
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.pinCode = pinCode;
            this.city = city;
            this.state = state;
            this.country = country;
        }

        public ReturnInfo build() {
            return new ReturnInfo(this);
        }
    }
}
