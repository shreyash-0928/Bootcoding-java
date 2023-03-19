package com.bootcoding.assignments;

public class Student {
    public static void main(String[] args) {
        // java Student avg 45.00 55 67.50
        // java Student percentage 45.00 55 67.50

        int size = args.length;
        if(size < 4){
            System.out.println("Please provide proper input!");
        }else {
            String firstArgument = args[0];

            int marks1 = Integer.parseInt(args[1]);
            int marks2 = Integer.parseInt(args[2]);
            int marks3 = Integer.parseInt(args[3]);

            if (firstArgument.equals("avg")) {
                // calculate avg
                int sum = marks1 + marks2 + marks3;
                double avg = sum / 3;
                System.out.println("Average: " + avg);

            } else if (firstArgument.equals("percentage")) {
                // calculate percentage
                int sum = marks1 + marks2 + marks3;
                double percentage = sum / 300.00 * 100;
                System.out.println("Percentage: " + percentage);
            } else {
                System.out.println("Invalid Input! Valid inputs are: avg or percentage!");
            }
        }
    }
}
