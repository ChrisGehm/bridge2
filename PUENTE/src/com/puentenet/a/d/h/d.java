package com.puentenet.a.d.h;

import com.puentenet.a.d.h.e;
import java.util.Timer;

public class d {
   private static d c = null;
   private com.puentenet.b.c.b a;
   private boolean b = false;

   private d(long var1, com.puentenet.b.c.b var3) {
      this.a = var3;
      (new Timer()).schedule(new e(this), 500L, var1);
   }

   public static d a(long var0, com.puentenet.b.c.b var2) {
      if(c == null) {
         c = new d(var0, var2);
      } else {
         c.a(var2);
      }

      return c;
   }

   // $FF: synthetic method
   static void a(d var0, boolean var1) {
      var0.b = var1;
   }

   // $FF: synthetic method
   static boolean a(d var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static com.puentenet.b.c.b b(d var0) {
      return var0.a;
   }

   public void a() {
      // $FF: Couldn't be decompiled
   }

   public void a(com.puentenet.b.c.b var1) {
      this.a = var1;
   }
}
