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
import android.widget.Toast;

import com.protoyanto.manaratian_studentjournal.HomeActivity;
import com.protoyanto.manaratian_studentjournal.R;

public class PortalActivity extends AppCompatActivity {


    private WebView webViewPortal;
    private ProgressBar progressBarPortal;
    private Button backBtnPortal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);


        webViewPortal = findViewById(R.id.portalView);
        progressBarPortal = findViewById(R.id.portalProgress);

        webViewPortal.setWebViewClient(new WebViewClient());
        webViewPortal.loadUrl("http://miuportal.manarat.ac.bd/Security/LogIn.aspx");

        WebSettings webSettings = webViewPortal.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webViewPortal.setWebViewClient(new WebViewClient(){


            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                progressBarPortal.setVisibility(View.VISIBLE);
                setTitle("Loading....");
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {

                progressBarPortal.setVisibility(View.GONE);
                setTitle(view.getTitle());
                super.onPageFinished(view, url);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (webViewPortal.canGoBack()){
            webViewPortal.goBack();
        }
        else {
            super.onBackPressed();
        }

    }

    public void onClickBackBtn(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        backBtnPortal = findViewById(R.id.backBtnPortal);
        startActivity(intent);
    }
}
