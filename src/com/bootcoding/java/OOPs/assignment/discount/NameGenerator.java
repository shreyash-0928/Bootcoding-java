package com.bootcoding.java.OOPs.assignment.discount;

import java.util.Random;

public class NameGenerator {
    private static final String[] CUSTOMER_NAMES =
            {"Raju", "Ramesh", "Suresh", };

    private static final Random random = new Random();

    public static String getName(){
        int randomIndex = random.nextInt(CUSTOMER_NAMES.length);
        return CUSTOMER_NAMES[randomIndex];

    }
}
