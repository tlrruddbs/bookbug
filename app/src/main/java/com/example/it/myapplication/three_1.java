package com.example.it.myapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

/**
 * Created by IT on 2017-11-13.
 */

@SuppressWarnings("deprecation")
public class three_1 extends TabActivity {
    EditText edt1_1,edt1_2,edt2_1,edt2_2,edt3_1,edt3_2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_1);
        edt1_1=(EditText) findViewById(R.id.edt1_1);
        edt1_2=(EditText) findViewById(R.id.edt1_2);
        edt2_1=(EditText) findViewById(R.id.edt2_1);
        edt2_2=(EditText) findViewById(R.id.edt2_2);
        edt3_1=(EditText) findViewById(R.id.edt3_1);
        edt3_2=(EditText) findViewById(R.id.edt3_2);


        TabHost tabHost = getTabHost();

        TabSpec tabSpecSong = tabHost.newTabSpec("FANTASY").setIndicator("판타지소설");
        tabSpecSong.setContent(R.id.tabFantasy);
        tabHost.addTab(tabSpecSong);

        TabSpec tabSpecArtist = tabHost.newTabSpec("BOOK").setIndicator("소설");
        tabSpecArtist.setContent(R.id.tabBook);
        tabHost.addTab(tabSpecArtist);

        TabSpec tabSpecAlbum = tabHost.newTabSpec("DETECTIVE").setIndicator("추리소설");
        tabSpecAlbum.setContent(R.id.tabDetective);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);


        edt1_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),three1_1.class);
                startActivity(intent);
            }
        });
        edt1_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),three1_2.class);
                startActivity(intent);
            }
        });
        edt2_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),three2_1.class);
                startActivity(intent);
            }
        });
        edt2_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),three2_2.class);
                startActivity(intent);
            }
        });
        edt3_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),three3_1.class);
                startActivity(intent);
            }
        });
        edt3_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),three3_2.class);
                startActivity(intent);
            }
        });

    }


}
