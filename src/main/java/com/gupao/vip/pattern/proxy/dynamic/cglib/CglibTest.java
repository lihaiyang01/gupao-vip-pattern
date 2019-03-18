package com.gupao.vip.pattern.proxy.dynamic.cglib;

import com.gupao.vip.pattern.proxy.bean.Zhangsan;

public class CglibTest {

    public static void main(String[] args) {
        CglibMethodInterceptor interceptor = new CglibMethodInterceptor();
        Zhangsan zhangsan = (Zhangsan)interceptor.getInstance(Zhangsan.class);
        zhangsan.xiangQing();
    }
}
