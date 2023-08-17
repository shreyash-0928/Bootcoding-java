package com.bootcoding.method;

public class A1 {
    public static boolean isSeniorCitizen(int[]ages){

        for(int i = 0; i<ages.length; i++){
            if(ages[i] >= 60){
                return true;
            }
        }
        return false;
    }

    public static boolean isKidsCitizen(int[]ages){

        for(int i = 0; i<ages.length;i++){
            if(ages[i] <= 15){
                return true;
            }
        }return false;
    }
    public static boolean isAdultCitizen(int[]ages){

        for(int i = 0; i<ages.length;i++){
            if(ages[i] >= 18){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 25, 26, 27, 30};
        System.out.println(isKidsCitizen(ages));
        System.out.println(isSeniorCitizen(ages));
        System.out.println(isAdultCitizen(ages));
    }

}
