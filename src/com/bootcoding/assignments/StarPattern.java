package com.bootcoding.assignments;

public class StarPattern {
    public static void StarRightTriangle(int n)
    {
        for(int i = 0; i < 5; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        StarRightTriangle(n);

    }

}
