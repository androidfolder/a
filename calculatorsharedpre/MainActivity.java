package com.example.calculatorsharedpre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    double memory = 0.0;
    boolean isNewOperator = true;
    EditText edt1;
    String operator = "+";
    String initialNumber = "";
    static final String PREFS_NAME = "MyPrefsFile";
    static final String MEMORY_KEY = "memory";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.output);

        SharedPreferences sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        memory = sharedPrefs.getFloat(MEMORY_KEY, 0);
        edt1.setText(String.valueOf(memory));
    }
    public void numberEvent(View view) {

        if (isNewOperator)
            edt1.setText("");
        isNewOperator = false;

        String number = edt1.getText().toString();

        if (view.getId() == R.id.one) {
            number += "1";
        } else if (view.getId() == R.id.two) {
            number += "2";
        } else if (view.getId() == R.id.three) {
            number += "3";
        } else if (view.getId() == R.id.four) {
            number += "4";
        } else if (view.getId() == R.id.five) {
            number += "5";
        } else if (view.getId() == R.id.six) {
            number += "6";
        } else if (view.getId() == R.id.seven) {
            number += "7";
        } else if (view.getId() == R.id.eight) {
            number += "8";
        } else if (view.getId() == R.id.nine) {
            number += "9";
        } else if (view.getId() == R.id.zero) {
            number += "0";
        }
        edt1.setText(number);
    }

    public void operatorEvent(View view) {

        isNewOperator = true;
        initialNumber = edt1.getText().toString();

        if (view.getId() == R.id.btnmul) {
            operator = "*";
        } else if (view.getId() == R.id.btndif) {
            operator = "-";
        } else if (view.getId() == R.id.btndiv) {
            operator = "/";
        } else if (view.getId() == R.id.btnadd) {
            operator = "+";
        }
    }

    public void equalEvent(View view) {
        String newNumber = edt1.getText().toString();
        double output = 0.0;

        if (operator == "+")
            output = Double.parseDouble(initialNumber) + Double.parseDouble(newNumber);

        if (operator == "/")
            output = Double.parseDouble(initialNumber) / Double.parseDouble(newNumber);

        if (operator == "*")
            output = Double.parseDouble(initialNumber) * Double.parseDouble(newNumber);

        if (operator == "-")
            output = Double.parseDouble(initialNumber) - Double.parseDouble(newNumber);

        edt1.setText(output + "");

        // Save memory to shared preferences
        SharedPreferences sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putFloat(MEMORY_KEY, (float) output);
        editor.apply();

    }
    public void memoryPlusEvent(View view) {
        String number = edt1.getText().toString();
        double value = Double.parseDouble(number);
        memory += value;
    }

    public void memoryMinusEvent(View view) {
        String number = edt1.getText().toString();
        double value = Double.parseDouble(number);
        memory -= value;
    }

    public void memoryRecallEvent(View view) {
        edt1.setText(String.valueOf(memory));
    }

    public void memoryClearEvent(View view) {
        memory = 0;
    }
}