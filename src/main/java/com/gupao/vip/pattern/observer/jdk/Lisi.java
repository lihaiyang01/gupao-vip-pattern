package com.gupao.vip.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到一条消息：" + arg);
    }
}
