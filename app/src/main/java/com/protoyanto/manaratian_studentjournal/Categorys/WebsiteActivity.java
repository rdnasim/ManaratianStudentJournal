package com.protoyanto.manaratian_studentjournal.Categorys;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

import com.protoyanto.manaratian_studentjournal.HomeActivity;
import com.protoyanto.manaratian_studentjournal.R;

public class WebsiteActivity extends AppCompatActivity {


    private WebView webView;
    private ProgressBar progressBar;
    private Button backBtnWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        webView = findViewById(R.id.websiteView);
        progressBar = findViewById(R.id.websiteProgress);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://manarat.ac.bd");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webView.setWebViewClient(new WebViewClient(){


            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                progressBar.setVisibility(View.VISIBLE);
                setTitle("Loading....");
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {

                progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
                super.onPageFinished(view, url);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

    public void onClickBackBtnWebsite(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        backBtnWebsite = findViewById(R.id.backBtnWebsite);
        startActivity(intent);
    }
}
