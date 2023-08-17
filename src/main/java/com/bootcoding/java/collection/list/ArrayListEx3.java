package com.bootcoding.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Raja");
        list.add("Ravi");
        list.add("Ashok");
        list.add(2,"Tiger");
        list.add("Rakesh");
        list.add("Mahesh");



        // For each Loop
        for (String str:list) {
            System.out.println(str);
        }
    }
}
