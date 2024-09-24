package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidjavacomponents.R;

public class EvenOddCheckerActivity extends AppCompatActivity {

    EditText enterNumber;
    Button checkBtn;
    TextView resultEvenOdd;
    int getNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_even_odd_checker);

        enterNumber = findViewById(R.id.enter_number);
        checkBtn = findViewById(R.id.odd_even_button);
        resultEvenOdd = findViewById(R.id.result_odd_even);

        checkBtn.setOnClickListener(v ->{

            getNum = Integer.parseInt(enterNumber.getText().toString());

            if (getNum % 2 == 0){
                resultEvenOdd.setText("Even");
            } else {
                resultEvenOdd.setText("Odd");
            }

        });
    }
}