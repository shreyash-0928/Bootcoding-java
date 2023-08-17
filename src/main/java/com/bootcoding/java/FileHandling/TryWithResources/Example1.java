package com.bootcoding.java.FileHandling.TryWithResources;

import java.io.FileOutputStream;

public class Example1 {
    public static void main(String[] args) {

        try
        {
            FileOutputStream fout = new FileOutputStream("Info.txt");
                String msg = "I LOVE JAVA";
                byte[] b = msg.getBytes();
                fout.write(b);
                fout.close();
            System.out.println("Information successfully stored");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
