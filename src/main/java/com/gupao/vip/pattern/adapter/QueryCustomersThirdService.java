package com.gupao.vip.pattern.adapter;

public class QueryCustomersThirdService {

    private QueryCustomerService queryCustomerService;

    public QueryCustomersThirdService(QueryCustomerService queryCustomerService) {
        this.queryCustomerService = queryCustomerService;
    }

    public void queryCustomerOrderByLastSeeTime(String cardId) {
        queryCustomerService.queryCustomerOrderByLastSeeTime(cardId);
    }
    public void queryCustomerOrderByLastFollowUpDate(String cardId) {
        queryCustomerService.queryCustomerOrderByLastFollowUpDate(cardId);
    }
    public void queryCustomerOrderByDealRate(String cardId) {
        System.out.println("按预计成交率查询客户列表, 条件: " + cardId);
    }

}
