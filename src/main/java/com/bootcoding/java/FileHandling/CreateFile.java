package com.bootcoding.java.FileHandling;

import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String args[]) {
        try {
            // Creating an object of a file
            File f0 = new File("D:FileOperationExample.txt");
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}