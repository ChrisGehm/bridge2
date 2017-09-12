package com.puentenet.smandroid.fragments;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.puentenet.smandroid.fragments.WebViewFragment;

class i extends WebViewClient {
   // $FF: synthetic field
   final WebViewFragment a;

   i(WebViewFragment var1) {
      this.a = var1;
   }

   public void onReceivedError(WebView var1, int var2, String var3, String var4) {
      Toast.makeText(this.a.k(), "Oops!\n" + var3, 0).show();
   }
}
