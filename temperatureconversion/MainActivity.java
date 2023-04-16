package com.example.tempratureconverstion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Fharen(View v)
    {
        e1 =(EditText)findViewById(R.id.textInput);
        e2 =(EditText)findViewById(R.id.rslt);
        a=Integer.parseInt(e1.getText().toString());

        b= a*9/5+32;
        e2.setText(" "+b);
    }
    public void Celsius(View v)
    {
        e1 =(EditText)findViewById(R.id.textInput);
        e2 =(EditText)findViewById(R.id.rslt);
        a=Integer.parseInt(e1.getText().toString());

        b= (a-32)*9/5;
        e2.setText(" "+b);
    }
}