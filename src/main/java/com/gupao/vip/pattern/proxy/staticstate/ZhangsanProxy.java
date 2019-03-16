package com.gupao.vip.pattern.proxy.staticstate;

import com.gupao.vip.pattern.proxy.bean.Person;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 10:52
 * @description:
 */
public class ZhangsanProxy implements Person {

    private Person person;

    public ZhangsanProxy(Person person) {
        this.person = person;
    }

    public void xiangQing() {
        System.out.println("代理之前做事..");
        person.xiangQing();
        System.out.println("代理之后做事..");
    }
}
