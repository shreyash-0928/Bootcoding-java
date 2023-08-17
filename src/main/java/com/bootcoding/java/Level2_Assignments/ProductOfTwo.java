package com.bootcoding.java.Level2_Assignments;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        int Product = a*b;

        System.out.println("The Product of 2 numbers are " + Product);

    }
}
