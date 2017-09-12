package com.puentenet.b.c;

import com.puentenet.b.c.c;
import com.puentenet.b.c.d;
import java.util.Vector;

public class a {
   private static c a;
   private int b;
   private String c;
   private String d;
   private Vector e = new Vector();

   public a(int var1, String var2) {
      this.c = var2;
      this.b = var1;
   }

   public static c a() {
      synchronized(a.class){}

      c var0;
      try {
         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public static void a(c var0) {
      synchronized(a.class){}

      try {
         a = var0;
      } finally {
         ;
      }

   }

   public void a(String var1) {
      this.d = var1;
   }

   public void a(String var1, String var2) {
      this.e.addElement(new com.puentenet.b.e.f(var1, var2));
   }

   public String b() {
      return this.d;
   }

   public int c() {
      return this.b;
   }

   public Vector d() {
      return this.e;
   }

   public String e() {
      return this.c;
   }

   public d f() {
      return a().a(this);
   }
}
