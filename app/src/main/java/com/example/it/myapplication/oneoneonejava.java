package com.example.it.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.HashMap;
import java.util.Locale;

/**
 * Created by IT on 2017-11-15.
 */
public class oneoneonejava extends Activity{
    TextToSpeech tts;
    EditText editText;
    Button button, btnPrev, btnNext,btnOff,btnOn;
    ImageButton btnBack;
    ViewFlipper vFlipper;
    Intent intent1;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneoneone);

        btnBack=(ImageButton)findViewById(R.id.btnBack);
        editText=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);
        btnNext=(Button)findViewById(R.id.btnNext);
        btnPrev=(Button)findViewById(R.id.btnPrev);
        vFlipper=(ViewFlipper)findViewById(R.id.viewFlipper1);
        btnOff=(Button)findViewById(R.id.btnOFF);
        btnOn=(Button)findViewById(R.id.btnON);
        intent1=new Intent(this,MusicService.class);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vFlipper.showPrevious();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vFlipper.showNext();
            }
        });

        tts=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.KOREAN);
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();


                //http://stackoverflow.com/a/29777304
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ttsGreater21(text);
                } else {
                    ttsUnder20(text);
                }

            }
        });
        btnOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(intent1);
            }
        });
        btnOff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopService(intent1);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(tts !=null){
            tts.stop();
            tts.shutdown();
        }
    }

    @SuppressWarnings("deprecation")
    private void ttsUnder20(String text) {
        HashMap<String, String> map = new HashMap<>();
        map.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "MessageId");
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, map);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void ttsGreater21(String text) {
        String utteranceId=this.hashCode() + "";
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId);
    }
}