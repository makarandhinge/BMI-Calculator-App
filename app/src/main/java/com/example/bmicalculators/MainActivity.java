package com.example.bmicalculators;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtResult;
        Button btnCal;
        EditText edtWeight, edtHeightFt, edtHeightIn;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        btnCal = findViewById(R.id.btncal);
        txtResult = findViewById(R.id.txtresult);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int in = Integer.parseInt(edtHeightIn.getText().toString());
                int ft = Integer.parseInt(edtHeightFt.getText().toString());
                int wt = Integer.parseInt(edtWeight.getText().toString());

                int totalIn = ft*12 + in;
                double totalCm = totalIn*2.53;
                 double totalM= totalCm/100;
                 double bmi = wt/(totalM*totalM);

                 if (bmi>25){
                     txtResult.setText("You're OverWeight");
                 }
                 else if(bmi<18){
                     txtResult.setText("You're UnderWeight");
                 }
                 else{
                     txtResult.setText("You're Healthy");
                 }
            }
        });

    }
}