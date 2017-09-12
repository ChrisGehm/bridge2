package com.puentenet.smandroid.fragments;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.puentenet.smandroid.fragments.WebViewFragment;

class j extends WebChromeClient {
   // $FF: synthetic field
   final WebViewFragment a;

   j(WebViewFragment var1) {
      this.a = var1;
   }

   public void onProgressChanged(WebView var1, int var2) {
      if(var2 < 100) {
         WebViewFragment.a(this.a).setProgress(var2);
      } else {
         WebViewFragment.a(this.a).setVisibility(8);
      }

   }
}
