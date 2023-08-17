package com.bootcoding.leetcode;

import java.util.HashMap;

public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans=0;

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
                hm.put(nums[i],0);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])==0)
            {
                ans+=nums[i];
            }
        }
        return ans;
    }
}
