package com.example.bmicalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BmiCalculatorTest {

    @Test
    public void testCalculateBMI() {
        // Test case with weight 70 kg and height 170 cm
        float expectedBMI = 24.22f;
        float actualBMI = BmiCalculator.calculateBMI(70, 170);
        assertEquals(expectedBMI, actualBMI, 0.01f); // Specify a delta for float comparison
    }

    @Test
    public void testCalculateBMI_ZeroWeight() {
        // Test case with zero weight and height
        float expectedBMI = 0f; // BMI should be 0 for zero weight
        float actualBMI = BmiCalculator.calculateBMI(0, 170);
        assertEquals(expectedBMI, actualBMI, 0.01f); // Specify a delta for float comparison
    }

}