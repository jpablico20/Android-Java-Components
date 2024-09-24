package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidjavacomponents.R;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShowDateActivity extends AppCompatActivity {

    Button showDateBtn;
    TextView showDateTxt;
    String currentDate, currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_date);

        showDateBtn = findViewById(R.id.show_date_btn);
        showDateTxt = findViewById(R.id.show_date_txt);

        showDateBtn.setOnClickListener(v -> {

            currentDate = LocalDate.now().toString();
            currentTime = LocalTime.now().toString();

            showDateTxt.setText(currentDate + "\n" + currentTime);
        });
    }
}