package com.puentenet.smandroid.screens.trade;

import android.graphics.Color;

public class b {
   private static int a = Color.rgb(128, 0, 0);
   private static int b = Color.rgb(51, 51, 51);
   private static int c = Color.rgb(0, 128, 0);

   public static int a(String var0) {
      int var1 = -7829368;
      if(var0.equals("C")) {
         var1 = c;
      }

      if(var0.equals("V")) {
         var1 = a;
      }

      return var1;
   }

   public static int b(String var0) {
      int var1 = -7829368;
      if(!var0.equals("P") && !var0.equals("A") && !var0.equals("PF") && !var0.equals("EC") && !var0.equals("EP") && !var0.equals("PIP") && !var0.equals("PAP") && !var0.equals("FP")) {
         if(!var0.equals("C") && !var0.equals("R") && !var0.equals("V") && !var0.equals("PC") && !var0.equals("CP")) {
            if(var0.equals("E")) {
               var1 = b;
            }
         } else {
            var1 = a;
         }
      } else {
         var1 = -16776961;
      }

      return var1;
   }
}
