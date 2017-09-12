package com.puentenet.a.d;

public class d extends com.puentenet.b.c.a {
   protected static String a;
   protected static String b;
   protected static String c;
   private static String d;

   public d(int var1, String var2) {
      super(var1, b(var2));
      if(d == null) {
         throw new RuntimeException("Please call setParameters() before performing requests");
      } else {
         var2 = "TokenSeguridad";
         String var3 = d;
         if(com.puentenet.a.e.b.a()) {
            var2 = "TokenSesion";
            var3 = com.puentenet.a.e.b.b().c();
         }

         this.a("Cookie", var2 + "=" + var3);
         this.a("Content-Type", "application/json");
      }
   }

   public static void a(String var0, String var1, String var2) {
      a = var0;
      b = var1;
      c = var2;
      d = "cbsefjsgbfxkdfybs|" + a + "|" + b;
   }

   private static String b(String var0) {
      int var1 = var0.indexOf(" ");

      String var2;
      for(var2 = var0; var1 != -1; var2 = var0) {
         String var3 = var2.substring(0, var1) + "%20";
         var0 = var3;
         if(var1 < var2.length() - 1) {
            var0 = var3 + var2.substring(var1 + 1, var2.length());
         }

         var1 = var0.indexOf(" ");
      }

      return var2;
   }
}
