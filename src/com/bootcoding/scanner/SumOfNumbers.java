package com.bootcoding.scanner;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = sc.nextInt();
                     sum += num;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
