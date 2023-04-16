package com.example.intentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2= (Button) findViewById(R.id.btn_home);
        Intent in = getIntent();
        int a= in.getIntExtra("one",0);
        String str = in.getStringExtra("name");
        String str1 = in.getStringExtra("Text");
        Toast.makeText(getApplicationContext(), ""+a, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), ""+str, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), ""+str1, Toast.LENGTH_SHORT).show();

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}