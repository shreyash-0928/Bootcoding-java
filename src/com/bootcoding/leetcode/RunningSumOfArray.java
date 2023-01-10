package com.bootcoding.leetcode;

public class RunningSumOfArray {
    public int[] getRunningSum(int[] nums){
        int a[] = new int [nums.length];
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j=0; j<=i; j++){
                sum += sum;
            }
        }
        return a;
    }
}
