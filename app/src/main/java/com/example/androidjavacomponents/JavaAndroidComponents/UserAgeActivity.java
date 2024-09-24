package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidjavacomponents.R;

import java.time.LocalDate;

public class UserAgeActivity extends AppCompatActivity {

    EditText birthYear;
    Button ageBtn;
    TextView displayAge;
    int getBirthyr, currentBirthyr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_age);

        birthYear = findViewById(R.id.enter_birth_year);
        ageBtn = findViewById(R.id.age_button);
        displayAge = findViewById(R.id.display_age);

        ageBtn.setOnClickListener(v -> {
            getBirthyr = Integer.parseInt(birthYear.getText().toString());
            currentBirthyr = LocalDate.now().getYear();

            int getAge = currentBirthyr - getBirthyr;

            displayAge.setText(String.valueOf(getAge));

        });
    }
}