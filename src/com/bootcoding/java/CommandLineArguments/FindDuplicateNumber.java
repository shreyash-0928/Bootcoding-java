package com.bootcoding.java.CommandLineArguments;

import java.util.HashMap;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String arg : args){
            int count = map.getOrDefault(arg, 0);
            if(count>0){
                System.out.println("Duplicate elements " + arg);
            }
            map.put(arg, count +1);
        }
    }
}


