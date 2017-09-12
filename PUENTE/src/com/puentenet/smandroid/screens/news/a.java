package com.puentenet.smandroid.screens.news;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.news.NewsActivity;

class a implements OnClickListener {
   // $FF: synthetic field
   final NewsActivity a;

   a(NewsActivity var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      NewsActivity.a(this.a).a("http://twitter.com/puentetweets");
   }
}
