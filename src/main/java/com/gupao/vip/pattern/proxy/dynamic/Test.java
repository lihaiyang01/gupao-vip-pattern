package com.gupao.vip.pattern.proxy.dynamic;

import com.gupao.vip.pattern.prototype.bean.Clazz;
import com.gupao.vip.pattern.prototype.bean.Student;
import com.gupao.vip.pattern.proxy.bean.Person;
import com.gupao.vip.pattern.proxy.bean.Zhangsan;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        MyDynamicProxyHandler myDynamicProxyHandler = new MyDynamicProxyHandler();
        Person p = (Person) myDynamicProxyHandler.getProxyInstance(new Zhangsan());
        p.xiangQing();
    }

}
