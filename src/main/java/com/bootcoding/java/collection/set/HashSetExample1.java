package com.bootcoding.java.collection.set;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {

        Set<String> stringSet= new HashSet<String>();
        stringSet.add("Raja");
        stringSet.add("Raja");
        stringSet.add("Raja");
        stringSet.add("Ravi");
        stringSet.add("Banti");
        stringSet.add("Banti");
        stringSet.add("Babu");
        stringSet.add("Rajan");
        stringSet.add("Manish");
        stringSet.add("Raja");

        /*for (String str:stringSet){
            if(str.equals("Ravi")){
                System.out.println(str +" is Present");
            }
        }*/

        stringSet.forEach(str -> System.out.println(str));


    }
}
