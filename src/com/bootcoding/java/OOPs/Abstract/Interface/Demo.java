package com.bootcoding.java.OOPs.Abstract.Interface;

class Demo {
    public static void main(String[] args) {
        Idea idea = new Idea();
        Airtel airtel = new Airtel();
        Jio jio = new Jio();

        Magic.showMagic(idea);
        Magic.showMagic(airtel);
        Magic.showMagic(jio);
    }
}
