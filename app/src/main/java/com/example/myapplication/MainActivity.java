package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton = findViewById(R.id.imageButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }

        });
        ImageButton imageButton1 = findViewById(R.id.imageButton3);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }

        });
        ImageButton imageButton2 = findViewById(R.id.imageButton4);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }

        });
        ImageButton imageButton3 = findViewById(R.id.imageButton5);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
        ImageButton imageButton4 = findViewById(R.id.imageButton6);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }

        });
        ImageButton imageButton5 = findViewById(R.id.imageButton7);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }

        });
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this , MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent = new Intent(this , NOVELS.class);
        startActivity(intent);
    }
    public void openActivity4()
    {
        Intent intent = new Intent(this , COMEDY.class);
        startActivity(intent);
    }
    public void openActivity5()
    {
        Intent intent = new Intent(this , HORROR.class);
        startActivity(intent);
    }

    public void openActivity6()
    {
        Intent intent = new Intent(this , COMICS.class);
        startActivity(intent);
    }
    public void openActivity7()
    {
        Intent intent = new Intent(this , THRILLER.class);
        startActivity(intent);
    }

}
