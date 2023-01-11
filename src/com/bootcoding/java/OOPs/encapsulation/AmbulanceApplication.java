package com.bootcoding.java.OOPs.encapsulation;

public class AmbulanceApplication {
    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance();
        ambulance.setHospitalName("Seven Star Hospital");
        ambulance.setType("Bus");
        ambulance.setAvailable(true);
        ambulance.setCharges(150.00);

        System.out.println("Ambulance Info:");
        System.out.println("Hospital Name: " + ambulance.getHospitalName());
        ambulance.getHospitalName();
        ambulance.getType();
        ambulance.getCharges();

    }
}
