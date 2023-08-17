package com.bootcoding.java.ExceptionHandling;

import java.io.FileOutputStream;

public class Example6 {
    public static void main(String args[])
    {

        try
        {
            FileOutputStream fout=new FileOutputStream("c:\\sample.txt");
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
