package com.bootcoding.java.OOPs;

public class Duster {
    double Price;
    String Shape;
    String features;


    public static Duster purchasingDuster(double Price, String Shape, String features){
        Duster duster = new Duster();
        duster.Price = 50.0;
        duster.Shape = "Rectangle";
        duster.features = "The foam employed is of hard type which has high resistance to water absorption compared with soft foam.";

        return duster;
    }

    public void print(){
        System.out.println(" Purchasing new duster. ");
        System.out.println(" Duster price " + Price);
        System.out.println(" Shape of duster " + Shape);
        System.out.println(" Features of duster " + features);
    }


}
