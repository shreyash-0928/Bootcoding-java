package com.bootcoding.Practice;

import java.util.Scanner;

public class Parameters2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name: ");
        String message = greeting(sc.next());
        System.out.println(message);
    }
    static String greeting(String name){
        String greeting = name;
        return greeting;
    }
}
