package com.bootcoding.java.FileHandling;

import java.io.FileOutputStream;

public class WritingInfo {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fout = new FileOutputStream("D:FileOperationExample.txt");
            String msg = "I LOVE JAVA";
            byte b[] = msg.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Info write successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
