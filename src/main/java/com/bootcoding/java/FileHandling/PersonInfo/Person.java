package com.bootcoding.java.FileHandling.PersonInfo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Person {
    private String name;
    private int age;
    private long phone;

    public Person(String name, int age, long phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}

class MyPerson{
    public static void main(String[] args) {
        try
        {
            Person person = new Person("Raju",22, 989848793);
            FileOutputStream fout = new FileOutputStream("D:info.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);

            objOut.writeObject(person);
            objOut.close();
            fout.close();
            System.out.println("Information storing successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
