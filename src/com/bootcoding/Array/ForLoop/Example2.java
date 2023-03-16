package com.bootcoding.Array.ForLoop;

public class Example2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i = 0;
        for (i = 0; i < a.length; i++) {
            a[i] = i*2;
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
