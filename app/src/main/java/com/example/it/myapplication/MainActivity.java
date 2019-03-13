package com.example.it.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2,btn3, btn4;
    LinearLayout baseLayout;
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);


        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                baseLayout.setBackground(getResources().getDrawable(R.drawable.background1));
                return true;
            case R.id.item2:
                baseLayout.setBackground(getResources().getDrawable(R.drawable.background2));
                return true;
            case R.id.item3:
                baseLayout.setBackground(getResources().getDrawable(R.drawable.background3));
                return true;
            case R.id.item4:
                baseLayout.setBackground(getResources().getDrawable(R.drawable.background4));
                return true;
        }
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("책벌레");
        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        baseLayout=(LinearLayout)findViewById(R.id.baseLayout);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),onetwojava.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),onetwo2java.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),three_1.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),onefourjava.class);
                startActivity(intent);
            }
        });
    }
}
