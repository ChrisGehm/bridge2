package com.puentenet.smandroid;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class k extends DecimalFormat {
   private DecimalFormatSymbols a = new DecimalFormatSymbols();

   public k(int var1, int var2, int var3, int var4) {
      this.a.setDecimalSeparator(",".charAt(0));
      this.a.setGroupingSeparator(".".charAt(0));
      this.setDecimalFormatSymbols(this.a);
      this.a(var1, var2, var3, var4);
   }

   public String a(Object var1, String var2) {
      if(var1 != null) {
         var2 = super.format(var1);
      }

      return var2;
   }

   public void a(int var1, int var2) {
      this.setMaximumFractionDigits(var2);
      this.setMaximumIntegerDigits(var1);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.a(var2, var4);
      this.b(var1, var3);
   }

   public void b(int var1, int var2) {
      this.setMinimumFractionDigits(var2);
      this.setMinimumIntegerDigits(var1);
   }
}
