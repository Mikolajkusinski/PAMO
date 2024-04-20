package com.example.bmicalculator;

public class BmiCalculator {

    public static float calculateBMI(float weight, float height) {
        height = height / 100;
        float BMI;
        BMI = weight / (height * height);
        return BMI;
    }
}
