package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btnbrowse);
        b2=findViewById(R.id.btnphone);
        b3=findViewById(R.id.btnmessage);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9988776655"));
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_SEND);
                in.setType("text/plain");
                in.putExtra(Intent.EXTRA_TEXT,"Hi Mr.Jack");
                startActivity(in);
            }
        });
    }
}