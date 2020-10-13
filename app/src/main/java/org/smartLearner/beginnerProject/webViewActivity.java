package org.smartLearner.beginnerProject;

    import android.webkit.*;
    import android.app.*;
    import android.os.*;

    public class webViewActivity extends Activity 
    {
        WebView wv;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.webView);
            getActionBar().hide();
           
            //Bundle bun= getIntent().getExtras();
            Bundle bun=getIntent().getExtras();

            String data=
                bun.getString("webUrl");
            wv=findViewById(R.id.v1);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setWebViewClient(new WebViewClient());
            wv.loadUrl ( data );
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
  /*
  <Spinner
                           android:id="@+id/spinner1"
                           android:layout_width="match_parent"
                           android:layout_height="wrap_content"
                           />
  */
