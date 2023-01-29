package com.bootcoding.leetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return findBinarySearch(nums, target, 0, nums.length-1);
    }

    public int findBinarySearch(int[] n, int x, int left, int right){
        int mid = (left + right)/2;

        if(x==n[mid]){
            return mid;
        }
        if(left >= right){
            return -1;
        }

        if (x > n[mid]){
            return findBinarySearch(n, x, mid+1, right);
        }else{
            return findBinarySearch(n, x, left, mid-1);
        }
    }
}
