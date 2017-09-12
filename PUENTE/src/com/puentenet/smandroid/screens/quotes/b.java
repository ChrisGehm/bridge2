package com.puentenet.smandroid.screens.quotes;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.quotes.QuoteView;
import com.puentenet.smandroid.screens.quotes.a;

class b implements OnClickListener {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(a.a(this.a) != null) {
         a.a(this.a).a(((QuoteView)var1).getQuote());
      }

   }
}
