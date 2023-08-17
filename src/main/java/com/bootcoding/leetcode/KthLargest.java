package com.bootcoding.leetcode;

import java.util.Arrays;

public class KthLargest {
    public static int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int[] a = {3,2,3,1,2,4,5,5,6};
        int result = findKthLargest(a, 4);
        System.out.println(result);
      }

}
