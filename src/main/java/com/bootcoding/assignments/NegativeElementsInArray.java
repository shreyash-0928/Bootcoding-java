package com.bootcoding.assignments;

public class NegativeElementsInArray {
    public int[] negativeElements(int[] nums){
        int[] negative = new int[nums.length];
        for (int i = 0; i<nums.length;i++) {
            if (nums[i] < 0) {
                negative[i] = nums[i];
            }
        }
        return negative;
    }

    public static void main(String[] args) {
        NegativeElementsInArray nea = new NegativeElementsInArray();
        int a[] = {10, -3, 20, -40};
        int result[] = nea.negativeElements(a);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }

}
