package com.puentenet.a.d.e;

import com.puentenet.a.d.d;
import com.puentenet.a.d.e;
import com.puentenet.a.d.e.a;

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
      String var3 = null;
      com.puentenet.b.a.b var4;
      if(com.puentenet.a.e.b.a()) {
         var3 = com.puentenet.a.e.b.b().a();
         var1 = "https://api.puentenet.com/api/rest/usuarios/" + var3 + "/ordenes/" + var1;
         var4 = this.a(new a(), var2, new d(1, var1));
      } else {
         var2.a((Exception)(new com.puentenet.a.c.a.a()));
         var4 = var3;
      }

      return var4;
   }
}
