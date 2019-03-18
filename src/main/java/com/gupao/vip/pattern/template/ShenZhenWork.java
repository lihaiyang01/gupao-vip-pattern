package com.gupao.vip.pattern.template;

public class ShenZhenWork implements IWork {
    @Override
    public void gotoWork() {
        System.out.println("坐公交去上班");
    }

    @Override
    public void work() {
        System.out.println("工作是撸代码");
    }

    @Override
    public void goHome() {
        System.out.println("回家");
    }
}
