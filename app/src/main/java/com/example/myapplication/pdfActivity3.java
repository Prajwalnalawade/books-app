package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf3);
        PDFView pdfView3 = findViewById(R.id.pdfview3);

        pdfView3.fromAsset("The-$30000-Bequest.pdf").load();
    }
}