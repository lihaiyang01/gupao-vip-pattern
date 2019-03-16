package com.gupao.vip.pattern.strategy;

import com.gupao.vip.pattern.strategy.pay.PayEnum;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:49
 * @description:
 */
public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1", "20190101", 1000.0d);
        System.out.println(PayEnum.WEICHAT_PAY.getPayment().pay(order));
    }
}
