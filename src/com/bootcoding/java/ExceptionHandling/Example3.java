package com.bootcoding.java.ExceptionHandling;

public class Example3 {
    public static void main(String args[])
    {
        System.out.println("I am in main");
        try
        {
            show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void show() throws Exception
    {
        System.out.println("I am in show");
    }
}
