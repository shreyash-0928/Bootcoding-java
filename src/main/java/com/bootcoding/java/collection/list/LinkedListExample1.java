package com.bootcoding.java.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
    public static void main(String[] args) {
        List<String> list= new LinkedList<>();
        list.add("Raju");
        list.add("Rani");
        list.add("Ravi");
        list.add("Nilesh");
        list.add("Raju");
        list.add("Manish");
        list.add("Suresh");

        //traditional loop
//        for(int i=0;i< list.size();i++){
//            System.out.println(list.get(i));
//        }

        //for each loop
//        for (String str: list) {
//            System.out.println(str);
//        }

        //for each method in java 8
        list.remove(2);
        list.forEach(str -> System.out.println(str));
    }
}
