package com.bootcoding.assignments;

public class MaximumArray1 {
    public static void main(String[] args) {

        int a[] = {10,9,2,3,11};
        int max = 0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }

        }
        System.out.println(max);
    }
}
