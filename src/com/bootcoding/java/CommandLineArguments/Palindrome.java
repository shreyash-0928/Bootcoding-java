package com.bootcoding.java.CommandLineArguments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 0;
        while(n != 0)
        {
            r = r * 10 + n%10;
            n = n/10;
        }
        System.out.println(r);
    }

}
