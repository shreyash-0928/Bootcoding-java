package com.bootcoding.java.Level2_Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Distance in km:");
        int distance = sc.nextInt();
        System.out.println("Enter total fuel Spent in liters:");
        float fuel = sc.nextFloat();

        float AverageConsumption = distance/fuel;

        System.out.println("AverageConsumption[km/l] " + AverageConsumption);
    }
}
