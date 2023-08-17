package com.bootcoding.java.Method.OverLoading;

public class Demo {

    public static void main(String[] args) {
        B b1 = new B();
        A a1 = b1;
        b1.show();
        a1.show();
        b1.showA();
    }
}
