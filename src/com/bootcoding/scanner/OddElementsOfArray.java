package com.bootcoding.scanner;

import java.util.Scanner;

public class OddElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create array
        int[] arr = new int[5];

        // Read in values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Loop through array and print odd numbers
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
