package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidjavacomponents.R;

public class CounterActivity extends AppCompatActivity {

    int counter = 0;
    Button addBtn;
    TextView counterTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_counter);

        addBtn = findViewById(R.id.add_btn);
        counterTxt = findViewById(R.id.counter_txt);

        addBtn.setOnClickListener(v -> {
            counter++;
            counterTxt.setText(String.valueOf(counter));
        });

    }
}