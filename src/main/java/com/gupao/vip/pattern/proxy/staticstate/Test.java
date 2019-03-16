package com.gupao.vip.pattern.proxy.staticstate;


import com.gupao.vip.pattern.proxy.bean.Zhangsan;

public class Test {

    public static void main(String[] args) {

        ZhangsanProxy proxy = new ZhangsanProxy(new Zhangsan());
        proxy.xiangQing();
    }

}
