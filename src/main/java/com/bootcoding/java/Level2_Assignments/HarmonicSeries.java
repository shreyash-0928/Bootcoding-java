package com.bootcoding.java.Level2_Assignments;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
            System.out.print("1/" + i + "  ");
        }

        System.out.println("= " + sum);
    }
}
