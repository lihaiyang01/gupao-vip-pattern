package com.gupao.vip.pattern.strategy.pay;

import com.gupao.vip.pattern.strategy.Order;
import com.gupao.vip.pattern.strategy.PayState;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:41
 * @description:
 */
public class JDPay implements Payment {

    public PayState pay(Order order) {

        System.out.println("欢迎使用京东支付, 满1000减100优惠");
        double money = order.getMoney();
        if (money >=1000d) {
            money = money -100d;
        }
        System.out.println("扣款: " + money);
        return new PayState(200, money, "支付成功");
    }
}
