package com.bootcoding.java.Level2_Assignments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get multiplication");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + num*i );

        }

    }
}
