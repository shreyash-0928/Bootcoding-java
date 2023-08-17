package com.bootcoding.assignments;

public class EvenOdd {
    public static void main(String[] args) {
        String val = args[0];
        String val1 = args[1];
        int n = Integer.parseInt(val);
        int n1 = Integer.parseInt(val1);

        if(n%2 == 0)
        {
            System.out.println(n + " is Even no.");
        }else{
            System.out.println("is Odd");
        }

        if(n1%2 == 0)
        {
            System.out.println(n1 + " is Even no.");
        }else{
            System.out.println("is Odd");
        }

    }
}
// wap to print even or odd number from cla where user can provide multiple integer value using for loopEven Odd