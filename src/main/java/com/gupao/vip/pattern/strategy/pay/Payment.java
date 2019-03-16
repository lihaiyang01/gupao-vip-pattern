package com.gupao.vip.pattern.strategy.pay;

import com.gupao.vip.pattern.strategy.Order;
import com.gupao.vip.pattern.strategy.PayState;

public interface Payment {

    PayState pay(Order order);

}
