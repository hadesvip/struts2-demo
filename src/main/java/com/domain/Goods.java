package com.domain;

public class Goods {

    private String goodName;

    private String address;

    public String getGoodName() {
        return goodName;
    }

    public Goods setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Goods setAddress(String address) {
        this.address = address;
        return this;
    }
}
