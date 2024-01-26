package com.goonok.car;

import com.goonok.Vehicle.Vehicle;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int wheels, String type, int doors, int gears, boolean isManual, int currentGear) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void changeGear(int gears) {
        this.currentGear = gears;
        System.out.println("change gear method called: changed to " + this.currentGear+" gears");
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("Change speed method called: Speed -> " + newSpeed + " direction -> " + newDirection);
    }
}
