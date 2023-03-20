package com.bootcoding.java.FileHandling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        try
        {
            File file = new File("D:FileOperationExample.txt");
            if(file.exists())
            {
                System.out.println("THe name of file is " + file.getName());

                System.out.println("Absolute Path : " + file.getAbsolutePath());

                System.out.println("is File Writable : " + file.canWrite());

                System.out.println("is File Readanle : " + file.canRead());

                System.out.println("The size of file in terms of bytes : " + file.length());
            }
            else{
                System.out.println("File does not exist");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
