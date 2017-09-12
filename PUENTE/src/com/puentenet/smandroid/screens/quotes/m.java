package com.puentenet.smandroid.screens.quotes;

import android.widget.Toast;
import com.puentenet.smandroid.customdialogs.CustomYesNoDialog;
import com.puentenet.smandroid.customdialogs.TextDialog;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;

class m implements com.puentenet.smandroid.screens.quotes.edit.f {
   // $FF: synthetic field
   final QuotesActivity a;

   m(QuotesActivity var1) {
      this.a = var1;
   }

   public void a() {
      TextDialog.a("Nueva watchlist", "Copiar", com.puentenet.a.e.b.e().b() + " copia", 1, 2130903100).a(this.a.e(), "copy_watchlist");
   }

   public void b() {
      if(com.puentenet.a.e.b.g().size() == 1) {
         Toast.makeText(this.a, this.a.getString(2131099690), 0).show();
      } else {
         CustomYesNoDialog.a("¿Realmente quieres borrar la watchlist \'" + com.puentenet.a.e.b.e().b() + "\'?", 2).a(this.a.e(), "copy_watchlist");
      }

   }
}
