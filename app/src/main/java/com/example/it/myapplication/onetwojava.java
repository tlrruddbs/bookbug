package com.example.it.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by IT on 2017-11-08.
 */
public class onetwojava extends Activity{
    ImageButton btn1,btn2,btn3,btn4,btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onetwo);
        setTitle("책 메뉴");

        btn1=(ImageButton)findViewById(R.id.btnOne);
        btn2=(ImageButton)findViewById(R.id.btnTwo);
        btn3=(ImageButton)findViewById(R.id.btnThree);
        btn4=(ImageButton)findViewById(R.id.btnFour);
        btnBack=(ImageButton)findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),oneoneonejava.class);
                startActivity(intent);
            }
        });


    }
}
