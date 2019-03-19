package com.gupao.vip.pattern.observer;

import com.google.common.eventbus.Subscribe;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question) {
        System.out.println("老师: " + this.getName() + ", 接收到一个通知: ");
        System.out.println("学生: " + question.getUserName() + "在" + question.getCreateDate()+ "时间提了一个问题，内容为: " + question.getContent());

    }

}
