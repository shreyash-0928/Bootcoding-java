package com.bootcoding.assignments;

import java.util.Scanner;

public class mathematicalTools {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(product);
        System.out.println(div);
        System.out.println(mod);
    }


}
