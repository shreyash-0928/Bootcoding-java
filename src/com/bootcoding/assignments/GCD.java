package com.bootcoding.assignments;

import java.util.Arrays;

public class GCD {
    public static int findGCD(int[] arr) {
        Arrays.sort(arr);
        int smallest = arr[0];
        int largest = arr[arr.length - 1];
        return gcd(smallest, largest);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args){
        int[] array  = {2,5,6,9,10};
        int res = findGCD(array);
        System.out.println(res);

    }
}