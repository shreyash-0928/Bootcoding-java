package com.bootcoding.Practice;

import java.util.Scanner;

public class SumUsingReturn {

    public static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;

        return sum;
    }

    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
}
