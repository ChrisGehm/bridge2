package com.puentenet.smandroid.b;

import android.content.ContentValues;
import com.puentenet.smandroid.b.e;
import com.puentenet.smandroid.b.g;
import java.util.Map;

class h implements Runnable {
   // $FF: synthetic field
   final g a;
   // $FF: synthetic field
   private final boolean b;

   h(g var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      ContentValues var1 = new ContentValues();
      var1.put("opt_out", Boolean.valueOf(this.b));
      g.a(this.a).a("api_keys", var1, String.format("%s = ?", new Object[]{"_id"}), new String[]{Long.toString(g.b(this.a))});
      g var2;
      String var3;
      if(!g.c(this.a)) {
         this.a.b(true);
         var2 = this.a;
         if(this.b) {
            var3 = e.d;
         } else {
            var3 = e.c;
         }

         var2.a(var3, (Map)null);
         this.a.b();
      } else {
         var2 = this.a;
         if(this.b) {
            var3 = e.d;
         } else {
            var3 = e.c;
         }

         var2.a(var3, (Map)null);
      }

   }
}
