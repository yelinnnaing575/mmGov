package com.web.search;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.webkit.*;
import android.widget.*;

public class MainActivity extends Activity {

	/** Called when the activity is first created. */
	ProgressBar Pbar;
	EditText url;
	TextView search;
	WebView WebView;

	private class WebClient extends WebViewClient
	{
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
// TODO Auto-generated method stub
			view.loadUrl(url);
			return true;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Pbar = (ProgressBar) findViewById(R.id.pb);
		url = (EditText)findViewById(R.id.url);
		search = (TextView)findViewById(R.id.search);
		WebView = (WebView) findViewById(R.id.WebView);



		search.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
// TODO Auto-generated method stub

					WebView.setWebViewClient(new WebClient());
					WebView.loadUrl("http://"+url.getText().toString());
					WebView.getSettings().setLoadsImagesAutomatically(true);
					WebView.getSettings().setJavaScriptEnabled(true);
					WebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

				}
			});
		WebView.setWebViewClient(new Callback());
		WebSettings webSettings = WebView.getSettings();
		//webSettings.setBuiltInZoomControls(true);
		WebView.getSettings().setLoadsImagesAutomatically(true);
		WebView.getSettings().setJavaScriptEnabled(true);
		WebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		WebView.loadUrl( "http://www.google.com" );
		WebView.setWebChromeClient(new WebChromeClient() {
				public void onProgressChanged(WebView view, int progress) {
					if(progress < 100 && Pbar.getVisibility() == ProgressBar.GONE){
						Pbar.setVisibility(ProgressBar.VISIBLE);

					}

					Pbar.setProgress(progress);
					if(progress == 100) {
						Pbar.setVisibility(ProgressBar.GONE);

					}
				}
			});
	}private class Callback extends WebViewClient {
		public boolean shouldOverrideUrlLoading(WebView view,
												String url) {

			return false;
		}}}

	
