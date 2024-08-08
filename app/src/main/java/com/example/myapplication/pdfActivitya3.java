package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivitya3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activitya3);
        PDFView pdfViewa3 = findViewById(R.id.pdfviewa3);

        pdfViewa3.fromAsset("b4.pdf").load();
    }
}