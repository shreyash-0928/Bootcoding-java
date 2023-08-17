package com.bootcoding.Array.Assignment;

public class Q7ValuesBetweenArray {
    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        for(int value : values){
            if(value > 30 && value < 100){
                System.out.println(value);
            }
        }
    }
}
