package com.puentenet.a.d.g;

import com.puentenet.a.d.d;
import com.puentenet.a.d.e;
import com.puentenet.a.d.g.a;

public class b extends e {
   private static b a;

   public static b a() {
      synchronized(b.class){}

      b var0;
      try {
         if(a == null) {
            var0 = new b();
            a = var0;
         }

         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public com.puentenet.b.a.b a(String var1, com.puentenet.b.c.b var2) {
      return this.a(new a(), var2, new d(1, "https://api.puentenet.com/api/rest/cotizaciones/instrumento/" + var1));
   }
}
