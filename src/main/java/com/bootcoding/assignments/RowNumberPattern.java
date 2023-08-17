package com.bootcoding.assignments;

public class RowNumberPattern {
    public static void rowNumberPattern(int n) {
        int i,j;
        for(i =1; i <= n; i++) {
            for(j = 0;j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        rowNumberPattern(n);

    }

}
