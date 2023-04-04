package com.bootcoding.Array.Assignment;

public class Q5ReverseInArray {
    public static void main(String[] args) {
        int[] a = {10,15,20,25,35,75,80,95};

        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.println(a[i]);
        }
    }
}
