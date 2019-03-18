package com.gupao.vip.pattern.adapter;

public class QueryCustomerService {

    public void queryCustomerOrderByLastSeeTime(String cardId) {
        System.out.println("按客户的最后查看时间来查询客户列表, 条件: " + cardId);
    }
    public void queryCustomerOrderByLastFollowUpDate(String cardId) {
        System.out.println("按客户的最后跟进时间来查询客户列表, 条件: " + cardId);
    }
}
