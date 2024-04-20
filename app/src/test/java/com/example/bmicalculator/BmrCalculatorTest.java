package com.example.bmicalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BmrCalculatorTest {

    @Test
    public void testCalculateBMRMale() {
        double expectedBMR = 66.47 + (13.7 * 70) + (5 * 170) - (6.76 * 30);
        double actualBMR = BmrCalculator.calculateBMR(70, 170, 30, "male");
        assertEquals(expectedBMR, actualBMR, 0.01); // Specify a delta for double comparison
    }

    @Test
    public void testCalculateBMRFemale() {
        double expectedBMR = 655.1 + (9.567 * 60) + (1.85 * 160) - (4.68 * 25);
        double actualBMR = BmrCalculator.calculateBMR(60, 160, 25, "female");
        assertEquals(expectedBMR, actualBMR, 0.01); // Specify a delta for double comparison
    }
}
