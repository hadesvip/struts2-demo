package com.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Goods {

    private String goodName;

    private String address;

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("goodName", goodName)
                .append("address", address)
                .toString();
    }
}
