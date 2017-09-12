package com.puentenet.a.d.i;

import com.puentenet.a.d.i.d;
import com.puentenet.a.d.i.f;

public class c extends com.puentenet.a.d.e {
   private static c a;

   public static c a() {
      synchronized(c.class){}

      c var0;
      try {
         if(a == null) {
            var0 = new c();
            a = var0;
         }

         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public com.puentenet.b.a.b a(String var1, com.puentenet.b.c.b var2) {
      return f.a().a(var1, new d(this, var2));
   }
}
