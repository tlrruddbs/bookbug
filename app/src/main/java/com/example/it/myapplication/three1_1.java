package com.example.it.myapplication;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by IT on 2017-11-22.
 */

public class three1_1 extends Activity {
    TextView tt;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three1_1);

        BufferedReader in;
        Resources myResources = getResources();
        InputStream myFile = myResources.openRawResource(R.raw.text11);

        StringBuffer strBuffer = new StringBuffer();
        String str = null;
            try {
                in = new BufferedReader(
                        new InputStreamReader(myFile, "UTF-8"));
            while( (str = in.readLine()) != null)
            {
                strBuffer.append(str + "\n");
            }
            in.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        TextView tt = (TextView) findViewById(R.id.themestr);
        tt.setText(strBuffer);

    }



}
