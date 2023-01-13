package com.bootcoding.leetcode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int lastSpaceIndex  = s.lastIndexOf(" ");
        return s.length() - lastSpaceIndex -  1;
    }

    public static void main(String[] args) {
        String s ="  luffy is still joyboy  ";
        int result = lengthOfLastWord(s);
        System.out.println(result);

    }
}
