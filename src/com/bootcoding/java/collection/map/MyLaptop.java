package com.bootcoding.java.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLaptop {
    public static void main(String[] args) {
        List<Laptop> list= new ArrayList<>();
        list.add(new Laptop("Dell", 16,150999));
        list.add(new Laptop("HP", 8,15099));
        list.add(new Laptop("Asus", 24,1500999));
        list.add(new Laptop("Lenovo", 4,15999));

        Collections.sort(list);

        for(Laptop laptop: list){
            System.out.println(laptop);
        }
    }
}
