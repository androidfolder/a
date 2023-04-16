package com.example.datepicker;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker simpleDatePicker;
    Button submit;
    TextView txtdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker ssimpleDatePicker=(DatePicker)findViewById(R.id.simpleDP); // initiate a date picker
        ssimpleDatePicker.setBackgroundColor(Color.YELLOW);
        txtdate = (TextView) findViewById(R.id.txtsimpledate);
        simpleDatePicker = (DatePicker) findViewById(R.id.simpleDP);
        submit = (Button) findViewById(R.id.btnsubmit);
        // perform click event on submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the values for day of month , month and year from a date picker
                String day = "Day = " + simpleDatePicker.getDayOfMonth();
                String month = "Month = " + (simpleDatePicker.getMonth() + 1);
                String year = "Year = " + simpleDatePicker.getYear();
                // display the values by using a toast
                // Toast.makeText(getApplicationContext(), day + "\n" + month + "\n" + year, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), day + ", " + month + ", " + year, Toast.LENGTH_LONG).show();

            }
        });
    }




}

