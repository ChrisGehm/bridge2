package com.puentenet.b.a;

public abstract class a {
   private static a a;

   public static a a() {
      synchronized(a.class){}

      a var0;
      try {
         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public static void a(a var0) {
      synchronized(a.class){}

      try {
         a = var0;
      } finally {
         ;
      }

   }

   public abstract void a(Runnable var1);

   public abstract void b(Runnable var1);
}
