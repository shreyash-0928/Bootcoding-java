package com.bootcoding.Array.Assignment;

import java.util.HashSet;

public class Q13DuplicateInArray {
    public static boolean hasDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 15, 22, 25, 15};
        int[] arr2 = {10, 15, 20, 25, 35};
        System.out.println(hasDuplicates(arr1)); // true
        System.out.println(hasDuplicates(arr2)); // false
    }

}
