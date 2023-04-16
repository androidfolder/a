package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop invoked");
    }
    
}