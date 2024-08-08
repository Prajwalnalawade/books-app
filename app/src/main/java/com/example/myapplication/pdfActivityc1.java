package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivityc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activityc1);
        PDFView pdfViewc1 = findViewById(R.id.pdfviewc1);

        pdfViewc1.fromAsset("d1.pdf").load();
    }
}