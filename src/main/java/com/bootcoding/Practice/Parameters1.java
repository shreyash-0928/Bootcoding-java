package com.bootcoding.Practice;

public class Parameters1 {
    public static void main(String[] args) {
        int sum = Sum(20,30);
        System.out.println(sum);
    }

//    static int Sum(int a, int b) {
//        return a+b;
//    }

    static int Sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
