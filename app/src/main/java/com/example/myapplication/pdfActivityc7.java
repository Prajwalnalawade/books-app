package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivityc7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activityc7);
        PDFView pdfViewc7 = findViewById(R.id.pdfviewc7);

        pdfViewc7.fromAsset("d7.pdf").load();
    }
}