package com.bootcoding.java.OOPs.object;

public class Car {

    public String brandName;
    public String model;
    public String color;
    public String lights;
    public String seats;
    public String fuelType;

    public void startEngine() {
        System.out.println("Car started");
    }

    public void stopEngine() {
        System.out.println("Car Stopped");
    }

    public void move() {
        System.out.println("Car is moving");
    }

    public void print() {
        System.out.println("Car Brand : " + brandName);
        System.out.println("Car Model : " + model);
        System.out.println("Car Color : " + color);
        System.out.println("Car Lights : " + lights);
        System.out.println("Car Seats : " + seats);
        System.out.println("Car FuelType : " + fuelType);
    }
}
