package com.bootcoding.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Raju");
        list.add("Ravi");
        list.add(new Integer(40));
        list.add(new Double(11.3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
