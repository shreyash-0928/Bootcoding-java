package com.bootcoding.method.TwoWaysOfAccessAnInstanceMethod;

public class ExampleAddElement {
    public int addElement(int[] a){
        int total = 0;
        for(int b : a){
            total = total + b;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        ExampleAddElement add = new ExampleAddElement();
        int x = add.addElement(i);
        System.out.println(x);
    }
}
