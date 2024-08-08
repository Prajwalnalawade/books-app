package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivitye5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activitye5);
        PDFView pdfViewe5 = findViewById(R.id.pdfviewe5);

        pdfViewe5.fromAsset("f5.pdf").load();
    }
}