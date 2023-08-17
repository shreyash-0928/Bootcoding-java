package com.bootcoding.assignments;

import java.util.Scanner;

public class IfElse {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            double i = sc.nextDouble();
            String s = sc.nextLine();


            if (input % 2 == 1) {
                System.out.println("Wired");
            } else if (input % 2 == 0 && input >= 2 && input <= 5) {
                System.out.println("Not Wired");
            } else if (input % 2 == 0 && input >= 6 && input <= 20) {
                System.out.println("Wired");
            } else if (input % 2 == 0 && input > 20) {
                System.out.println("Not Wired");
            }
            sc.close();

        }
    }

