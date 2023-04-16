package com.example.register_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Form_Result extends AppCompatActivity {
    Button b2;
    String username,email,gender,education;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_result);
        b2 = (Button) findViewById(R.id.btn_home);
        t1 = (TextView) findViewById(R.id.name_txt_out);
        t2 = (TextView) findViewById(R.id.email_txt_out);
        t3 = (TextView) findViewById(R.id.gender_txt_out);
        t4 = (TextView) findViewById(R.id.edu_txt_out);
        Intent in = getIntent();
        username = in.getStringExtra("name");
        email = in.getStringExtra("email");
        gender = in.getStringExtra("gender");
        education = in.getStringExtra("edu");
        t1.setText(username);
        t2.setText(email);
        t3.setText(gender);
        t4.setText(education);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Form_Result.this,MainActivity.class);
            }
        });


    }
}