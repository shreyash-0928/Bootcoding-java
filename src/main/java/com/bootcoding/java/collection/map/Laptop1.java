package com.bootcoding.java.collection.map;

public class Laptop1 {
    private String Brand;
    private int Ram;
    private double Price;

    public Laptop1(){
    }

    public Laptop1(String brand, int ram, double price) {
        Brand = brand;
        Ram = ram;
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Laptop1{" +
                "Brand='" + Brand + '\'' +
                ", Ram=" + Ram +
                ", Price=" + Price +
                '}';
    }
}
