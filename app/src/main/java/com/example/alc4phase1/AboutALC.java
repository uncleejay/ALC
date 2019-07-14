package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView containerWebView =  findViewById(R.id.containerWebView);
        containerWebView.setWebViewClient(new MyWebViewClient());
        String url ="https://andela.com/alc/";
        containerWebView.getSettings().setJavaScriptEnabled(true);
        containerWebView.loadUrl(url);



    }




    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er){
        handler.proceed();

    }
}
