package com.bootcoding.java.OOPs.object;

public class College {
    // minimum 3 data member
    // member methods            // behaviors should be needed
    public String collegeName;
    public String university;
    public String address;
    public String branchesAvailable;

    public void college(){
        System.out.println("College Information");
    }

    public void print(){
        System.out.println("College Name : " + collegeName);
        System.out.println("University Name : " + university);
        System.out.println("College Address : " + address);
        System.out.println("Branches available : " + branchesAvailable);

    }
}
