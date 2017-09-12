package com.puentenet.a.d.j;

import com.puentenet.a.d.e;
import com.puentenet.a.d.j.a;
import com.puentenet.a.d.j.b;
import com.puentenet.a.d.j.d;

public class c extends e {
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

   public com.puentenet.b.a.b a(b var1, com.puentenet.b.c.b var2) {
      Object var3 = null;
      com.puentenet.b.a.b var6;
      if(com.puentenet.a.e.b.a()) {
         String var4 = com.puentenet.a.e.b.b().a();
         var4 = "https://api.puentenet.com/api/rest/usuarios/" + var4 + "/ordenes";

         com.puentenet.b.d.a.c var7;
         try {
            var7 = var1.o();
         } catch (com.puentenet.b.d.a.b var5) {
            var2.a((Exception)var5);
            var6 = (com.puentenet.b.a.b)var3;
            return var6;
         }

         var6 = this.a(new a(), var2, new d(this, var4, var7));
      } else {
         var2.a((Exception)(new com.puentenet.a.c.a.a()));
         var6 = (com.puentenet.b.a.b)var3;
      }

      return var6;
   }
}
