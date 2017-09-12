package com.puentenet.smandroid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.puentenet.smandroid.fragments.i;
import com.puentenet.smandroid.fragments.j;

public class WebViewFragment extends Fragment {
   private WebView a;
   private ProgressBar b;

   public WebViewFragment() {
      this.c(true);
   }

   // $FF: synthetic method
   static ProgressBar a(WebViewFragment var0) {
      return var0.b;
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2130903103, var2, false);
      this.a = (WebView)var4.findViewById(2131362110);
      this.b = (ProgressBar)var4.findViewById(2131362111);
      this.a.getSettings().setJavaScriptEnabled(true);
      this.a.setWebViewClient(new i(this));
      this.a.setWebChromeClient(new j(this));
      return var4;
   }

   public void a(String var1) {
      this.a.stopLoading();
      this.b.setProgress(0);
      this.b.setVisibility(0);
      this.a.loadUrl(var1);
   }
}
