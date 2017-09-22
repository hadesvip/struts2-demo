package com.domain;

import java.util.List;

public class User {

    private String userName;

    private String email;


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

    private List<Goods> goodsList;
}
