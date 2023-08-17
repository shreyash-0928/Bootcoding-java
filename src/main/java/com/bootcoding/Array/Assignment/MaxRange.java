package com.bootcoding.Array.Assignment;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(maxRange(arr, 2,5));
    }

    public static int maxRange(int[] arr, int start, int end) {
        int maxRange = arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxRange){
                maxRange = arr[i];
            }
        }
        return maxRange;
    }


}
