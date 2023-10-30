package com.bootcoding.java.String;

public class StringEquals {
    public static void main(String[] args) {
        String a = "Shreyash";
        String b = "Shreyash";
        System.out.println(a==b);

        String a1 = new String("Shreyash");
        String b2 = new String("Shreyash");
        System.out.println(a1.equals(b2));
    }
}
