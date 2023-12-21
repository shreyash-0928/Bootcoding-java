package com.bootcoding.assignments;

public class breakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if(i==5) {
                continue;
            }
            System.out.println(i); // This line will not be printed for i==5 as that iteration of the loop is skipped
        }
    }
}
