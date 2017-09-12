package com.puentenet.a.d.b;

import com.puentenet.a.d.d;
import com.puentenet.a.d.e;
import com.puentenet.a.d.b.a;

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
      String var4 = null;
      com.puentenet.b.a.b var5;
      if(com.puentenet.a.e.b.a()) {
         var4 = com.puentenet.a.e.b.b().a();
         var4 = "https://api.puentenet.com/api/rest/usuarios/" + var4 + "/ordenes/" + var1;
         var5 = this.a(new a(), var3, new d(4, var4));
      } else {
         var3.a((Exception)(new com.puentenet.a.c.a.a()));
         var5 = var4;
      }

      return var5;
   }
}
