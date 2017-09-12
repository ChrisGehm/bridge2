package com.puentenet.a.c;

import com.puentenet.a.c.l;
import com.puentenet.a.c.n;

public class b {
   private l a;
   private n b;

   public b() {
   }

   public b(l var1, n var2) {
      this.a = var1;
      this.b = var2;
   }

   public static b a(com.puentenet.b.d.a.c var0) {
      l var1;
      n var4;
      try {
         com.puentenet.b.d.a.c var2 = var0.e("resumen");
         var1 = new l(var2);
         var4 = new n(var0.d("tenencias"));
      } catch (com.puentenet.b.d.a.b var3) {
         throw new RuntimeException(var3.getMessage());
      }

      return new b(var1, var4);
   }

   public l a() {
      return this.a;
   }

   public n b() {
      return this.b;
   }

   public String toString() {
      return "RESUMEN: " + this.a + " TENENCIAS: " + this.b;
   }
}
