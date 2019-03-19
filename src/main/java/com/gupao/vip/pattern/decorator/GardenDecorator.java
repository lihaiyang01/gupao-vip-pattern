package com.gupao.vip.pattern.decorator;

public class GardenDecorator implements House {

    private House house;

    public GardenDecorator(House house) {
        this.house = house;
    }

    public void fitUpHouse() {
        house.fitUpHouse();
        System.out.println("在房子的前面装一个大花园，种满花草");
    }
}
