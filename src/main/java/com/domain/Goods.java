package com.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("goodName", goodName)
                .append("address", address)
                .toString();
    }
}
