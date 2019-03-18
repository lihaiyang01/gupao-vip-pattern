package com.gupao.vip.pattern.template;

public interface IWork {

    default void oneDayPlan() {
        qichuang();
        gotoWork();
        work();
        goHome();
    }

    default void qichuang() {
        System.out.println("起床");
    }
    void gotoWork();

    void work();

    void goHome();

}
