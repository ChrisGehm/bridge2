package com.puentenet.a.d.d;

import com.puentenet.a.d.d.a;
import com.puentenet.a.d.d.c;
import com.puentenet.a.d.d.d;
import java.util.Hashtable;

public class b extends com.puentenet.b.f.a {
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

   public com.puentenet.b.a.b a(com.puentenet.b.c.b var1) {
      String var2 = null;
      com.puentenet.b.a.b var3;
      if(com.puentenet.a.e.b.a()) {
         var2 = "https://api.puentenet.com/api/rest/usuarios/" + com.puentenet.a.e.b.b().a() + "/logout";
         var3 = this.a(new c(this), var1, new com.puentenet.a.d.d(2, var2));
         com.puentenet.a.e.b.a(false);
      } else {
         var1.a((Exception)(new com.puentenet.a.c.a.a()));
         var3 = var2;
      }

      return var3;
   }

   public com.puentenet.b.a.b a(com.puentenet.b.c.b var1, Hashtable var2) {
      return this.a(new a(), var1, new d(this, var2));
   }
}
