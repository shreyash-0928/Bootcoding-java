package com.bootcoding.java.OOPs;

public class ObjectAssignment {
    public static void main(String[] args) {
        // primitive data types

        int a = 10;
        float b = a;  // b <- a (value of a)
        System.out.println("Value of A : " + a);
        System.out.println("Value of B : " + b);

        //ADT - Abstract Data Type (Object)
        Marker blueMarker = new Marker();
        Marker redMarker = blueMarker;    //redMarker <- BlueMarker (Reference)
        blueMarker.color = "Blue";
        redMarker.color = "Red";
        System.out.println("Value of BlueMarker = " + blueMarker.color);
        System.out.println("Value of RedMarker = " + redMarker.color);
    }
}
