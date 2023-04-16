package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText ed1,ed2,ed3;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btn_add);
        b2=(Button)findViewById(R.id.btn_sub);
        b3=(Button)findViewById(R.id.btn_div);
        b4=(Button)findViewById(R.id.btn_multi);
        ed1=(EditText)findViewById(R.id.edfnum);
        ed2=(EditText)findViewById(R.id.edscndnum);
        ed3=(EditText)findViewById(R.id.txt_rslt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(ed1.getText().toString());
                b=Integer.parseInt(ed2.getText().toString());
                c=a+b;
                ed3.setText("Sum is " +c);
                Toast.makeText(MainActivity.this,"Sum is" +c, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(ed1.getText().toString());
                b=Integer.parseInt(ed2.getText().toString());
                c=a-b;
                ed3.setText("Result is " +c);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(ed1.getText().toString());
                b=Integer.parseInt(ed2.getText().toString());
                c=a/b;
                ed3.setText("Result is " +c);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(ed1.getText().toString());
                b=Integer.parseInt(ed2.getText().toString());
                c=a*b;
                ed3.setText("Result is " +c);
            }
        });
    }
}