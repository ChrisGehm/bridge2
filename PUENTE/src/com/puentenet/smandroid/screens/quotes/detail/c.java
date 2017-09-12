package com.puentenet.smandroid.screens.quotes.detail;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;
import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailFragment;

class c implements OnClickListener {
   // $FF: synthetic field
   final QuotesDetailFragment a;

   c(QuotesDetailFragment var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(!this.a.a.getAdded()) {
         ((QuotesActivity)this.a.k()).c(this.a.a.getTickerName());
         this.a.a.b();
      }

   }
}
