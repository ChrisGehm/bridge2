package com.puentenet.a.d.i;

import java.util.Vector;

public class b {
   private String a;
   private String b;
   private String c;

   public b(com.puentenet.b.d.a.c var1) {
      this.a = var1.g("nombreInstrumento");
      this.b = var1.g("ticker");
      this.c = var1.g("tipoInstrumento");
   }

   public static Vector a(com.puentenet.b.d.a.c var0) {
      com.puentenet.b.d.a.a var3 = var0.d("resultados");
      Vector var2 = new Vector();

      for(int var1 = 0; var1 < var3.a(); ++var1) {
         var2.addElement(new b(var3.b(var1)));
      }

      return var2;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.b;
   }
}
