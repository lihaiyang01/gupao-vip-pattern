package com.gupao.vip.pattern.strategy;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:37
 * @description:
 */
public class Order {

    private String id;

    private String orderId;

    private double money;

    public Order(String id, String orderId, double money) {
        this.id = id;
        this.orderId = orderId;
        this.money = money;
    }

    public PayState pay () {

        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id='").append(id).append('\'');
        sb.append(", orderId='").append(orderId).append('\'');
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }
}
