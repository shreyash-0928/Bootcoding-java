package com.bootcoding.java.Level2_Assignments;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;

        System.out.println("Sum of two numbers = " + sum);
        System.out.println("Subtraction of two numbers = " + sub);
        System.out.println("Multiplication of two numbers = " + mul);
        System.out.println("Division of two numbers = " + div);
        System.out.println("Remender of two numbers = " + rem);
    }
}
