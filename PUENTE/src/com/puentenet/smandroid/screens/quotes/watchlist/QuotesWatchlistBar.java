package com.puentenet.smandroid.screens.quotes.watchlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.puentenet.smandroid.screens.quotes.watchlist.a;
import com.puentenet.smandroid.screens.quotes.watchlist.b;
import com.puentenet.smandroid.screens.quotes.watchlist.c;

public class QuotesWatchlistBar extends LinearLayout {
   final OnClickListener a = new a(this);
   final OnClickListener b = new b(this);
   private c c;
   private ImageButton d;
   private ImageButton e;

   public QuotesWatchlistBar(Context var1) {
      super(var1);
   }

   public QuotesWatchlistBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   // $FF: synthetic method
   static c a(QuotesWatchlistBar var0) {
      return var0.c;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.d = (ImageButton)this.findViewById(2131361966);
      if(this.d != null) {
         this.d.setOnClickListener(this.a);
      }

      this.e = (ImageButton)this.findViewById(2131361967);
      if(this.e != null) {
         this.e.setOnClickListener(this.b);
      }

   }

   public void setListener(c var1) {
      this.c = var1;
   }
}
