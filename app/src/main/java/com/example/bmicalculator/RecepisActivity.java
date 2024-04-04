package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RecepisActivity extends AppCompatActivity {
    private FloatingActionButton goBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_page);

        goBack = (FloatingActionButton) findViewById(R.id.recepies_back);
        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent(RecepisActivity.this, MainActivity.class);
                startActivity(returnIntent);
            }
        });
    }


}
