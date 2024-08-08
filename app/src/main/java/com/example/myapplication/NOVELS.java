package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.github.barteksc.pdfviewer.PDFView;

public class NOVELS extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novels);
        ImageButton button = findViewById(R.id.notebook1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NOVELS.this,pdfActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button1 = findViewById(R.id.janeeyre1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NOVELS.this,pdfActivity1.class);
                startActivity(intent);
            }
        });
        ImageButton button2 = findViewById(R.id.wuthering1);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NOVELS.this,pdfActivity2.class);
                startActivity(intent);
            }
        });
        ImageButton button3 = findViewById(R.id.Pride1);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NOVELS.this,pdfActivity3.class);
                startActivity(intent);
            }
        });
        ImageButton button4 = findViewById(R.id.outlander1);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NOVELS.this,pdfActivity4.class);
                startActivity(intent);
            }
        });

    }
}