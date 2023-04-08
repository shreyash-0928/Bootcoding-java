package com.bootcoding.java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Person> personSet= new HashSet<Person>();
        Person person= new Person("Roshan",22,2633193);
        Person p1= new Person("Roshan",22,2633193);
        Person person1=person;
        Person person2=person;
        Person person3=person;

        personSet.add(new Person("Raj",22,2633193));
        personSet.add(new Person("Banti",22,2633193));
        personSet.add(new Person("Babu",22,2633193));
        personSet.add(new Person("Raju",22,2633193));
        personSet.add(new Person("Rajesh",22,2633193));
        personSet.add(new Person("Raj",22,2633193));
        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(p1);

        //for each loop
        for (Person p:personSet){
            System.out.println(p);
        }
    }
}
