package com.example.options;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    int a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        e1 = (EditText) findViewById(R.id.num1_edt);
        e2 = (EditText) findViewById(R.id.num2_edt);
        t1 = (TextView) findViewById(R.id.rslt_txt);

        a = Integer.parseInt(e1.getText().toString());
        b = Integer.parseInt(e2.getText().toString());
       // Toast.makeText(this, "Selected items:"+item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.add_item:
                c = a+b;
                Toast.makeText(this, " "+c, Toast.LENGTH_SHORT).show();
            case R.id.sub_item:
                d = a-b;
                Toast.makeText(this, " "+c, Toast.LENGTH_SHORT).show();
            case R.id.mul_item:
                c = a*b;
                Toast.makeText(this, " "+c, Toast.LENGTH_SHORT).show();
            case R.id.div_item:
                c = a/b;
                Toast.makeText(this, " "+c, Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}