package com.puentenet.smandroid.screens.news;

import android.os.Bundle;
import com.puentenet.smandroid.MainFragmentActivity;
import com.puentenet.smandroid.fragments.WebViewFragment;
import com.puentenet.smandroid.screens.news.a;

public class NewsActivity extends MainFragmentActivity {
   private WebViewFragment n;

   // $FF: synthetic method
   static WebViewFragment a(NewsActivity var0) {
      return var0.n;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903060);
      this.n = (WebViewFragment)this.e().a(2131361860);
      this.n.a("http://twitter.com/puentetweets");
   }

   protected void onResume() {
      super.onResume();
      this.findViewById(2131361794).setOnClickListener(new a(this));
   }
}
