package com.bootcoding.Array.Assignment;

public class Q9MinInArray {
    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int min = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        System.out.println(min);
    }
}
