package com.example.it.myapplication;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by IT on 2017-11-15.
 */
public class onefourjava extends Activity {
    EditText edtUrl;
    Button btnGo,btnBack;
    WebView web;
    String str1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onefour);

        edtUrl=(EditText)findViewById(R.id.edtUrl1);
        btnGo=(Button)findViewById(R.id.btnGo);
        btnBack=(Button)findViewById(R.id.btnBack);
        web=(WebView)findViewById(R.id.webView1);

        web.setWebViewClient(new CookWebViewClient());
        WebSettings webSet=web.getSettings();
        webSet.setBuiltInZoomControls(true);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1=edtUrl.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, str1);
                startActivity(intent);

            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.goBack();
            }
        });
    }
    class CookWebViewClient extends WebViewClient{
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            return super.shouldOverrideUrlLoading(view,url);
        }
    }
}

