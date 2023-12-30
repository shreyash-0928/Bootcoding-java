//package com.bootcoding.java.MultiThreading;
//
//class NewThread implements Runnable
//{
//    Thread t;
//    NewThread(String name)
//    {
//        t= new Thread(this,name);
//        t.start();
//    }
//
//    public void run()
//    {
//        for(int i=1;i<=5;i++)
//        {
//            System.out.println(t.getName()+" "+i);
//            try
//            {
//                Thread.sleep(1000);
//            }
//            catch(Exception e)
//            {
//                System.out.println(e);
//            }
//        }
//
//    }
//}
//class MyThread3
//{
//    public static void Test(String args[])
//    {
//        NewThread N1= new NewThread("Banti");
//        NewThread N2= new NewThread("Babli");
//        NewThread N3= new NewThread("Babulal");
//
//        try
//        {
//            N1.t.join();
//            N2.t.join();
//            N3.t.join();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("The End");
//    }
//}