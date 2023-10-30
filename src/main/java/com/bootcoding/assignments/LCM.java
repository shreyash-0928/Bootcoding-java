package com.bootcoding.assignments;

import java.util.Scanner;

public class LCM {
    static int findLcm(int a, int b) {
        return (a*b)/euclidsGCD(a,b);     //Given by Euclid
    }
    //Optimised Euclid's Approach  Time Complexity -> O(log(min(a,b))
    static int euclidsGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLcm(a,b));
    }

}
