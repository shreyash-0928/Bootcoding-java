package com.bootcoding.Array.Assignment;

import java.util.Arrays;

public class Q5ReverseIOrderInArray {
    public static void main(String[] args) {
        int[] a = {10,15,20,25,35,75,80,95};

        for (int i = 0; i < a.length/2 ; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(a));
    }
}
