package com.puentenet.a.d.f;

import com.puentenet.a.d.d;
import com.puentenet.a.d.e;
import com.puentenet.a.d.f.a;
import java.util.Date;

public class c extends e {
   private static c a;
   private final long b = 7776000000L;

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

   public com.puentenet.b.a.b a(com.puentenet.b.c.b var1) {
      String var6 = null;
      com.puentenet.b.a.b var7;
      if(com.puentenet.a.e.b.a()) {
         var6 = com.puentenet.a.e.b.b().a();
         long var4 = com.puentenet.a.e.b.d().a();
         long var2 = (new Date()).getTime();
         var6 = "https://api.puentenet.com/api/rest/usuarios/" + var6 + "/ordenes?numeroCuenta=" + var4 + "&fechaDesde=" + (var2 - 7776000000L) + "&fechaHasta=" + var2;
         var7 = this.a(new a(), var1, new d(1, var6));
      } else {
         var1.a((Exception)(new com.puentenet.a.c.a.a()));
         var7 = var6;
      }

      return var7;
   }
}
