package com.example.myprogram2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Efn = "com.example.MyProgram2Intent.Efn";
    public static final String Eusn = "com.example.MyProgram2Intent.Eusn";
    public static final String Ed = "com.example.MyProgram2Intent.Ed";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisActivity();

            }
        });

    }
    public void DisActivity(){
        EditText et1 = (EditText) findViewById(R.id.main_Name);
        EditText et2 = (EditText) findViewById(R.id.main_USN);
        EditText et3 = (EditText) findViewById(R.id.main_dept);

        String fn = et1.getText().toString();
        String usn = et2.getText().toString();
        String dept = et3.getText().toString();

        Intent i =new Intent(this,DisplayActivity.class);
        i.putExtra(Efn,fn);
        i.putExtra(Eusn,usn);
        i.putExtra(Ed,dept);
        startActivity(i);


    }
}