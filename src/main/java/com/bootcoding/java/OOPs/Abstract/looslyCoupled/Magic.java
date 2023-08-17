package com.bootcoding.java.OOPs.Abstract.looslyCoupled;

class Magic {
    public static void showMagic(Sim sim) {
        {
            System.out.println("Start");
            sim.inserted();
            System.out.println("The End");
        }
    }
}
