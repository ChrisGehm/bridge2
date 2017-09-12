package com.puentenet.a.d.i;

import com.puentenet.a.d.i.e;
import java.util.Vector;

public class f extends com.puentenet.a.d.e {
   private static f a;

   public static f a() {
      synchronized(f.class){}

      f var0;
      try {
         if(a == null) {
            var0 = new f();
            a = var0;
         }

         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public com.puentenet.b.a.b a(String var1, com.puentenet.b.c.b var2) {
      Vector var3 = new Vector();
      var3.addElement(new com.puentenet.b.e.f("texto", var1));
      String var6 = com.puentenet.b.e.a.a().a(var3);
      String var4 = "https://api.puentenet.com/api/rest/cotizaciones/search?" + var6;
      var3 = null;
      com.puentenet.b.a.b var5;
      if(var1.length() >= 2) {
         var5 = this.a(new e(), var2, new com.puentenet.a.d.d(1, var4));
      } else {
         var2.a((Exception)(new com.puentenet.a.c.a.b("El texto debe tener 2 o mas caracteres")));
         var5 = var3;
      }

      return var5;
   }
}
