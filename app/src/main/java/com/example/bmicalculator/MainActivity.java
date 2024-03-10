package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView bmiOutput;
    private EditText heightInput,weightInput;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmiOutput = (TextView) findViewById(R.id.bmi);
        weightInput = (EditText) findViewById(R.id.weight);
        heightInput = (EditText) findViewById(R.id.height);
        button = (Button) findViewById(R.id.calculate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI(){
        float weight = Float.parseFloat(weightInput.getText().toString());
        float height = Float.parseFloat(heightInput.getText().toString());
        height = height/100;
        float BMI;

        BMI = weight/(height*height);

        bmiOutput.setText(String.format("Your BMI is: %.2f", BMI));
    }

}