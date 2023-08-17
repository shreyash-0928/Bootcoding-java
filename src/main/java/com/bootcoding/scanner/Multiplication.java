package com.bootcoding.scanner;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i<=10; i++){
            int multiplication = a*i;
            System.out.println("a " + i "= " + multiplication);
        }
    }
}
