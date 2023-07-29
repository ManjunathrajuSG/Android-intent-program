package com.example.myprogram2intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView tname = (TextView) findViewById(R.id.Fname);
        TextView tusn = (TextView) findViewById(R.id.USN);
        TextView tdept = (TextView) findViewById(R.id.Dept);
        Intent i = getIntent();

        String s1 = i.getStringExtra(MainActivity.Efn);
        String s2 = i.getStringExtra(MainActivity.Eusn);
        String s3 = i.getStringExtra(MainActivity.Ed);

        tname.setText(s1);
        tusn.setText(s2);
        tdept.setText(s3);

    }
}