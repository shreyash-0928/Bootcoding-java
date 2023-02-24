package com.bootcoding.java.ExceptionHandling;

public class Example2 {
    public static void main(String args[]) throws Exception
    {
        System.out.println("I am in main");
        show();
    }
    public static void show() throws Exception
    {
        System.out.println("I am in show");
    }
}
