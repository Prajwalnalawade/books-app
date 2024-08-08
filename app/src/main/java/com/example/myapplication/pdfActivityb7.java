package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivityb7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activityb7);
        PDFView pdfViewb7 = findViewById(R.id.pdfviewb7);

        pdfViewb7.fromAsset("c7.pdf").load();
    }
}