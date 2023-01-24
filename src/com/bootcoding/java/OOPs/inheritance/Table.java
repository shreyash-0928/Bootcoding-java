package com.bootcoding.java.OOPs.inheritance;

public class Table {

    // Parent class - child class
    //Super class - sub class;
    //Base class - Derived Class

    //Data modifier(Properties)
    //Member method(Behaviour)

    int legs;
    boolean tableTop;
    String tableType;
    Material material;

    public void createTable(){
        System.out.println("Create New Table");
    }
    public void move(){
        System.out.println("Moving table to another location");
    }
    public void print(){
        System.out.println();
    }


}
