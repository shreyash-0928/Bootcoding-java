package com.bootcoding.java.CommandLineArguments;

public class calculateFactorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}

