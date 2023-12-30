package com.bootcoding.java.conditional;

public class SwitchStatement {
    public static void main(String[] args) {

        // There is a problem in switch case that is - The moment it matches the case it will execute that statement,
        // and it will just try to execute the entire switch statement
        // In this case we have to use //break; (keyword) to come out of the switch block
        int n = 2;
        switch (n){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("TuesDay");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entered a valid number");

        }
    }
}
