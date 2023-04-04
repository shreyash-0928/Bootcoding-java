package com.bootcoding.Array.Assignment;

public class Q6NumFoundInArray {
    public static void main(String[] args) {
        int[] values = {10,15,20,25,35,75,80,95};
        for (int value : values) {
            if (value == 80) {
                System.out.println(value + " Found");
                break; // To stop the loop once the value is found
            }
        }
    }
}
