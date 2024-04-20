package com.example.bmicalculator;

        import static com.example.bmicalculator.BmiCalculator.calculateBMI;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BmiActivity extends AppCompatActivity {

    private TextView bmiOutput;
    private EditText heightInput,weightInput;
    private Button button;
    private FloatingActionButton goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmiOutput = (TextView) findViewById(R.id.bmi);
        weightInput = (EditText) findViewById(R.id.weight);
        heightInput = (EditText) findViewById(R.id.height);
        button = (Button) findViewById(R.id.calculate);
        goBack = (FloatingActionButton) findViewById(R.id.bmi_back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float weight = Float.parseFloat(weightInput.getText().toString());
                float height = Float.parseFloat(heightInput.getText().toString());
                float bmi = calculateBMI(weight, height);
                bmiOutput.setText(String.format("Your BMI is: %.2f",bmi));
            }
        });

        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent(BmiActivity.this, MainActivity.class);
                startActivity(returnIntent);
            }
        });
    }

}