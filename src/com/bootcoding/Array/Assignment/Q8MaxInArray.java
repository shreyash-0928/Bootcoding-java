package com.bootcoding.Array.Assignment;

public class Q8MaxInArray {
    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println(max);









//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[values.length-1]);
//            break;
//        }
    }
}
