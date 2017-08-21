package com.clickpost.shippingplatform.service.ordercreation.object;

public enum ClickPostConfig {
    TEST("http", "test.clickpost.in", "api/v3/create-order/"),
    PROD("https", "www.clickpost.in", "api/v3/create-order/");

    private String scheme;
    private String host;
    private String path;

    private ClickPostConfig(String scheme, String host, String path) {
        this.scheme = scheme;
        this.host = host;
        this.path = path;
    }

    public String getScheme() {
        return scheme;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }
}
