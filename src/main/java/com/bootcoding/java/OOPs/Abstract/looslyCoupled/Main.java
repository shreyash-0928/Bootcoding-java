package com.bootcoding.java.OOPs.Abstract.looslyCoupled;

abstract class School {
    // Abstract class
    public void show(){
        System.out.println("School Application");
    }
    abstract int getAdmissionFee();  // Abstract method
}
class DAV extends School{
    // Overriding the method from school class
    int getAdmissionFee(){
        return 25000;
    }
}
class DPS extends School{
    int getAdmissionFee() {
        return 35000;
    }
}
class JNV extends School{
    int getAdmissionFee(){
        return 1000;
    }
}

public class Main {
    public static void main(String[] args) {
        School s;
        s = new DAV();
        s.show();
        System.out.println("DAV Admission fee: " + s.getAdmissionFee());

        s = new DPS();
        System.out.println("DPS Admission fee: " + s.getAdmissionFee());

        s = new JNV();
        System.out.println("JNV Admission fee: " + s.getAdmissionFee());
    }
}
