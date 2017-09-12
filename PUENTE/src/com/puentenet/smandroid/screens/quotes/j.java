package com.puentenet.smandroid.screens.quotes;

import com.puentenet.smandroid.MainActivity;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;
import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailFragment;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class j implements com.puentenet.smandroid.screens.quotes.detail.h {
   // $FF: synthetic field
   final QuotesActivity a;

   j(QuotesActivity var1) {
      this.a = var1;
   }

   public void a() {
      TradeFragment.b = ((QuotesDetailFragment)this.a.e().a(2131361914)).c();
      ((MainActivity)this.a.getParent()).a(3);
   }

   public void b() {
      QuotesActivity.a(this.a, false);
      ((QuotesDetailFragment)this.a.e().a(2131361914)).a();
   }
}
