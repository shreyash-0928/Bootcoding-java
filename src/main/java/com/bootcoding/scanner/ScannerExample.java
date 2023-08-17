package com.bootcoding.scanner;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int value = sc.nextInt();
        boolean res = isEven(value);

        if(res){
            System.out.println(value + " is Even number");
        }else{
            System.out.println(value + " is Odd number");
        }
    }
    public static boolean isEven(long value){
        return value % 2 == 0;
    }
}

//        System.out.println("Enter Number");
//        int value = sc.nextInt();
//
//        if (value % 2 == 0) {
//            System.out.println(value + " is Even number");
//        } else {
//            System.out.println(value + " is Odd number");
//        }
//    }


