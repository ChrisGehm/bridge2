package com.puentenet.smandroid.screens.quotes;

import android.widget.EditText;
import android.widget.Toast;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;

class l implements com.puentenet.smandroid.screens.quotes.edit.c {
   // $FF: synthetic field
   final QuotesActivity a;

   l(QuotesActivity var1) {
      this.a = var1;
   }

   public void a() {
      QuotesActivity.b(this.a, false);
   }

   public void b() {
      String var1 = ((EditText)this.a.findViewById(2131361968)).getText().toString();
      if(!var1.equals("")) {
         if(!var1.equals(com.puentenet.a.e.b.e().b()) && !com.puentenet.a.e.b.a(var1)) {
            Toast.makeText(this.a, this.a.getString(2131099689), 0).show();
            QuotesActivity.d(this.a);
         } else {
            com.puentenet.a.e.b.e().d(var1);
            QuotesActivity.c(this.a).b();
            QuotesActivity.b(this.a, false);
         }
      } else {
         Toast.makeText(this.a, this.a.getString(2131099688), 0).show();
         QuotesActivity.d(this.a);
      }

   }
}
