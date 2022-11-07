package com.example.android.ourappointments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    Button add,about,call,work;

    TextView note1,note2,note3,note4,note5,note6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about=findViewById(R.id.about);
        call=findViewById(R.id.callus);
        work=findViewById(R.id.workhourse);
        add=findViewById(R.id.AddNote);
        note1=findViewById(R.id.note1);
        note2=findViewById(R.id.note2);
        note3=findViewById(R.id.note3);
        note4=findViewById(R.id.note4);
        note5=findViewById(R.id.note5);
        note6=findViewById(R.id.note6);

        note1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), note1.class);
                startActivity(n);
            }
        });
        note2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), note2.class);
                startActivity(n);
            }
        });
        note3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), note3.class);
                startActivity(n);
            }
        });
        note4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), note4.class);
                startActivity(n);
            }
        });
        note5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), note5.class);
                startActivity(n);
            }
        });
        note6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), note6.class);
                startActivity(n);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addn = new Intent(getApplicationContext(), AddNote.class);
                startActivity(addn);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchActivityIntent = new Intent(getApplicationContext(), com.example.android.ourappointments.about.class);
                startActivity(switchActivityIntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:5465465465465"));
                startActivity(intent);
            }
        });

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"you should click a long press on button!",Toast.LENGTH_LONG).show();

            }
        });
        work.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Intent switchActivityIntent1 = new Intent(getApplicationContext(), workH.class);
                startActivity(switchActivityIntent1);
                return false;
            }
        });

    }
}