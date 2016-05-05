package eu.glyphe.masuperapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_webview);

        //fullscreen
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        this.wv = (WebView)this.findViewById(R.id.webView);
        this.wv.getSettings().setJavaScriptEnabled(true);
        this.wv.setWebViewClient(new WebViewClient());

        String url ="http://fr.m.wikipedia.org";

        this.wv.loadUrl(url);
    }
}
