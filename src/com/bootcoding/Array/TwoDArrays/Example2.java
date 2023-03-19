package com.bootcoding.Array.TwoDArrays;

public class Example2 {
    public static void main(String[] args) {
        int a[][] = {
                {2,3,5,6},
                {95,3,5,3},
                {2,4,6,8}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
