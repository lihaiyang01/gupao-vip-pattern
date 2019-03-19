package com.gupao.vip.pattern.observer.jdk;


import java.util.Observable;

public class WechatServer extends Observable {

    public void sendMsg(String msg) {
        System.out.println("微信服务器发了一条消息: " + msg);
        setChanged();
        notifyObservers(msg);
    }
}
