package com.bootcoding.scanner;

import java.util.Scanner;

public class DuplicateNumbsInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements of the array ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j =i+1; j < size; j++) {
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate numbers in Array is - " + arr[i]);
                }

            }

        }

    }
}
