package com.puentenet.a.d.c;

import com.puentenet.a.d.c.b;
import java.util.Date;
import java.util.Vector;

public class c {
   private static String a = "historial";
   private static long b = 2678400000L;
   private static long c;
   private static long d;
   private static long e;
   private static long f;
   private static long[] g;
   private Vector h = new Vector();
   private Vector i = new Vector();
   private Vector j = new Vector();
   private Vector k = new Vector();
   private Vector l = new Vector();
   private Vector[] m;
   private Vector n;

   static {
      c = 3L * b;
      d = 6L * b;
      e = 12L * b;
      f = 5L * e;
      g = new long[]{b, c, d, e, f};
   }

   public c(com.puentenet.b.d.a.c var1, boolean var2) {
      this.m = new Vector[]{this.h, this.i, this.j, this.k, this.l};
      com.puentenet.b.d.a.a var7 = var1.d(a);
      this.n = new Vector();

      for(int var3 = 0; var3 < var7.a(); ++var3) {
         b var8 = new b(var7.b(var3), var2);
         if(var2) {
            this.n.addElement(var8);
         } else {
            long var5 = (new Date()).getTime();

            for(int var4 = 0; var4 < g.length; ++var4) {
               if(var8.c() > var5 - g[var4]) {
                  this.m[var4].addElement(var8);
               }
            }
         }
      }

   }

   public Vector a(int var1) {
      Vector var2;
      if(var1 == 0) {
         var2 = this.n;
      } else {
         if(var1 - 1 >= this.m.length) {
            throw new RuntimeException();
         }

         var2 = this.m[var1 - 1];
      }

      return var2;
   }
}
