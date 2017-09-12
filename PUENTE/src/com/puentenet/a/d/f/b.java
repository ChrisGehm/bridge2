package com.puentenet.a.d.f;

import com.puentenet.a.c.h;
import java.util.Date;
import java.util.Vector;

public class b {
   private static long a = 86400000L;
   private static long b;
   private static long c;
   private static long d;
   private static long e;
   private static long f;
   private static long[] g;
   private Vector h;
   private Vector i;
   private Vector j;
   private Vector k;
   private Vector l;
   private Vector m;
   private Vector[] n;

   static {
      b = 7L * a;
      c = 14L * a;
      d = 30L * a;
      e = 60L * a;
      f = 90L * a;
      g = new long[]{a, b, c, d, e, f};
   }

   public b(com.puentenet.b.d.a.c var1) {
      int var2 = 0;
      super();
      this.h = new Vector();
      this.i = new Vector();
      this.j = new Vector();
      this.k = new Vector();
      this.l = new Vector();
      this.m = new Vector();
      this.n = new Vector[]{this.h, this.i, this.j, this.k, this.l, this.m};

      for(com.puentenet.b.d.a.a var6 = var1.d("ordenes"); var2 < var6.a(); ++var2) {
         h var7 = new h(var6.b(var2));
         long var4 = (new Date()).getTime();
         if(var7.e() > var4 - a || var7.m() == "P") {
            this.h.addElement(var7);
         }

         for(int var3 = 1; var3 < g.length; ++var3) {
            if(var7.e() > var4 - g[var3]) {
               this.n[var3].addElement(var7);
            }
         }
      }

   }

   public Vector a(int var1) {
      if(var1 >= this.n.length) {
         throw new RuntimeException();
      } else {
         return this.n[var1];
      }
   }
}
