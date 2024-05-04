package com.example.bmicalculator;

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShoppingListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_list)

        val productList = intent.getStringArrayListExtra("productList")
        productList?.let {
            val recyclerViewProducts: RecyclerView = findViewById(R.id.recyclerViewProducts)
            val layoutManager = LinearLayoutManager(this)
            recyclerViewProducts.layoutManager = layoutManager
            val adapter = ProductAdapter(productList)
            recyclerViewProducts.adapter = adapter
        }

        val buttonGoBack: Button = findViewById(R.id.buttonGoBack)

        // Set OnClickListener on the button
        buttonGoBack.setOnClickListener {
            // Navigate back to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}