package com.bootcoding.java;

public class ProfitableGamble {
    public static void main(String[]args){
        probability(0.2,50,9);
    }

    public static void probability(double x, int y, int z) {
        System.out.println(x * y > z);
    }
}
