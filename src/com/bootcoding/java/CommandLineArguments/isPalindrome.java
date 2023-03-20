package com.bootcoding.java.CommandLineArguments;

public class isPalindrome {
    public static void main(String[] input) {
        for (int i = 0; i < input.length; i++) {

            int n = Integer.parseInt(input[i]);

            int rem = 0;
            int temp = n;
            while (n != 0) {
                rem = rem * 10 + n % 10;
                n = n / 10;
            }
            if (rem == temp) {
                System.out.println(temp + " is Palindrome");
            } else {
                System.out.println(temp + " is not Palindrome");
            }
        }
    }
}
