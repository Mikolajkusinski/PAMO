package com.example.bmicalculator;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;


import org.junit.Rule;
import org.junit.Test;


public class MainActivityEspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testBmiButton() {
        // Click on the BMI button
        Espresso.onView(ViewMatchers.withId(R.id.bmi_calculator)).perform(ViewActions.click());
    }

    @Test
    public void testKcalButton() {
        // Click on the Kcal button
        Espresso.onView(ViewMatchers.withId(R.id.kcal_calculator)).perform(ViewActions.click());
    }

    @Test
    public void testRecepisButton() {
        // Click on the Recepis button
        Espresso.onView(ViewMatchers.withId(R.id.recepies)).perform(ViewActions.click());
    }
}
