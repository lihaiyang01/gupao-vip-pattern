package com.gupao.vip.pattern.observer;

import java.util.Date;

public class Question {

    private String userName;
    private String content;
    private Date createDate;

    public Question(String userName, String content, Date createDate) {
        this.userName = userName;
        this.content = content;
        this.createDate = createDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
