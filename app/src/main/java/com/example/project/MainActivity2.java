package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    WebView OmOss;
   private Button OmOssKnapp;
   private Button Tillbaka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        OmOss = findViewById(R.id.OmOss);
        OmOssKnapp = findViewById(R.id.OmOssKnapp);
        Tillbaka = findViewById(R.id.Tillbaka);
        OmOss.getSettings().setJavaScriptEnabled(true);
        Tillbaka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("==>", "tillbaka");
                Intent intent = new Intent (MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        OmOss.setWebViewClient(new WebViewClient());
        OmOssKnapp = findViewById(R.id.OmOssKnapp);
        OmOssKnapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Intent button in AboutActivity pressed");
                finish();
            }
        });
        showInternalWebPage();
    }

    public void showInternalWebPage() {
        OmOss.loadUrl("file:///android_asset/OmOss");
    }
}


