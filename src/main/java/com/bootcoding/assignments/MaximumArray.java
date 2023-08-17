package com.bootcoding.assignments;

public class MaximumArray {
    public static void main(String[] args) {
        int n[] = {10, 15, 20, 25, 100, 75, 80, 95};
        int max = n[0];

        for (int i = 0; i < n.length; i++) {
            if(n[i]>max) {
                max = n[i];
            }

        }
        System.out.println( max +" is maximum number");
    }
}
