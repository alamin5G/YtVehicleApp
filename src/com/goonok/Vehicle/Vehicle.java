package com.goonok.Vehicle;

public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
    }

    public void steer(int currentDirection){
        this.currentDirection = currentDirection;
        System.out.println("Steer method called: Steering at " + currentDirection + " Degrees");
    }

    public void move(int currentSpeed, int currentDirection){
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
        System.out.println("Move method called: Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehicle is stopped!");
    }
}
