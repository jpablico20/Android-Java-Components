package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.androidjavacomponents.R;

public class ShowHelloButtonActivity extends AppCompatActivity {

    Button clickBtn;
    TextView showTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_hello_button);

        clickBtn = findViewById(R.id.click_btn);
        showTxt = findViewById(R.id.show_txt);

        clickBtn.setOnClickListener(v -> {
            showTxt.setText("Hello World");
        });

    }
}