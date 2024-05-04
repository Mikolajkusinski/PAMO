package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.db.williamchart.view.LineChartView
import com.example.bmicalculator.BmiCalculator.calculateBMI
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BmiActivity : AppCompatActivity() {

    private lateinit var bmiOutput: TextView
    private lateinit var heightInput: EditText
    private lateinit var weightInput: EditText
    private lateinit var button: Button
    private lateinit var goBack: FloatingActionButton
    private lateinit var lineChart: LineChartView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bmiOutput = findViewById(R.id.bmi)
        weightInput = findViewById(R.id.weight)
        heightInput = findViewById(R.id.height)
        button = findViewById(R.id.calculate)
        goBack = findViewById(R.id.bmi_back)
        lineChart = findViewById(R.id.lineChart)

        lineChart.animation.duration = animationDuration
        lineChart.animate(lineSet)

        button.setOnClickListener {
            val weight = weightInput.text.toString().toFloat()
            val height = heightInput.text.toString().toFloat()
            val bmi = calculateBMI(weight, height)
            bmiOutput.text = String.format("Your BMI is: %.2f", bmi)
        }

        goBack.setOnClickListener {
            val returnIntent = Intent(this@BmiActivity, MainActivity::class.java)
            startActivity(returnIntent)
        }
    }

    companion object {
        private val lineSet = listOf("Jan" to 20f, "Feb" to 21f, "Mar" to 23f, "Apr" to 24f, "May" to 25f, "Jun" to 26f)
        private const val animationDuration = 1000L
    }
}