package com.gupao.vip.pattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        QueryCustomerService customerService = new QueryCustomerService();
        customerService.queryCustomerOrderByLastSeeTime("1");
        customerService.queryCustomerOrderByLastSeeTime("2");
        QueryCustomersThirdService customersThirdService = new QueryCustomersThirdService(customerService);
        customersThirdService.queryCustomerOrderByLastSeeTime("1");
        customersThirdService.queryCustomerOrderByLastFollowUpDate("2");
        customersThirdService.queryCustomerOrderByDealRate("3");
    }

}
