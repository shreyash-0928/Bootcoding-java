package com.bootcoding.assignments;

import java.util.Scanner;

public class Divisors {

    static void printDivisors(int n)    //TC - O(_/n)
    {
        int i=0;
        for (i = 1; i*i<=n; i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
        }
        for ( ; i>=1 ; i--) {
            if(n%i == 0 && i != n/i)
            {
                System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDivisors(n);
    }
}


//Observations
// Divisors can be made into pairs
//First divisor in the pair of divisors will always appear before _/n
//Second divisor can be obtained from the first divisor by using b = n/a