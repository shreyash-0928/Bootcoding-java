package com.bootcoding.leetcode;

public class DigitsPlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 9};
        int result[] = plusOne(a);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}



