package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class COMICS extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comics);
        ImageButton button = findViewById(R.id.notebook1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this, pdfActivitye1.class);
                startActivity(intent);
            }
        });
        ImageButton button1 = findViewById(R.id.janeeyre1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this, pdfActivitye2.class);
                startActivity(intent);
            }
        });
        ImageButton button2 = findViewById(R.id.wuthering1);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this,pdfActivitye3.class);
                startActivity(intent);
            }
        });
        ImageButton button3 = findViewById(R.id.Pride1);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this,pdfActivitye4.class);
                startActivity(intent);
            }
        });
        ImageButton button4 = findViewById(R.id.outlander1);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this,pdfActivitye5.class);
                startActivity(intent);
            }
        });
        ImageButton button5 = findViewById(R.id.fault);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this, pdfActivitye6.class);
                startActivity(intent);
            }
        });
        ImageButton button6 = findViewById(R.id.img7);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this, pdfActivitye7.class);
                startActivity(intent);
            }
        });
        ImageButton button7 = findViewById(R.id.img8);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this,pdfActivitye8.class);
                startActivity(intent);
            }
        });
        ImageButton button8 = findViewById(R.id.img10);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this,pdfActivitye9.class);
                startActivity(intent);
            }
        });
        ImageButton button9 = findViewById(R.id.img9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(COMICS.this,pdfActivitye10.class);
                startActivity(intent);
            }
        });
    }
}