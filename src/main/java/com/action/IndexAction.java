package com.action;

import com.action.base.BaseAction;
import com.domain.User;
import com.google.gson.Gson;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class IndexAction extends BaseAction {

    private User user;

    public User getUser() {
        return user;
    }

    public IndexAction setUser(User user) {
        this.user = user;
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
