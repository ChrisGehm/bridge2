package com.puentenet.a.c;

import java.util.Vector;

public class g {
   private long a;
   private double b;
   private long c;

   public g(com.puentenet.b.d.a.c var1) {
      this.a = var1.f("cantidad");
      this.b = var1.c("precio");
      this.c = var1.f("fecha");
   }

   public static Vector a(com.puentenet.b.d.a.a var0) {
      Vector var2 = new Vector();

      for(int var1 = 0; var1 < var0.a(); ++var1) {
         var2.addElement(new g(var0.b(var1)));
      }

      return var2;
   }

   public long a() {
      return this.a;
   }

   public long b() {
      return this.c;
   }

   public double c() {
      return this.b;
   }
}
