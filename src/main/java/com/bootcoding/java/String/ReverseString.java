package com.bootcoding.java.String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String str1 = str.replaceAll(" ", "").replaceAll(",", "").replace(":", "").toLowerCase();
        System.out.println(str1);
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        System.out.println(sb.toString().equals(str1));

    }
}
