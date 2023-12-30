package com.bootcoding.java.conditional;

public class TernaryStatement {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;

//        if(n%2==0)
//            result = 10;
//        else
//            result = 20;

        //We have to use ? & :
        // So what ever the condition we have it might return true or false so you can put ?(you can ask is it true or false)
        // if it is true then execute the part which is after the ?
        // If it is false then execute the part which is after the :
        // This Ternary Statement is suitable for some example not for all

        result = n%2==0 ? 10:20;

        System.out.println(result);
    }
}
