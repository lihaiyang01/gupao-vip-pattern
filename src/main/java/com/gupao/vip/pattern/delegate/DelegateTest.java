package com.gupao.vip.pattern.delegate;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 12:02
 * @description:
 */
public class DelegateTest {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.command("端茶", new Leader());
    }
}
