package com.bootcoding.java.OOPs.inheritance;

import com.bootcoding.java.OOPs.encapsulation.Ambulance;

public class MobileApplication extends Ambulance {
    // parent protected property becomes -> private to child class

    public void assignCharges(){
        charges = 100;
    }
}
