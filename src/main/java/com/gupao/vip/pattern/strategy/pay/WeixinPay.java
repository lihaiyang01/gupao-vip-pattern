package com.gupao.vip.pattern.strategy.pay;

import com.gupao.vip.pattern.strategy.Order;
import com.gupao.vip.pattern.strategy.PayState;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:41
 * @description:
 */
public class WeixinPay implements Payment {

    public PayState pay(Order order) {

        System.out.println("欢迎使用微信支付，手续费10");
        System.out.println("扣款: " + (order.getMoney() +10));
        return new PayState(200, (order.getMoney()  +10), "支付成功");
    }
}
