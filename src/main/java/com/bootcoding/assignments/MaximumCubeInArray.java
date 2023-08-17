package com.bootcoding.assignments;

public class MaximumCubeInArray {
    public static void main(String[] args) {
        int a[] = {1,4,3,8,6};
        int maxCube = a[0] * a[0] * a[0];


        for (int i = 1; i < a.length; i++){


            int cube = a[i]*a[i]*a[i];
            if(cube>maxCube){
                maxCube = cube;
            }




        }System.out.println(maxCube);

    }
}
