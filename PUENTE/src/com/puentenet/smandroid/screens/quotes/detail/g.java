package com.puentenet.smandroid.screens.quotes.detail;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailTopBar;

class g implements OnClickListener {
   // $FF: synthetic field
   final QuotesDetailTopBar a;

   g(QuotesDetailTopBar var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(QuotesDetailTopBar.a(this.a) != null) {
         QuotesDetailTopBar.a(this.a).a();
      }

   }
}
