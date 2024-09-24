package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.androidjavacomponents.R;

public class SimpleFormActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputEmail;
    EditText inputCode;
    Button submitBtn;
    TextView showOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_simple_form);

        inputName = findViewById(R.id.name_input);
        inputEmail = findViewById(R.id.email_input);
        inputCode = findViewById(R.id.code_input);
        submitBtn = findViewById(R.id.submit_btn);
        showOutput = findViewById(R.id.output_txt);

        submitBtn.setOnClickListener(v -> {
            String name = inputName.getText().toString();
            String email = inputEmail.getText().toString();
            String code = inputCode.getText().toString();

            showOutput.setText(name + "\n" +  email + "\n" + code);
        });

    }
}