package com.bootcoding.assignments;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of terms: ");
        int n = sc.nextInt();

        double sum = 0.0;
        System.out.print("Harmonic series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(" 1/" + i + " +");
            sum += 1.0 / i;
        }
        System.out.println("\b"); // remove the last "+"
        System.out.println("Sum of series upto " + n + " terms: " + sum);
    }
}
