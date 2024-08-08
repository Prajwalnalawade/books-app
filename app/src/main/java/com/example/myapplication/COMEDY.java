package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class COMEDY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy);

        ImageButton button = findViewById(R.id.notebook1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMEDY.this, pdfActivitya.class);
                startActivity(intent);
            }
        });
        ImageButton button1 = findViewById(R.id.janeeyre1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMEDY.this, pdfActivitya1.class);
                startActivity(intent);
            }
        });
        ImageButton button2 = findViewById(R.id.wuthering1);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMEDY.this,pdfActivitya2.class);
                startActivity(intent);
            }
        });
        ImageButton button3 = findViewById(R.id.Pride1);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMEDY.this,pdfActivitya3.class);
                startActivity(intent);
            }
        });
        ImageButton button4 = findViewById(R.id.outlander1);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMEDY.this,pdfActivitya4.class);
                startActivity(intent);
            }
        });
    }
}