package com.bootcoding.java.conditional;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time");

        int time = sc.nextInt();

        if(time <= 12){
            System.out.println("Good Morning, Nagpur!");
        }if(time > 12 && time < 18){
            System.out.println("Good Afternoon, Nagpur!");
        }else{
            System.out.println("Good Evening, Nagpur!");
        }
    }
}
