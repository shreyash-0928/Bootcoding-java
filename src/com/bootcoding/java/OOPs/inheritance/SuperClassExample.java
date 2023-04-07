package com.bootcoding.java.OOPs.inheritance;

public class SuperClassExample {
    protected int a;

    void setA(int n1)
    {
        a = n1;
    }
    void showA()
    {
        System.out.println("A = " + a);
    }
}

class B extends SuperClassExample
{
    private int a;
    void setB(int n1, int n2)
    {
        a = n1;
        a = n2;
    }
    void showB()
    {
        System.out.println("B = " + a);
    }
}

class Demo
{
    public static void main(String[] args) {
        B b1 = new B();
        b1.setA(100);
        b1.setB(200,300);
        b1.showA();
        b1.showB();
    }
}
