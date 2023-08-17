package com.bootcoding.java.Level2_Assignments;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int integer = sc.nextInt();

        for (int i = 0; i < 100; i++) {
            if(i%integer == 3)
            {
                System.out.println(i);
            }

        }
    }
}
