package com.example.androidjavacomponents.JavaAndroidComponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidjavacomponents.R;

public class PalindromeCheckerActivity extends AppCompatActivity {

    EditText inputWord;
    Button palindromeBtn;
    TextView resultPalindrome;
    String getInput, getReverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_palindrome_checker);

        inputWord = findViewById(R.id.input_word);
        palindromeBtn = findViewById(R.id.check_btn);
        resultPalindrome = findViewById(R.id.result_palindrome);

        palindromeBtn.setOnClickListener(v -> {

            getInput = inputWord.getText().toString();

            StringBuilder input = new StringBuilder();

            input.append(inputWord.getText().toString());
            getReverse = input.reverse().toString();

            if (getInput.equals(getReverse)){
                resultPalindrome.setText("The word is a palindrome");
            } else {
                resultPalindrome.setText("The word is NOT a palindrome");
            }

        });
    }
}