package com.puentenet.b.e;

import com.puentenet.b.e.c;
import com.puentenet.b.e.d;
import com.puentenet.b.e.e;

public class a {
   private static d a;
   private static c b;
   private static e c;

   public static e a() {
      if(c == null) {
         throw new IllegalStateException("Please call load method before");
      } else {
         return c;
      }
   }

   public static void a(d var0, c var1, e var2) {
      a = var0;
      b = var1;
      c = var2;
   }
}
