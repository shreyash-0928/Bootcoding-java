package com.bootcoding.java.FileHandling;

import java.io.FileInputStream;

public class ReadingInfo {
    public static void main(String[] args) {
        try
        {
            FileInputStream fin = new FileInputStream("D:FileOperationExample.txt");
            int ch;
            while((ch = fin.read()) != -1)
            {
                System.out.println((char) ch);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
