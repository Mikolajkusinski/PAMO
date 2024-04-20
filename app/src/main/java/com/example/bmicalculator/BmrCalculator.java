package com.example.bmicalculator;

public class BmrCalculator {

    public static double calculateBMR(double weight, double height, double age, String gender) {
        double bmr = 0;

        if (gender.equalsIgnoreCase("male")) {
            bmr = 66.47 + (13.7 * weight) + (5 * height) - (6.76 * age);
        } else if (gender.equalsIgnoreCase("female")) {
            bmr = 655.1 + (9.567 * weight) + (1.85 * height) - (4.68 * age);
        }

        return bmr;
    }
}
