package in.co.ftw.first_app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by ashish on 8/4/16.
 */
public class Second_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_page);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.google.co.in");
    }
}