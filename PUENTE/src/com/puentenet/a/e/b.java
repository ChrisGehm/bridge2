package com.puentenet.a.e;

import com.puentenet.a.c.o;
import com.puentenet.a.e.c;
import com.puentenet.a.e.e;
import java.util.Hashtable;
import java.util.Vector;

public class b {
   private static boolean a;
   private static o b;
   private static com.puentenet.a.c.a c;
   private static Hashtable d;
   private static Vector e = new Vector();
   private static e f;

   public static void a(int var0) {
      if(var0 < e.size()) {
         f = (e)e.elementAt(var0);
      }

   }

   public static void a(com.puentenet.a.c.a var0) {
      if(c != var0) {
         c = var0;
         c.a(1, new Long(var0.a()));
      }

   }

   public static void a(o var0) {
      b = var0;
   }

   public static void a(e var0) {
      f = var0;
   }

   public static void a(Hashtable var0) {
      d = var0;
   }

   public static void a(Vector var0) {
      ((e)e.elementAt(f())).a(var0);
   }

   public static void a(boolean var0) {
      a = var0;
      c.a(0, new Boolean(var0));
   }

   public static boolean a() {
      return a;
   }

   public static boolean a(String var0) {
      Vector var4 = e;
      boolean var3;
      if(var4 != null) {
         int var2 = var4.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            if(var0.toUpperCase().equals(((e)var4.elementAt(var1)).b().toUpperCase())) {
               var3 = false;
               return var3;
            }
         }
      }

      var3 = true;
      return var3;
   }

   public static o b() {
      return b;
   }

   public static void b(e var0) {
      if(!e.contains(var0)) {
         e.addElement(var0);
      }

   }

   public static int c() {
      int var0;
      if(c != null) {
         var0 = b.b().indexOf(c);
      } else {
         var0 = 0;
      }

      return var0;
   }

   public static com.puentenet.a.c.a d() {
      return c;
   }

   public static e e() {
      return f;
   }

   public static int f() {
      return e.indexOf(f);
   }

   public static Vector g() {
      return e;
   }

   public static Hashtable h() {
      return d;
   }
}
