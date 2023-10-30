package com.bootcoding.java.String;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "Hello I'm your String";
        String[] splited = str.split(" ");
        for(String w:splited){
            System.out.println(w);
        }
    }
}
