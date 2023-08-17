package com.bootcoding.leetcode;

import java.util.Arrays;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = {5,2,2};
        System.out.println(thirdMax(nums));
    } public static int thirdMax(int[] nums) {

        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        if (nums.length==1){
            thirdMax=nums[0];
        }
        for (Integer n : nums){

            if(n.equals(firstMax)||n.equals(secondMax)||n.equals(thirdMax)){
                continue;
            }
            if (firstMax == null || n>firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (secondMax == null || n>secondMax) {
                thirdMax = secondMax;
                secondMax = n;

            } else if (thirdMax == null || n>thirdMax) {
                thirdMax = n;
                break;
            }
        }
        if (thirdMax == null) {
            return firstMax;
        }
        return thirdMax;
    }
}

