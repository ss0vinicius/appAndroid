package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = this.getIntent();

        double result = intent.getDoubleExtra("Result", 0);

        EditText etResult = (EditText) findViewById(R.id.etResult);
        etResult.setText(Double.toString(result));
    }
}