package com.gupao.vip.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 10:40
 * @description:
 */
public class MyDynamicProxyHandler implements InvocationHandler {

    public Object obj;

    public Object getProxyInstance(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        method.invoke(obj, args);
        after();
        return null;
    }

    private void after() {
        System.out.println("散步。。。");
    }

    private void before() {
        System.out.println("洗手。。。");
    }
}
