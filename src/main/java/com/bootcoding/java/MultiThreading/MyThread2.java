package com.bootcoding.java.MultiThreading;

class newThread implements Runnable
    {
        Thread t;
        newThread(String name)
        {
            t= new Thread(this,name);
            	t.start();
        }

        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(t.getName()+" "+i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }

        }
    }
    class MyThread2
    {
        public static void main(String args[])
        {
            newThread N1= new newThread("Banti");
            newThread N2= new newThread("Babli");
            newThread N3= new newThread("Babulal");


            for(int i=1;i<=5;i++)
            {
                System.out.println("Main :"+i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }

