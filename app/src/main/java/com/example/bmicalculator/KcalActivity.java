package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class KcalActivity extends AppCompatActivity {

    private TextView kcalOutput;
    private EditText heightInput,weightInput,ageInput;
    private Button button;
    private FloatingActionButton goBack;
    private ChipGroup chipGroupGender;
    private String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kcal_counter);

        chipGroupGender = findViewById(R.id.gender);

        kcalOutput = (TextView) findViewById(R.id.kcal_result);
        weightInput = (EditText) findViewById(R.id.kcal_weight);
        heightInput = (EditText) findViewById(R.id.kcal_height);
        ageInput = (EditText) findViewById(R.id.kcal_age);
        button = (Button) findViewById(R.id.kcal_calculate);
        goBack = (FloatingActionButton) findViewById(R.id.kcal_back);

        chipGroupGender.setOnCheckedStateChangeListener(new ChipGroup.OnCheckedStateChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull ChipGroup group, @NonNull List<Integer> checkedIds) {
                for (Integer checkedId : checkedIds) {
                    Chip chip = group.findViewById(checkedId);
                    if (chip != null) {
                        gender = chip.getText().toString().toLowerCase();
                    }
                }
            }
        });

        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent(KcalActivity.this, MainActivity.class);
                startActivity(returnIntent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMR();
            }
        });
    }

    private void calculateBMR(){
        double bmr;
        double weight = Double.parseDouble(weightInput.getText().toString());
        double height = Double.parseDouble(heightInput.getText().toString());
        double age = Double.parseDouble(ageInput.getText().toString());

        if (gender.equals("male")){
            bmr = 66.47 + (13.7 * weight) + (5 * height) - (6.76 * age);
            kcalOutput.setText(String.format("Your BMR is: %.2f", bmr));
        } else if (gender.equals("female")){
            bmr = 655.1 + (9.567 * weight) + (1.85 * height) - (4.68 * age);
            kcalOutput.setText(String.format("Your BMR is: %.2f", bmr));
        }
    }

}
