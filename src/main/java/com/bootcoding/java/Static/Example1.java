package com.bootcoding.java.Static;

public class Example1 {
    static int a;
    static {
        show();
        a = 10;

    }

    public static void main(String[] args) {
        System.out.println("value = " + a);
    }
    public static void show()                   // To call the method from static block new method should be static
    {
        System.out.println("Value = " + a);
    }
}
