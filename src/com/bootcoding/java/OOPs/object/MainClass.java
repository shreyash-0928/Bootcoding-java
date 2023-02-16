package com.bootcoding.java.OOPs.object;

public class MainClass {
    public static void main(String[] args) {
        Door d1 = new Door();
        d1.name = "Door";
        d1.height = 400;
        d1.color = "Brown";


        System.out.println("Example Door");
        System.out.println("Height of door is " + d1.height);
        System.out.println("Color of door is " + d1.color);
        d1.open();
        d1.close();

    }
}

class Door {
    String name;
    int height;
    String color;


    public void open() {                                           // Non-static belongs to instance of object
        System.out.println(name + " is Opened");            // An object is created using class name is said to be instance of object
    }

    public void close() {
        System.out.println(name + " is Closed");
    }
}