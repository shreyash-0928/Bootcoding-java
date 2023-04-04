package com.bootcoding.Array.Assignment;

import java.util.Arrays;

public class Q11SwapFirstThree {
    public static void main(String[] args) {
        int[] values = {10,15,20,25,35,75,80,95};

        for (int i = 0; i < 3; i++) {
            int temp = values[i];
            values[i] = values[values.length-3+i];
            values[values.length-3+i] = temp;
        }
        System.out.println(Arrays.toString(values));
    }
}
