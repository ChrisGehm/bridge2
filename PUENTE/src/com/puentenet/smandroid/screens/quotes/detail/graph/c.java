package com.puentenet.smandroid.screens.quotes.detail.graph;

import android.graphics.PointF;
import java.util.Vector;

public class c {
   private static int b = 0;
   private static int c;
   private static int d;
   private Vector a;
   private float e;
   private float f;
   private float g;

   public c(int var1, int var2) {
      this.a(var1, var2);
   }

   public static Vector a(Vector var0) {
      Vector var4 = new Vector();

      for(int var1 = var0.size() - 1; var1 >= 0; --var1) {
         com.puentenet.a.d.c.b var3 = (com.puentenet.a.d.c.b)var0.elementAt(var1);
         com.puentenet.a.a.a var2 = new com.puentenet.a.a.a();
         var2.d((float)var3.b());
         var2.a((int)(var3.c() / 86400000L));
         var2.a(var3.a());
         var2.c = var2.b;
         var2.i = var3.c();
         if(!var3.g()) {
            var2.a((float)var3.d());
            var2.b((float)var3.e());
            var2.c((float)var3.f());
         }

         var4.addElement(var2);
      }

      return var4;
   }

   public float a(float var1) {
      return ((this.e - var1) / this.g + 1.0E-9F) * (float)d;
   }

   public int a() {
      return b;
   }

   public Vector a(Vector var1, int var2) {
      byte var6 = 0;
      b = var2;
      Vector var7 = new Vector();
      this.a = var1;
      float var4 = (float)c / (float)var1.size();
      this.e = 0.0F;
      this.f = ((com.puentenet.a.a.a)var1.elementAt(0)).g;
      float var3 = 0.0F;

      for(var2 = 0; var2 < var1.size(); ++var2) {
         float var5 = ((com.puentenet.a.a.a)var1.elementAt(var2)).g;
         if(var5 > this.e) {
            this.e = var5;
         }

         if(var5 < this.f) {
            this.f = var5;
         }

         var7.add(new PointF(var3, var5));
         var3 += var4;
      }

      if(this.e == this.f) {
         ++this.e;
         --this.f;
      }

      this.g = this.e - this.f;

      for(var2 = var6; var2 < var7.size(); ++var2) {
         ((PointF)var7.elementAt(var2)).y = this.a(((PointF)var7.elementAt(var2)).y);
      }

      return var7;
   }

   public void a(int var1, int var2) {
      c = var1;
      d = var2;
   }

   public float b() {
      return this.f;
   }

   public float b(float var1) {
      var1 /= (float)d;
      return this.e - var1 * this.g;
   }

   public float c() {
      return this.g;
   }
}
