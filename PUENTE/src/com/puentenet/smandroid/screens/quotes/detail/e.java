package com.puentenet.smandroid.screens.quotes.detail;

import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailFragment;

class e extends com.puentenet.a.d.c {
   // $FF: synthetic field
   final QuotesDetailFragment a;
   // $FF: synthetic field
   private final boolean b;

   e(QuotesDetailFragment var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a() {
      this.a.b.a();
   }

   public void a(Exception var1) {
      this.a.b.c();
   }

   public void a(Object var1) {
      this.a.b.c();
      if(this.b) {
         this.a.b.a((com.puentenet.a.d.c.c)var1, QuotesDetailFragment.b(this.a));
      } else {
         QuotesDetailFragment.a(this.a, (com.puentenet.a.d.c.c)var1);
         this.a.b.a(QuotesDetailFragment.c(this.a), QuotesDetailFragment.b(this.a));
      }

   }
}
