package com.example.espantalhovoice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button1 = (Button) findViewById(R.id.b2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.apunhalar);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button2 = (Button) findViewById(R.id.b3);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.deus);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button3 = (Button) findViewById(R.id.b4);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.noite);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button4 = (Button) findViewById(R.id.b5);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.massacre);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button5 = (Button) findViewById(R.id.b6);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.morrer);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button6 = (Button) findViewById(R.id.b9);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.grito);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button7 = (Button) findViewById(R.id.b8);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.carne);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button8 = (Button) findViewById(R.id.b7);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.diabolus);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button9 = (Button) findViewById(R.id.b12);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.saduj);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button10 = (Button) findViewById(R.id.b11);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.risada);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button11 = (Button) findViewById(R.id.b10);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tripas);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });
        Button button12 = (Button) findViewById(R.id.b1);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.onichan);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button13 = (Button) findViewById(R.id.b13);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ola);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button15 = (Button) findViewById(R.id.b15);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.historia);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });

        Button button14 = (Button) findViewById(R.id.b14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.desculpas);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });
    }
}