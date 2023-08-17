package com.bootcoding.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("Raja");
        list.add("Banti");
        list.add("Babli");
        list.add("Babu");
        list.add("Babu");
        list.add("Babu");
        list.add("jai");
        list.add("Raju");
        //traditional loop
        /*for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }*/
        //for each loop
        /*for(String str:list){
            System.out.println(str);
        }*/
        //for each method in java 8
        list.forEach((String str) -> System.out.println(str));
    }
}
