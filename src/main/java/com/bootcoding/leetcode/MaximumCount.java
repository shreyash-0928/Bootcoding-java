package com.bootcoding.leetcode;

public class MaximumCount {
    public static int maximumCount(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                count1++;
            }else if(nums[i]>0){
                count2++;
            }
        }
        if (count1 > count2) {
            return count1;
        }

        return count2;
    }

    public static void main(String[] args) {
        int a[] = {2,3,4,5,-2,-4,-5};
        int result = maximumCount(a);
        System.out.println(result);
    }
}
