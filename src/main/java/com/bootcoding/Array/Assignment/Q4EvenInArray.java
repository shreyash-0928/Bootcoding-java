package com.bootcoding.Array.Assignment;

public class Q4EvenInArray {
    public static void main(String[] args) {
        int[] a = {10,15,20,25,35,75,80,95};

        for(int value : a){
            if(value % 2 == 0){
                System.out.println(value);
            }
        }
    }
}
