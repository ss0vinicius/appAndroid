package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multiply(View v){
        //creating temporary variables that will access the interface components
        // (R.id.^ are the interface associated constant components
        EditText etNumber1 = (EditText) findViewById(R.id.etNumber1);
        EditText etNumber2 = (EditText) findViewById(R.id.etNumber2);
        EditText etResult = (EditText) findViewById(R.id.etResult);

        //Catching the input values written by the user
        double n1 = Double.parseDouble(etNumber1.getText().toString());
        double n2 = Double.parseDouble(etNumber2.getText().toString());
        double result = n1 * n2;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("Result", result);
        startActivity(intent);

        //Showing the interface result
        etResult.setText(Double.toString(result));

    }
}

