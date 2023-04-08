package com.bootcoding.java.collection.set;

import com.bootcoding.java.FileHandling.PersonInfo.Person;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashSetExample1 {
    public static void main(String[] args) {
        Set<String> stringSet= new LinkedHashSet<String>();
        stringSet.add("Raja");
        stringSet.add("Manish");
        stringSet.add("Raja");
        stringSet.add("Raja");
        stringSet.add("Ravi");
        stringSet.add("Banti");
        stringSet.add("Banti");
        stringSet.add("Babu");
        stringSet.add("Rajan");

        stringSet.add("Tiger");

        stringSet.forEach(s -> System.out.println(s));

    }
}
