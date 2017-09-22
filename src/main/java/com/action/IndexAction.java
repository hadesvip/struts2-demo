package com.action;

import com.action.base.BaseAction;
import com.domain.Goods;
import com.domain.User;
import com.google.gson.Gson;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public class IndexAction extends BaseAction {

    private User user;

    public User getUser() {
        return user;
    }

    public IndexAction setUser(User user) {
        this.user = user;
        return this;
    }

    private String userName;

    private String email;

    private List<Goods> goodsList;

    public String getUserName() {
        return userName;
    }

    public IndexAction setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public IndexAction setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public IndexAction setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
        return this;
    }

    public String home() throws IOException {
        HttpServletRequest request = ServletActionContext.getRequest();
        String jsonStr = this.parseReqJsonData(request);
        System.out.println(jsonStr);
        Gson gson = new Gson();
        user = gson.fromJson(jsonStr, User.class);
//        System.out.println(user);
//        System.out.println(goodsList);
        return SUCCESS;
    }
}
