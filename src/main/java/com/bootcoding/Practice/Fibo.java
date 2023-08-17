package com.bootcoding.Practice;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;

//        while(count <= n){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
        for (int i = 1; i <= 10; i++) {
            count = a+b;
            System.out.println(count);
            a=b;
            b=count;
        }


    }
}
