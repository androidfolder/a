package com.example.db;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    SQLiteDatabase db;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn_sub);
        b2 = (Button) findViewById(R.id.btn_list);
        b3 = (Button) findViewById(R.id.btn_update);
        b4 = (Button) findViewById(R.id.btn_delete);
        e1 =(EditText) findViewById(R.id.id_ed);
        e2 =(EditText) findViewById(R.id.name_ed);

        try {
            db =openOrCreateDatabase("Mydatabase", SQLiteDatabase.CREATE_IF_NECESSARY,null);
            db.execSQL("Create Table Mydatabase(id integer,name text)");
        } catch (Exception e) {

        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues values=new ContentValues();
                values.put("id",e1.getText().toString());
                values.put("name",e2.getText().toString());
                if (db.insert("Mydatabase",null,values)!=-1);
                {
                    Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                Cursor c = db.rawQuery("Select * from Mydatabase",null);
                c.moveToFirst();
                while(!c.isAfterLast())
                {
                    Toast.makeText(MainActivity.this, c.getString(0)+" "+c.getString(1), Toast.LENGTH_SHORT).show();
                    c.moveToNext();
                }
                c.close();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id =Integer.parseInt(e1.getText().toString());
                String name =e2.getText().toString();
                db.execSQL("UPDATE 'Mydatabase' SET name='' WHERE id = "+ id );
                Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_SHORT).show();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(e1.getText().toString());
                String name =e2.getText().toString();
                db.execSQL("DELETE FROM 'Mydatabase' WHERE id = "+ id );
                Toast.makeText(MainActivity.this, "Delteted", Toast.LENGTH_SHORT).show();

            }
        });
    }
}