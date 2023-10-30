package com.bootcoding.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(20,15));
        System.out.println(euclidGCD(20,15));
        System.out.println(optimisedGCD(20,15));

    }

    //Brute-Force Approach   Time Complexity -> O(min(a,b))
    static int gcd(int a, int b){
        int min = 0;
        if(a<b){
            min = a;
        }else{
            min = b;
        }
        for (int i=min; i>=1; i--) {
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    //Euclid's Approach    Time Complexity -> O(min(a,b))
    static int euclidGCD(int a, int b){
        while (a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }

    //Optimised Euclid's Approach  Time Complexity -> O(log(min(a,b))
    static int optimisedGCD(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a!=0){
            return a;
        }else{
            return b;
        }
    }
}