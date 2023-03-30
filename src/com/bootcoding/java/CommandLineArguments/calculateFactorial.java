package com.bootcoding.java.CommandLineArguments;

public class calculateFactorial {
    public static void main(String[] input) {


            int n = Integer.parseInt(input[0]);

            int fact = 1, i;
            for (i=2; i<=n; i++)
                fact *= i;
        System.out.println(fact);


        }
    }

