package com.bootcoding.java.keywords.Super;

class C extends  B {
    C()
    {
        System.out.println("Default Constructor From C");
    }
    C(int n)
    {
        super(200);
        System.out.println("Parameterized Constructor From C");
    }
}
