package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivitye7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activitye7);
        PDFView pdfViewe7 = findViewById(R.id.pdfviewe7);

        pdfViewe7.fromAsset("f7.pdf").load();
    }
}