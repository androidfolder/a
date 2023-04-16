package com.example.intentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn_next);
        e1=(EditText)findViewById(R.id.ed_input);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,MainActivity2.class);
                String text = e1.getText().toString();
                in.putExtra("Text",text);
                in.putExtra("one",1);
                in.putExtra("name","Savio");
                startActivity(in);
            }
        });
    }
}