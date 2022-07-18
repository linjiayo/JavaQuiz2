package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements Animal{
    int speed;
    String migrationMonth;
    String color;

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String move() {
        return "fly";
    }

    public int getSpeed() {
        return speed;
    }

    public void setMigrationMonth(String expected) {
        migrationMonth = expected;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
