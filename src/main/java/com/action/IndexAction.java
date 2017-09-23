package com.action;

import com.action.base.BaseAction;
import com.domain.Goods;
import com.domain.User;
import com.google.gson.Gson;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * 注意：使用struts-json接收json格式数据时候，action对应的属性set方法返回值一定要是void
 */
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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    /**
     * @return
     * @see #parseReqJsonData 方法跟struts-json插件读取json只能存在一个，因为request.getInputStream().read()只能读取一次
     * @see ServletRequest#getInputStream()
     */
    public String home() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String jsonStr = null;
        try {
            jsonStr = this.parseReqJsonData(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(jsonStr);
        Gson gson = new Gson();
        user = gson.fromJson(jsonStr, User.class);
//        System.out.println(user);
//        System.out.println(goodsList);
        return SUCCESS;
    }
}
