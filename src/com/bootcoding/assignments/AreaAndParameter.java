package com.bootcoding.assignments;

import java.util.Scanner;

public class AreaAndParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width of Rectangle : ");
        double width = sc.nextDouble();

        System.out.println("Enter Height of Rectangle : ");
        double height = sc.nextDouble();

        double area = width * height;
        double parameter = 2*(width+height);

        System.out.println("Area of Rectangle = " + area);
        System.out.println("Parameter of Rectangle = " + parameter);

    }
}
