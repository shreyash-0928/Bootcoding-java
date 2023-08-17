package com.bootcoding.java.MultiThreading;

class NewThread implements Runnable
{
    Thread t;
    NewThread(String name)
    {
        t= new Thread(this,name);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(t.getName()+"="+i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class MyThread
{
    public static void main(String args[])
    {
        NewThread N1= new NewThread("Raja");
        NewThread N2= new NewThread("Rani");
        NewThread N3= new NewThread("Raju");

        for(int i=1;i<=5;i++)
        {
            System.out.println("Main="+i);
            if(i==3)
            {
                N2.t.suspend();
            }
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        N2.t.resume();
    }
}