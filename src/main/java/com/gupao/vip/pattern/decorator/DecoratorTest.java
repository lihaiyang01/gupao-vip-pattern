package com.gupao.vip.pattern.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        House house = new SeasideVilla();
        House lightDecorator = new LightDecorator(house);
        House gardenDecorator = new GardenDecorator(lightDecorator);
        gardenDecorator.fitUpHouse();
    }
}
