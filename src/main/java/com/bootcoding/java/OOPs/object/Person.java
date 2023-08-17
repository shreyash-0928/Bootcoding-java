package com.bootcoding.java.OOPs.object;

public class Person {
    private String name;
    private int age;
    private long phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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

class MyEmployee
{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Raju");
        p1.setAge(33);
        p1.setPhone(78658657);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getPhone()) ;
    }
}
