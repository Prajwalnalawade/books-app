package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivityd10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activityd10);
        PDFView pdfViewd10 = findViewById(R.id.pdfviewd10);

        pdfViewd10.fromAsset("e10.pdf").load();
    }
}