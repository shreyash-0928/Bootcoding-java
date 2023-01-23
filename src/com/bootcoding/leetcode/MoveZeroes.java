package com.bootcoding.leetcode;

public class MoveZeroes {
        public void moveZeroes(int[] nums) {
            int ln = nums.length-1, count=0, j=0;
            for (int i=0; i<=ln; i++) {
                if(nums[i]!=0){
                    if(count==0){
                        j++;
                    } else{
                        nums[j]=nums[i];
                        j++;
                    }
                } else {
                    count++;
                }
            }
            while(count>0){
                nums[ln] = 0;
                ln--;
                count--;
            }
        }
}
