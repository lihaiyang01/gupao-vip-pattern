package com.gupao.vip.pattern.decorator;

public class LightDecorator implements House {

    private House house;

    public LightDecorator(House house) {
        this.house = house;
    }

    public void fitUpHouse() {
        house.fitUpHouse();
        System.out.println("我给每个房子安装大大的电灯");
    }
}
