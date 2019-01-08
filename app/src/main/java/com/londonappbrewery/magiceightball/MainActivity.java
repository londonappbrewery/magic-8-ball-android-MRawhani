package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askbtn = findViewById(R.id.askbtn);
        final ImageView amg= findViewById(R.id.magicimg);

        final int [] imgs = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random no = new Random();
                int number = no.nextInt(4);
                amg.setImageResource(imgs[number]);
            }
        });
    }
}
