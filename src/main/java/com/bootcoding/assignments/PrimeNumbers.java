package com.bootcoding.assignments;

import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime(int n)   // TC - O(n);
    {
        for (int i = 2; i <= n/2 ; i++)
        {
            if(n%1 == 0)
            {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNumber(int n)   // TC - O(_/n);
    {
        for (int i = 2; i <= Math.sqrt(n) ; i++)
        {
            if(n%1 == 0)
            {
                return false;
            }
        }
        return true;
    }
    static boolean optimisedIsPrime(int n)   // TC - O(_/n); more optimised than above
    {
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return false;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for (int i = 5; i*i <= n ; i=i+6)
        {
            if(n%i == 0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isPrimeNumber(n));
        System.out.println(optimisedIsPrime(n));
    }
}
