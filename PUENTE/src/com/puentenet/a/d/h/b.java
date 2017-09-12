package com.puentenet.a.d.h;

import com.puentenet.a.d.h.a;
import com.puentenet.a.d.h.c;
import java.util.Vector;

public class b extends com.puentenet.a.d.e {
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

   public com.puentenet.b.a.b a(Vector var1, com.puentenet.b.c.b var2) {
      return this.a(new a(), var2, new c(this, var1));
   }
}
