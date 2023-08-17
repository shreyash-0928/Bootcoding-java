package com.bootcoding.Array.Assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Q14FindDuplicateInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 5, 6, 7, 8, 9};

        HashSet<Integer> store = new HashSet<>();
        ArrayList<Integer> output = new ArrayList<>();

        for (int num : nums) {
            if (!store.contains(num)) {
                store.add(num);
            } else {
                output.add(num);
            }
        }

        System.out.println("Duplicate elements in the array: " + output);
        System.out.println("Unique elements in the array: " + store);
    }
}
