package com.gupao.vip.pattern.proxy.dynamic;

import com.gupao.vip.pattern.proxy.bean.Person;
import com.gupao.vip.pattern.proxy.bean.Zhangsan;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        MyDynamicProxyHandler myDynamicProxyHandler = new MyDynamicProxyHandler();

        Person p = (Person) myDynamicProxyHandler.getProxyInstance(new Zhangsan());
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:/$Proxy0.class");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.xiangQing();
    }

}
