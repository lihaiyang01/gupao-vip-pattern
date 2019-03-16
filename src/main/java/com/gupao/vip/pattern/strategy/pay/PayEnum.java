package com.gupao.vip.pattern.strategy.pay;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:45
 * @description:
 */
public enum PayEnum {

    ALI_PAY(1, new AliPay()),
    JD_PAY(2, new JDPay()),
    WEICHAT_PAY(3, new WeixinPay());

    private Integer code;

    private Payment payment;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    PayEnum(Integer code, Payment payment) {
        this.code = code;
        this.payment = payment;
    }
}
