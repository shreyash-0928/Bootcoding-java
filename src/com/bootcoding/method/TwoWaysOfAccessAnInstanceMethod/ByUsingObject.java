package com.bootcoding.method.TwoWaysOfAccessAnInstanceMethod;

public class ByUsingObject {            // When to use an OBJECT to access an INSTANCE METHOD--
    public int max(int a, int b){       // us an OBJECT to access INSTANCE METHOD if it is required only one time.
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int x = new ByUsingObject().max(44,55);
        System.out.println(x);
    }
}
