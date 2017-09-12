package com.puentenet.smandroid.screens.quotes;

import com.puentenet.smandroid.customdialogs.TextDialog;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;

class k implements com.puentenet.smandroid.screens.quotes.watchlist.c {
   // $FF: synthetic field
   final QuotesActivity a;

   k(QuotesActivity var1) {
      this.a = var1;
   }

   public void a() {
      TextDialog.a("Nueva watchlist", "Crear", "", 0, 2130903100).a(this.a.e(), "create_watchlist");
   }

   public void b() {
      QuotesActivity.b(this.a, true);
   }
}
