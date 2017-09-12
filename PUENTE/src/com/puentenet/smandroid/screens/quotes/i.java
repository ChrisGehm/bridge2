package com.puentenet.smandroid.screens.quotes;

import com.puentenet.smandroid.screens.quotes.QuotesActivity;
import com.puentenet.smandroid.screens.quotes.t;

class i implements t {
   // $FF: synthetic field
   final QuotesActivity a;

   i(QuotesActivity var1) {
      this.a = var1;
   }

   public void a(int var1) {
      switch(var1) {
      case 0:
         QuotesActivity.a(this.a).setVisibility(8);
         break;
      case 1:
         QuotesActivity.a(this.a).setDisplayedChild(0);
         QuotesActivity.a(this.a).setVisibility(0);
         QuotesActivity.b(this.a).b();
         break;
      case 2:
         QuotesActivity.a(this.a).setDisplayedChild(1);
         QuotesActivity.a(this.a).setVisibility(0);
      }

      QuotesActivity.b(this.a, var1);
   }
}
