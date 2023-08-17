package com.bootcoding.java.conditional;

import java.io.PrintStream;

public class LogicalOperators {

//    2 or more conditions ko combine karna hai
//
//    && - ANDing
//    || - ORing
//    ! - Negation(not)
//
//    percentage above 60 and below 75 hai to you are eligible
//
//    above 60   below 75
//    Above 60 AND Below 75
//    Not above 60 or not below 75
public static void main(String[] args) {
    int a = 10;
    int b = 20;

    boolean cond1 = a != 10;
    boolean cond2 = b > a;

    boolean res = cond1 && cond2;
    boolean res2 = cond1 || cond2;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    System.out.println("a != 10 && b > a = " + res);
    System.out.println("a != 10 || b > a = " + res2);
}
}
