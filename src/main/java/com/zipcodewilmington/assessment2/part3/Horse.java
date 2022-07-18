package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal {
    int speed;
    String color;

    public Horse() {
        speed = 40;
        color = "brown";
    }
    @Override
    public String move() {
        return "gallop";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String color() {
        return color;
    }
}
