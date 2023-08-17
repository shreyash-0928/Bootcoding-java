package com.bootcoding.leetcode;

public class  ReverseString {
    public static void main(String[] args) {
        String str = "JAVA";
        System.out.println();

    }
    public void reverseString(char[] s) {
        for(int i=0 ;i<s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
}
