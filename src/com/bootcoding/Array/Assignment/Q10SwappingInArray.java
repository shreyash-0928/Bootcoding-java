package com.bootcoding.Array.Assignment;

import java.util.Arrays;

public class Q10SwappingInArray {
    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("Original " + Arrays.toString(values));

        int temp = values[0];
        values[0] = values[values.length-1];
        values[values.length-1] = temp;

        System.out.println("Modified " + Arrays.toString(values));


    }
}
