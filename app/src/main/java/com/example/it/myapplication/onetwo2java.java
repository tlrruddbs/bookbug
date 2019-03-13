package com.example.it.myapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by IT on 2017-11-08.
 */
public class onetwo2java extends Activity{
    ImageButton btnBack;
    Button btnBi, btnCl, btnWh ,btnStop1,btnStop2,btnStop3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onetwo2);
        btnBi=(Button) findViewById(R.id.btnBi);
        btnCl=(Button) findViewById(R.id.btnCl);
        btnWh=(Button)findViewById(R.id.btnWh);
        btnBack=(ImageButton)findViewById(R.id.btnBack);
        btnStop1=(Button)findViewById(R.id.btnStop1);
        btnStop2=(Button)findViewById(R.id.btnStop2);
        btnStop3=(Button)findViewById(R.id.btnStop3);

        final MediaPlayer mPlayer1;
        mPlayer1 = MediaPlayer.create(this,R.raw.sound1);
        final MediaPlayer mPlayer2;
        mPlayer2 = MediaPlayer.create(this, R.raw.sound2);
        final MediaPlayer mPlayer3;
        mPlayer3 = MediaPlayer.create(this, R.raw.sound3);


        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        btnBi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayer1.start();
            }
        });
        btnStop1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayer1.pause();
            }
        });

        btnCl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    mPlayer2.start();
                }
        });
        btnStop2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                mPlayer2.pause();
            }
        });
        btnWh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayer3.start();
            }
        });
        btnStop3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                mPlayer3.pause();
            }
        });

    }
}