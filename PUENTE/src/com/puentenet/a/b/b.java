package com.puentenet.a.b;

import com.puentenet.a.b.a;

public class b {
   private static a a;

   public static a a() {
      return a;
   }

   public static String a(String var0) {
      if(var0.equals("Acciones")) {
         var0 = "ACCION";
      } else if(var0.equals("Acciones Ext.")) {
         var0 = "ACCION EXTRANJERA";
      } else if(var0.equals("Bonos")) {
         var0 = "BONO";
      } else if(var0.equals("ETFs")) {
         var0 = "ETF";
      } else {
         var0 = "OPCION";
      }

      return var0;
   }

   public static void a(a var0) {
      a = var0;
   }
}
