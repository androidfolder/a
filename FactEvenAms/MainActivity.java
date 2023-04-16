package com.example.factevenams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    TextView t1;
    Button b1,b2,b3;
    int a,b =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.value_edtxt);
        t1 = (TextView) findViewById(R.id.out_txt);
        b1 = (Button) findViewById(R.id.Fact_btn);
        b2 = (Button) findViewById(R.id.evnodd_btn);
        b3 = (Button) findViewById(R.id.Ams_btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());

                for(int i=1;i<=a;i++){
                    b = i*b;
                }
                t1.setText("Factorial is" +b);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());

                if(a%2 ==0)
                {
                    t1.setText("Number is Even");
                }
                else
                {
                    t1.setText("Number is Odd");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());

                int temp,res = 0,r;
                temp = a;
                while (a>0)
                {
                    r = a%10;
                    res = res + (r*r*r);
                    a = a/10;
                }
                if (res == temp)
                {
                    t1.setText("Is Amstrong");
                }
                else
                {
                    t1.setText("Not Amstrong");
                }
            }
        });
    }
}