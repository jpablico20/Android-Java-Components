package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;




import com.example.androidjavacomponents.R;

public class DisplayNameActivity extends AppCompatActivity {

    EditText nameEnter;
    Button nameBtn;
    TextView nameTxt;
    String showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_name);

        nameEnter = findViewById(R.id.name_edit);
        nameBtn = findViewById(R.id.name_btn);
        nameTxt = findViewById(R.id.name_txt);

        nameBtn.setOnClickListener(view -> {

            showName = nameEnter.getText().toString();
            nameTxt.setText(showName);

        });

    }
}