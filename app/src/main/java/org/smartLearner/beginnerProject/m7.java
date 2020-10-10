package org.smartLearner.beginnerProject;
import android.webkit.*;
import android.app.*;
import android.os.*;
public class m7
extends Activity 
    {
        WebView wv;
        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.v7);
                getActionBar().hide();
                wv=findViewById(R.id.v7);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("http://www.myancoop.gov.mm/");
            }

        @Override
        public void onBackPressed()
            {
                if(wv.canGoBack()){
                        wv.goBack();
                    }else{
                        super.onBackPressed();
                    }
            }
    }
