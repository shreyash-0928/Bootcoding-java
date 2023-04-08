package com.bootcoding.method.TwoWaysOfAccessAnInstanceMethod;

public class ByUsingAnObjectReference {                     // When to use an OBJECT REFERENCE
    public int max(int a, int b){                           // use an OBJECT REFERENCE to access INSTANCE METHOD
        if(a>b)                                             // if it is required more than one time
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        ByUsingAnObjectReference or = new ByUsingAnObjectReference();
        int x = or.max(44,55);
        System.out.println(x);
    }

}
