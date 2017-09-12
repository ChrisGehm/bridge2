package com.puentenet.smandroid.b;

import android.content.ContentValues;
import com.puentenet.smandroid.b.e;
import com.puentenet.smandroid.b.g;
import java.util.Map;

class j implements Runnable {
   // $FF: synthetic field
   final g a;
   // $FF: synthetic field
   private final ContentValues b;

   j(g var1, ContentValues var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      g.a(this.a, g.a(this.a).a("sessions", this.b));
      if(g.d(this.a) == -1L) {
         throw new RuntimeException("session insert failed");
      } else {
         this.a.a(e.a, (Map)null);
      }
   }
}
