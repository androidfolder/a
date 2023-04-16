package com.example.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout cl = findViewById(R.id.cl);
        Button b1 = (Button) findViewById(R.id.blue);
        Button b2 = (Button) findViewById(R.id.green);
        Button b3 = (Button) findViewById(R.id.red);

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                cl.setBackgroundColor(Color.BLUE);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                cl.setBackgroundColor(Color.GREEN);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                cl.setBackgroundColor(Color.RED);
            }
        });

    }

}
