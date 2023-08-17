package com.bootcoding.scanner;

import java.util.Scanner;

public class ScannerStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.next();
        char output = findDuplicateChar(word);
        System.out.println(" Duplicate character in " + word + " is '" + output + "'");
    }
    private static char findDuplicateChar(String word){
        char[] chars = word.toCharArray();
        for(int i = 0; i <chars.length; i++){
            for(int j = i+1; i<chars.length; j++){
                if(chars[i] == chars[i]){
                    return chars[i];
                }
            }
        }
        return 0;
    }
}


//PrintEven *
//PrintOdd
//printMinElemenet *
//PrintMaxElement *
//PrintPalindrom
//PrintArmstrong
//PrintPrimeNumber
//printDuplicateNumber
//printSquareOfEachElement