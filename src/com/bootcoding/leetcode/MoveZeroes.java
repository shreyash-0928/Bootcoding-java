package com.bootcoding.leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZerosToEnd(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;

        // move all non-zero elements to the front
        while (i < n) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        // fill the remaining elements with zeros
        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 3};
        moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

}

