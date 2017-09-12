package com.puentenet.smandroid.screens.quotes.detail.graph;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Bitmap.Config;
import com.puentenet.smandroid.k;
import com.puentenet.smandroid.screens.quotes.detail.graph.b;
import com.puentenet.smandroid.screens.quotes.detail.graph.c;
import java.util.Calendar;
import java.util.Vector;

public class a {
   private static int f = 6;
   private static float g = 2.2F;
   private static float h = 7.0F;
   private static int i = 20;
   private static float j = 1.4F;
   private static float k = 1.4F;
   private static final float[] l = new float[]{5.0F, 5.0F};
   private static float m = 58.0F;
   private static int n = 10;
   private static int o;
   private static float p = 2.5F;
   private static float q = 2.5F;
   private static int r = 5;
   private static int s = 35;
   private static int t = 5;
   private static int u;
   private static Float x;
   c a;
   private k b;
   private Vector c;
   private Vector d;
   private int e = 0;
   private int v = 0;
   private int w = 0;

   static {
      u = (int)(5.0F + q);
   }

   public a(int var1, int var2, float var3) {
      x = new Float(var3);
      o = (int)b.a(n).measureText("000,00");
      this.g();
      this.b = new k(1, 5, 2, 2);
      this.a(var1, var2);
   }

   private float a(float var1) {
      float var2 = var1;
      if(x != null) {
         var2 = x.floatValue() * var1 + 0.5F;
      }

      return var2;
   }

   private float a(String var1, Paint var2) {
      float var3 = 0.0F;
      float[] var6 = new float[var1.length()];
      var2.getTextWidths(var1, var6);

      for(int var5 = 0; var5 < var6.length; ++var5) {
         var3 += var6[var5];
      }

      float var4 = var3;
      if(var3 > m) {
         var4 = m;
      }

      return var4;
   }

   private Bitmap a(String var1, int var2, boolean var3) {
      Paint var11 = b.a(var2);
      Paint var10 = b.b();
      Rect var8 = new Rect();
      var11.getTextBounds(var1, 0, var1.length(), var8);
      float var4 = this.a(var1, var11);
      float var5 = p + var4 + q;
      float var6 = (float)(Math.abs(var8.top) + Math.abs(var8.bottom)) + 5.0F + 5.0F;
      Bitmap var7 = Bitmap.createBitmap((int)var5, (int)var6, Config.ARGB_8888);
      Canvas var12 = new Canvas(var7);
      RectF var9 = new RectF(0.0F, 0.0F, var5, var6);
      if(var3) {
         var12.drawRoundRect(var9, 4.0F, 4.0F, var10);
      }

      var6 = var9.bottom;
      var12.drawText(var1, (var5 - var4) * 0.5F, ((float)var8.height() + var6) * 0.5F, var11);
      return var7;
   }

   private String a(Calendar var1) {
      String var2 = null;
      String var4;
      switch(this.a.a()) {
      case 0:
         if(var1.getTime().getHours() <= 9) {
            var2 = "0";
         } else {
            var2 = "";
         }

         StringBuilder var3 = (new StringBuilder(String.valueOf(var2))).append(var1.getTime().getHours()).append(":");
         if(var1.getTime().getMinutes() <= 9) {
            var2 = "0";
         } else {
            var2 = "";
         }

         var4 = var3.append(var2).append(var1.getTime().getMinutes()).toString();
         break;
      case 1:
         var4 = var1.get(5) + "/" + com.puentenet.b.e.b.a(var1.get(2));
         break;
      case 2:
         var4 = var1.get(5) + "/" + com.puentenet.b.e.b.a(var1.get(2));
         break;
      case 3:
         var4 = var1.get(5) + "/" + com.puentenet.b.e.b.a(var1.get(2)) + "/" + var1.get(1);
         break;
      case 4:
         var4 = var1.get(5) + "/" + com.puentenet.b.e.b.a(var1.get(2)) + "/" + var1.get(1);
         break;
      case 5:
         var4 = var1.get(5) + "/" + com.puentenet.b.e.b.a(var1.get(2)) + "/" + var1.get(1);
         break;
      default:
         var4 = var2;
      }

      return var4;
   }

   private void a(Bitmap var1) {
      Canvas var3 = new Canvas(var1);
      Paint var2 = b.d();
      var3.drawLine((float)t, (float)(this.w - (s + r)) + g, (float)(this.v - (u + o + 3)), (float)(this.w - (s + r)) + g, var2);
   }

   // $FF: synthetic method
   static float b() {
      return k;
   }

   private void b(Bitmap var1) {
      if(this.a.c() > 0.0F) {
         Canvas var10 = new Canvas(var1);
         Paint var8 = b.c();
         Paint var9 = b.a();
         float var4 = this.a.a(this.a.b()) - this.a.a(this.a.c() / 6.0F + this.a.b());
         float var3 = var4 * 6.0F;

         float var2;
         for(var2 = 0.0F; var2 <= var3; var2 += var4) {
            if(var2 < var3) {
               var10.drawLine(5.0F, (float)(r + f) + var2, (float)(this.v - 5), (float)(r + f) + var2, var8);
            }

            String var12;
            if(this.a.c() <= 3.0F) {
               var12 = this.b.format((double)this.a.b(var2));
            } else {
               var12 = String.valueOf((int)this.a.b(var2));
            }

            var1 = this.a(var12, n, false);
            var10.drawBitmap(var1, (float)(this.v - (var1.getWidth() + 10)), (float)(r + f) + var2 - (float)var1.getHeight() * 0.5F, var9);
         }

         int[] var13 = this.i();
         int var7 = 0;

         for(boolean var6 = false; var7 <= var13.length; ++var7) {
            if(var7 >= var13.length) {
               var2 = ((PointF)this.c.lastElement()).x;
            } else {
               var2 = ((PointF)this.c.elementAt(var13[var7])).x;
            }

            var10.drawLine((float)t + j + var2, 5.0F, (float)t + j + var2, (float)this.w - ((float)s + j), var8);
            Calendar var11 = Calendar.getInstance();
            if(var7 >= var13.length) {
               var11.setTimeInMillis(((com.puentenet.a.a.a)this.d.lastElement()).i);
            } else {
               var11.setTimeInMillis(((com.puentenet.a.a.a)this.d.elementAt(var13[var7])).i);
            }

            Bitmap var14 = this.a(this.a(var11), n, false);
            float var5 = (float)t + j + var2 - (float)var14.getWidth() * 0.5F;
            var3 = (float)(this.w - 35);
            if(var7 != 0 && this.a.a() >= 3 && !var6) {
               var6 = true;
               var3 += 13.0F;
            } else {
               var6 = false;
               var3 -= 2.0F;
            }

            var4 = var5;
            if(var7 == 0) {
               var4 = var5 + ((float)var14.getWidth() * 0.5F - (float)t * 1.3F);
            }

            var10.drawBitmap(var14, var4, var3, var9);
            var10.drawLine((float)t + j + var2, (float)this.w - ((float)(s + r) + h) + g, var2 + (float)t + j, (float)(this.w - (s + r)) + g, var9);
         }
      }

   }

   private void c(Bitmap var1) {
      Canvas var12 = new Canvas(var1);
      Paint var15;
      if((this.e & 1) == 1) {
         var15 = b.a(((PointF)this.c.elementAt(0)).y, false);
      } else {
         var15 = b.a(((PointF)this.c.elementAt(0)).y, true);
      }

      for(int var11 = 1; var11 < this.c.size(); ++var11) {
         PointF var14 = (PointF)this.c.elementAt(var11 - 1);
         PointF var13 = (PointF)this.c.elementAt(var11);
         float var3 = (float)t;
         float var9 = j;
         float var8 = var14.x;
         float var10 = (float)(r + f);
         float var4 = var14.y;
         float var6 = (float)t;
         float var7 = j;
         float var5 = var13.x;
         float var2 = (float)(r + f);
         var12.drawLine(var3 + var9 + var8, var4 + var10, var6 + var7 + var5, var13.y + var2, var15);
      }

   }

   // $FF: synthetic method
   static float[] c() {
      return l;
   }

   // $FF: synthetic method
   static float d() {
      return g;
   }

   // $FF: synthetic method
   static int e() {
      return i;
   }

   // $FF: synthetic method
   static float f() {
      return j;
   }

   private void g() {
      t = (int)this.a((float)t);
      u = (int)this.a((float)u);
      i = (int)this.a((float)i);
      g = this.a(g);
      j = this.a(j);
      k = (float)((int)this.a(k));
      m = this.a(m);
      n = (int)this.a((float)n);
      p = (float)((int)this.a(p));
      q = (float)((int)this.a(q));
      o = (int)this.a((float)o);
   }

   private Bitmap h() {
      return Bitmap.createBitmap(this.v, this.w, Config.ARGB_8888);
   }

   private int[] i() {
      byte var4 = 0;
      int var3 = 0;
      int[] var5;
      if(this.c.size() <= 6) {
         for(var5 = new int[this.c.size()]; var3 < var5.length; var5[var3] = var3++) {
            ;
         }
      } else {
         var5 = new int[6];
         float var2 = (float)this.c.size() / 6.0F;
         float var1 = 0.0F;

         for(var3 = var4; var3 < 6; var1 += var2) {
            var5[var3] = Math.round(var1);
            ++var3;
         }
      }

      return var5;
   }

   public Bitmap a() {
      return this.a(0);
   }

   public Bitmap a(int var1) {
      this.e = var1;
      Bitmap var2 = this.h();
      if(this.c != null && this.c.size() > 0) {
         this.b(var2);
         this.a(var2);
         this.c(var2);
      }

      return var2;
   }

   public void a(int var1, int var2) {
      this.v = var1;
      this.w = var2;
      var2 = t + u + o;
      var1 = r + s + f + (int)j + (int)g;
      if(this.a == null) {
         this.a = new c(this.v - var2, this.w - var1);
      } else {
         this.a.a(this.v - var2, this.w - var1);
      }

   }

   public void a(Vector var1, int var2) {
      this.d = var1;
      this.c = this.a.a(var1, var2);
   }
}
