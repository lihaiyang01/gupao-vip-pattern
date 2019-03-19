package com.gupao.vip.pattern.observer.jdk;

public class JDKTest {

    public static void main(String[] args) {
        Zhangsan zhangsan = new Zhangsan();
        zhangsan.setName("张三~");
        Lisi lisi = new Lisi();
        lisi.setName("李四");
        WechatServer wechatServer = new WechatServer();
        wechatServer.addObserver(lisi);
        wechatServer.addObserver(zhangsan);
        wechatServer.sendMsg("JAVA是最好的语言");
    }

}
