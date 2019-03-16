package com.gupao.vip.pattern.strategy.pay;

import com.gupao.vip.pattern.strategy.Order;
import com.gupao.vip.pattern.strategy.PayState;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:41
 * @description:
 */
public class AliPay implements Payment {
    public AliPay() {
    }

    public PayState pay(Order order) {

        System.out.println("欢迎使用阿里支付，打九折");
        System.out.println("扣款: " + (order.getMoney() *0.9));
        return new PayState(200, (order.getMoney()  *0.9), "支付成功");
    }
}
