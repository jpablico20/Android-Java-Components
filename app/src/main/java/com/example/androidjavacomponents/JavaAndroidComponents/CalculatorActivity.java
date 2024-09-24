package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.androidjavacomponents.R;

public class CalculatorActivity extends AppCompatActivity {

    EditText firstNum, secondNum;
    Button addition, subtraction, multiplication, division;
    TextView showResult;

    int getNum1, getNum2, getResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculator);

        firstNum = findViewById(R.id.first_number_input);
        secondNum = findViewById(R.id.second_number_input);
        addition = findViewById(R.id.addition_btn);
        subtraction = findViewById(R.id.subtraction_btn);
        multiplication = findViewById(R.id.multiplication_btn);
        division = findViewById(R.id.division_btn);
        showResult = findViewById(R.id.calculate_number);

        addition.setOnClickListener(v -> {
            getNum1 = Integer.parseInt(firstNum.getText().toString());
            getNum2 = Integer.parseInt(secondNum.getText().toString());

            getResult = getNum1 + getNum2;

            showResult.setText(String.valueOf(getResult));
        });

        subtraction.setOnClickListener(v -> {
            getNum1 = Integer.parseInt(firstNum.getText().toString());
            getNum2 = Integer.parseInt(secondNum.getText().toString());

            getResult = getNum1 - getNum2;

            showResult.setText(String.valueOf(getResult));
        });

        multiplication.setOnClickListener(v -> {
            getNum1 = Integer.parseInt(firstNum.getText().toString());
            getNum2 = Integer.parseInt(secondNum.getText().toString());

            getResult = getNum1 * getNum2;

            showResult.setText(String.valueOf(getResult));
        });

        division.setOnClickListener(v -> {
            getNum1 = Integer.parseInt(firstNum.getText().toString());
            getNum2 = Integer.parseInt(secondNum.getText().toString());

            getResult = getNum1 / getNum2;

            showResult.setText(String.valueOf(getResult));
        });

    }
}