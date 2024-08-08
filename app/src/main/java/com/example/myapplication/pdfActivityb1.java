package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivityb1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activityb1);
        PDFView pdfViewb1 = findViewById(R.id.pdfviewb1);

        pdfViewb1.fromAsset("c1.pdf").load();
    }
}