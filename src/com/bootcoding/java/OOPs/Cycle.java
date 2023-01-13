package com.bootcoding.java.OOPs;

public class Cycle {

    String wheelType;
    String model;
    String color;
    double topSpeed;

    public static Cycle purchaseCycle(String wheelType, String model, String color, double speed){
        Cycle cycle = new Cycle();
        cycle.wheelType = " 2 wheeler ";
        cycle.model = "Hero";
        cycle.color = "Red";
        cycle.topSpeed = 30.0;


        return cycle;
    }
    public void print(){
        System.out.println("Purchasing Cycle.");
        System.out.println(" Cycle wheel type is " + wheelType);
        System.out.println(" Cycle model is " + model);
        System.out.println(" Cycle color is " + color);
        System.out.println(" Cycle Top speed is " + topSpeed);
    }
}


