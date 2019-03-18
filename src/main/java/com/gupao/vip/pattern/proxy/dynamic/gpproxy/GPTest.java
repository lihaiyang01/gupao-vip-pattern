package com.gupao.vip.pattern.proxy.dynamic.gpproxy;

import com.gupao.vip.pattern.proxy.bean.Person;
import com.gupao.vip.pattern.proxy.bean.Zhangsan;

public class GPTest {

    public static void main(String[] args) {

        GPProxyInvocationHandler handler = new GPProxyInvocationHandler();
        Person person = (Person) handler.getProxyInstance(new Zhangsan());
        person.xiangQing();
    }
}
