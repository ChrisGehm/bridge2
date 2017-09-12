package com.puentenet.a.d.a;

import com.puentenet.a.d.d;
import com.puentenet.a.d.e;
import com.puentenet.a.d.a.a;
import java.util.Date;

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

   public com.puentenet.b.a.b a(long var1, com.puentenet.b.c.b var3) {
      String var6 = null;
      com.puentenet.b.a.b var7;
      if(com.puentenet.a.e.b.a()) {
         var6 = com.puentenet.a.e.b.b().a();
         long var4 = (new Date()).getTime();
         var6 = "https://api.puentenet.com/api/rest/usuarios/" + var6 + "/cuentas/" + var1 + "/estado?fecha=" + var4;
         var7 = this.a(new a(var1), var3, new d(1, var6));
      } else {
         var3.a((Exception)(new com.puentenet.a.c.a.a()));
         var7 = var6;
      }

      return var7;
   }
}
