package com.bootcoding.java.OOPs.object;

public class Marker {
    // Data member -> instance variable
    public String type;             //Class = Defination of object
    public String brand;            //should write property of marker
    public String color;            //And beheviour of marker
    public double price;

    //Member Methods
    //Access Specifier

    public void refill(){
        System.out.println("Refill marker successsfully");
    }
    public void write(String message){
        System.out.println("On White Board - " + message);
    }
    public void print(){
        System.out.println("Marker Brand : " + brand);
        System.out.println("Marker Type : " + type);
        System.out.println("Marker Color : " + color);
        System.out.println("Marker Price : " + price);
    }
}


// single line comment
/*
Multi line comments
- block comments
*/
/**
 Documentation methods
 */