package com.gupao.vip.pattern.proxy.staticstate;

import com.gupao.vip.pattern.proxy.bean.Person;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 10:52
 * @description:
 *
 *
 * 静态代理总结：
 * 优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
 * 缺点：代理xu*
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
