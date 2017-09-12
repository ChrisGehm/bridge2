package com.puentenet.smandroid.screens.quotes.watchlist;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.quotes.watchlist.QuotesWatchlistBar;

class b implements OnClickListener {
   // $FF: synthetic field
   final QuotesWatchlistBar a;

   b(QuotesWatchlistBar var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(QuotesWatchlistBar.a(this.a) != null) {
         QuotesWatchlistBar.a(this.a).b();
      }

   }
}
