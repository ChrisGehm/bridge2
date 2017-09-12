package com.puentenet.smandroid.screens.quotes.edit;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.quotes.edit.QuotesWatchlistEditPanel;

class d implements OnClickListener {
   // $FF: synthetic field
   final QuotesWatchlistEditPanel a;

   d(QuotesWatchlistEditPanel var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(QuotesWatchlistEditPanel.a(this.a) != null) {
         QuotesWatchlistEditPanel.a(this.a).a();
      }

   }
}
