package com.bootcoding.leetcode;

public class AddDigits {
    public int addDigits(int num) {

        if(num<10){
            return num;
        }
        return addDigits(num/10 + num%10);
    }

    public static void main(String[] args) {
        int n = 234;
        System.out.println(new AddDigits().addDigits(n));
    }
}
