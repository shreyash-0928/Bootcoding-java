package com.bootcoding.leetcode;

public class FindPivotIndex{
    public static int[] pivotIndex(int[] nums) {
        // Initialize total sum of the given array...
        int totalSum = 0;
        // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
        int leftsum = 0;
        // Traverse the elements and add them to store the totalSum...
        for (int ele : nums)
            totalSum += ele;
        // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            // sum to the left == leftsum.
            // sum to the right === totalSum - leftsum - nums[i]..
            // check if leftsum == totalSum - leftsum - nums[i]...
            if (leftsum * 2 == totalSum - nums[i])
                return new int[]{i};       // Return the pivot index...
        return new int[]{-1};      // If there is no index that satisfies the conditions in the problem statement...
    }

    public static void main(String[] args) {
        int[] a = {1,7,3,6,5,6};
        int[] res = pivotIndex(a);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }


    }
}
