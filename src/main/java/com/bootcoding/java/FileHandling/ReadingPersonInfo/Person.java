package com.bootcoding.java.FileHandling.ReadingPersonInfo;

import com.bootcoding.java.FileHandling.FileInfo;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Person {
    private String name;
    private int age;
    private long phone;

    public Person(String name, int age, long phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}

class MyPerson{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:info.txt");
            ObjectInputStream obIn = new ObjectInputStream(fin);

            Person person = (Person) obIn.readObject();
            System.out.println(person);
            obIn.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}