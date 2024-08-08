package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivitye6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_activitye6);
        PDFView pdfViewe6 = findViewById(R.id.pdfviewe6);

        pdfViewe6.fromAsset("f6.pdf").load();
    }
}