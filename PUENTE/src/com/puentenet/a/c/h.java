package com.puentenet.a.c;

import com.puentenet.a.c.c;
import com.puentenet.a.c.e;
import java.util.Calendar;

public class h extends c {
   private double a;
   private double b;

   public h(com.puentenet.b.d.a.c var1) {
      super(var1);
      this.a = var1.a("precio", -1.0D);
      this.b = var1.a("precioDisparo", -1.0D);
   }

   public static e[] p() {
      e[] var5 = new e[29];
      Calendar var6 = Calendar.getInstance();
      int var0 = var6.get(2);
      int var3 = var6.get(1);

      int var4;
      for(int var1 = 0; var1 < 29; var3 = var4) {
         var4 = var3;
         int var2 = var0;
         if(var0 >= 12) {
            var4 = var3 + 1;
            var2 = 0;
         }

         var5[var1] = new e(var2, var4);
         ++var1;
         var0 = var2 + 1;
      }

      return var5;
   }

   public double n() {
      return this.a;
   }

   public double o() {
      return this.b;
   }
}
