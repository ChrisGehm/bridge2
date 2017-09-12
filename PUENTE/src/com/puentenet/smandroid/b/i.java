package com.puentenet.smandroid.b;

import com.puentenet.smandroid.b.g;
import java.util.Iterator;
import java.util.List;

class i implements Runnable {
   // $FF: synthetic field
   final g a;
   // $FF: synthetic field
   private final String b;
   // $FF: synthetic field
   private final List c;

   i(g var1, String var2, List var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void run() {
      g.a(this.a).a("event_history", String.format("%s = ?", new Object[]{"session_key_ref"}), new String[]{this.b});
      Iterator var3 = this.c.iterator();

      while(var3.hasNext()) {
         long var1 = ((Long)var3.next()).longValue();
         g.a(this.a).a("upload_blobs", String.format("%s = ?", new Object[]{"_id"}), new String[]{Long.toString(var1)});
      }

      g.a(this.a).a("sessions", String.format("%s = ?", new Object[]{"_id"}), new String[]{this.b});
   }
}
