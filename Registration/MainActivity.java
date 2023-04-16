package com.example.register_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    RadioButton r1,r2;
    Spinner s1;
    Button b1;
    String username,email,password,gender,education;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 =(EditText) findViewById(R.id.user_ed);
        e2 =(EditText) findViewById(R.id.email_ed);
        e3 =(EditText) findViewById(R.id.pass_ed);
        r1 =(RadioButton) findViewById(R.id.male_rd);
        r2 =(RadioButton) findViewById(R.id.female_rd);
        s1 =(Spinner) findViewById(R.id.edu_sp);
        b1 =(Button) findViewById(R.id.submit_btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this,Form_Result.class);
                username = e1.getText().toString();
                email = e2.getText().toString();
                password = e3.getText().toString();
                if(r1.isChecked())
                {
                    gender="Male";
                }
                else
                {
                    gender="Female";
                }
                s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        education = s1.getItemAtPosition(i).toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
                in.putExtra("Name",username);
                in.putExtra("email",email);
                in.putExtra("gender",gender);
                in.putExtra("edu",education);
                startActivity(in);

                //Toast.makeText(getApplicationContext(), ""+education, Toast.LENGTH_LONG).show();
            }
        });
    }
}