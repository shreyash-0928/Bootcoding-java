package com.bootcoding.assignments;

public class SquareElementOfArray {
    public int[] squareElement(int[] squares){
        int num=0;
        int a[] = new int [squares.length];
        for(int i =0; i < squares.length; i++){
            a[i]=squares[i]*squares[i];
        }

        return a;
    }

    public static void main(String[] args) {
        SquareElementOfArray se = new SquareElementOfArray();
        int a[] = {1,2,3,4,5};
        int result[] = se.squareElement(a);
        for(int i = 0; i<result.length;i++){
            System.out.println(result[i]);
        }


    }
}
//WAM to return negative element array from given array
// for ex- [10,-3,20,-40] -> [-3,-40]
//WAM to return positive element array from given array
//for ex- [10,-3,20,-40] - [10,20]