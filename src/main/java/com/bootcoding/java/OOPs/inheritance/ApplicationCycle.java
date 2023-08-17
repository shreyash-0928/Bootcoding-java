package com.bootcoding.java.OOPs.inheritance;

public class ApplicationCycle {
    public static void main(String[] args) {

        ElectricalCycle ec = new ElectricalCycle();
        ec.cycleType = "Electrical";
        ec.price = 8000;
        ec.color = "red";
        ec.topSpeed = 50;
        ec.createCycle();
        ec.move();

        GearCycle gc = new GearCycle();
        gc.cycleType = "Electrical";
        gc.price = 8000;
        gc.color = "red";
        gc.topSpeed = 50;
        gc.createCycle();
        gc.move();

        NonGearCycle ngc = new NonGearCycle();
        ngc.cycleType = "Electrical";
        ngc.price = 8000;
        ngc.color = "red";
        ngc.topSpeed = 50;
        ngc.createCycle();
        ngc.move();

    }
}
