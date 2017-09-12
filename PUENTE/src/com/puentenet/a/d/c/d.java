package com.puentenet.a.d.c;

import com.puentenet.a.d.e;
import com.puentenet.a.d.c.a;
import java.util.Date;

public class d extends e {
   private static d a;

   public static d a() {
      synchronized(d.class){}

      d var0;
      try {
         if(a == null) {
            var0 = new d();
            a = var0;
         }

         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public com.puentenet.b.a.b a(String var1, com.puentenet.b.c.b var2, boolean var3) {
      long var4 = 1L;
      if(var3) {
         var4 = (new Date()).getTime();
      }

      var1 = "https://api.puentenet.com/api/rest/cotizaciones/instrumento/" + var1 + "/historial?fecha=" + var4;
      return this.a(new a(var3), var2, new com.puentenet.a.d.d(1, var1));
   }
}
