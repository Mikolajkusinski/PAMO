package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bmiButton,kcalButton,recepisButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);

        bmiButton = (Button) findViewById(R.id.bmi_calculator);
        kcalButton = (Button) findViewById(R.id.kcal_calculator);
        recepisButton = (Button) findViewById(R.id.recepies);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent bmiIntent = new Intent(MainActivity.this, BmiActivity.class);
                startActivity(bmiIntent);
            }
        });

        kcalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent kcalIntent = new Intent(MainActivity.this, KcalActivity.class);
                startActivity(kcalIntent);
            }
        });

        recepisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent recepisIntent = new Intent(MainActivity.this, RecepisActivity.class);
                startActivity(recepisIntent);
            }
        });

    }
}