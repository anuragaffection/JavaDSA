package com.example.javadsanotes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class ActPDF extends AppCompatActivity {

    WebView webView;
    ProgressBar pgBar;

    @SuppressLint({"MissingInflatedId", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);


        webView = findViewById(R.id.webView);
        pgBar = findViewById(R.id.pgBar);


        int index = getIntent().getIntExtra("position", 0);

        if ( index == 0){
            webView.loadUrl("https://drive.google.com/file/d/16xQiFP73jDizvswN20R98HlKOjFRbAZr/view?usp=drivesdk");
            webMore();
        }

        if ( index == 1){
            webView.loadUrl("https://drive.google.com/file/d/16yhqBKOUbtUsoqkIp51pq1gOniJyQry5/view?usp=drivesdk");
            webMore();
        }

        if ( index == 2 ){
            webView.loadUrl("https://drive.google.com/file/d/17F2sKv0yk9g6RKwzJ_sYek6oUpIAVmaI/view?usp=drivesdk");
            webMore();
        }

        if ( index == 3 ){
            webView.loadUrl("https://drive.google.com/file/d/17KpoqJkyi2lLKrFQBcGK7KJzINTAbd_h/view?usp=drivesdk");
            webMore();
        }

        if ( index == 4 ){
            webView.loadUrl("https://drive.google.com/file/d/17QHoM5kv3_dmuQBVIbBD5IAxg62AZJ0k/view?usp=drivesdk");
            webMore();
        }

    }


    @SuppressLint("SetJavaScriptEnabled")
    public void webMore (){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                pgBar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                pgBar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }
        });
    }


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        } else {
            super.onBackPressed();
        }

    }

}