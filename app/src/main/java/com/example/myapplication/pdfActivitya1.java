package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivitya1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activitya1);
        PDFView pdfViewa1 = findViewById(R.id.pdfviewa1);

        pdfViewa1.fromAsset("b2.pdf").load();
    }
}