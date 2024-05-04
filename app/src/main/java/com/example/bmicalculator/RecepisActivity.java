package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RecepisActivity extends AppCompatActivity {
    private FloatingActionButton goBack;
    private Button goToShoppingListButton;
    private Button goToShoppingListButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_page);

        List<String> pancakeProducts = new ArrayList<>();
        pancakeProducts.add("Plain flour");
        pancakeProducts.add("Large eggs");
        pancakeProducts.add("Milk");
        pancakeProducts.add("Sunflower or vegetable oil");
        pancakeProducts.add("Salt");

        List<String> oatmealProducts = new ArrayList<>();
        oatmealProducts.add("Water or Milk");
        oatmealProducts.add("Rolled oats");
        oatmealProducts.add("Salt");
        oatmealProducts.add("Sweetener");
        oatmealProducts.add("Fruits");
        oatmealProducts.add("Nuts");
        oatmealProducts.add("Seeds");
        oatmealProducts.add("Cinnamon");

        goBack = (FloatingActionButton) findViewById(R.id.recepies_back);
        goToShoppingListButton = (Button) findViewById(R.id.goToShoppingList1);
        goToShoppingListButton2 = (Button) findViewById(R.id.goToShoppingList2);

        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent(RecepisActivity.this, MainActivity.class);
                startActivity(returnIntent);
            }
        });

        goToShoppingListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecepisActivity.this, ShoppingListActivity.class);
                intent.putStringArrayListExtra("productList", new ArrayList<>(pancakeProducts));
                startActivity(intent);
            }
        });

        goToShoppingListButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecepisActivity.this, ShoppingListActivity.class);
                intent.putStringArrayListExtra("productList", new ArrayList<>(oatmealProducts));
                startActivity(intent);
            }
        });
    }


}
