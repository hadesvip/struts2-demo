package com.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class User {

    private String userName;

    private String email;

    private List<Goods> goodsList;

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public User setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userName", userName)
                .append("email", email)
                .append("goodsList", goodsList)
                .toString();
    }
}
