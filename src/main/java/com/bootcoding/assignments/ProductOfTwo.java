package com.bootcoding.assignments;

import java.util.Scanner;

public class ProductOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        int product = num1*num2;


        System.out.println("Product of Number 1 and Number 2 is " + product );
    }
}
