package com.bootcoding.leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 123, 2, 4, 3242};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length;i++)
        {
            int digits = 0;
            while(nums[i]>0){
                nums[i] /= 10;
                digits ++;
            }

            if(digits%2 == 0){
                ans++;
            }
        }return ans;

    }
}
