package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.at;
import android.support.v4.widget.a;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

final class ag {
   private static final Interpolator a = a.a();
   private final Paint b = new Paint();
   private final RectF c = new RectF();
   private float d;
   private long e;
   private long f;
   private boolean g;
   private int h;
   private int i;
   private int j;
   private int k;
   private View l;
   private Rect m = new Rect();

   public ag(View var1) {
      this.l = var1;
      this.h = -1291845632;
      this.i = Integer.MIN_VALUE;
      this.j = 1291845632;
      this.k = 436207616;
   }

   private void a(Canvas var1, float var2, float var3, int var4, float var5) {
      this.b.setColor(var4);
      var1.save();
      var1.translate(var2, var3);
      var3 = a.getInterpolation(var5);
      var1.scale(var3, var3);
      var1.drawCircle(0.0F, 0.0F, var2, this.b);
      var1.restore();
   }

   private void a(Canvas var1, int var2, int var3) {
      this.b.setColor(this.h);
      var1.drawCircle((float)var2, (float)var3, (float)var2 * this.d, this.b);
   }

   void a() {
      if(!this.g) {
         this.d = 0.0F;
         this.e = AnimationUtils.currentAnimationTimeMillis();
         this.g = true;
         this.l.postInvalidate();
      }

   }

   void a(float var1) {
      this.d = var1;
      this.e = 0L;
      at.b(this.l);
   }

   void a(int var1, int var2, int var3, int var4) {
      this.m.left = var1;
      this.m.top = var2;
      this.m.right = var3;
      this.m.bottom = var4;
   }

   void a(Canvas var1) {
      int var6 = this.m.width();
      int var9 = this.m.height();
      int var8 = var6 / 2;
      int var7 = var9 / 2;
      int var5 = var1.save();
      var1.clipRect(this.m);
      if(!this.g && this.f <= 0L) {
         var6 = var5;
         if(this.d > 0.0F) {
            var6 = var5;
            if((double)this.d <= 1.0D) {
               this.a(var1, var8, var7);
               var6 = var5;
            }
         }
      } else {
         long var12 = AnimationUtils.currentAnimationTimeMillis();
         long var10 = this.e;
         long var14 = (var12 - this.e) / 2000L;
         float var2 = (float)((var12 - var10) % 2000L) / 20.0F;
         float var3;
         boolean var16;
         if(!this.g) {
            if(var12 - this.f >= 1000L) {
               this.f = 0L;
               return;
            }

            float var4 = (float)((var12 - this.f) % 1000L) / 10.0F / 100.0F;
            var3 = (float)(var6 / 2);
            var3 = a.getInterpolation(var4) * var3;
            this.c.set((float)var8 - var3, 0.0F, var3 + (float)var8, (float)var9);
            var1.saveLayerAlpha(this.c, 0, 0);
            var16 = true;
         } else {
            var16 = false;
         }

         if(var14 == 0L) {
            var1.drawColor(this.h);
         } else if(var2 >= 0.0F && var2 < 25.0F) {
            var1.drawColor(this.k);
         } else if(var2 >= 25.0F && var2 < 50.0F) {
            var1.drawColor(this.h);
         } else if(var2 >= 50.0F && var2 < 75.0F) {
            var1.drawColor(this.i);
         } else {
            var1.drawColor(this.j);
         }

         if(var2 >= 0.0F && var2 <= 25.0F) {
            var3 = (25.0F + var2) * 2.0F / 100.0F;
            this.a(var1, (float)var8, (float)var7, this.h, var3);
         }

         if(var2 >= 0.0F && var2 <= 50.0F) {
            var3 = 2.0F * var2 / 100.0F;
            this.a(var1, (float)var8, (float)var7, this.i, var3);
         }

         if(var2 >= 25.0F && var2 <= 75.0F) {
            var3 = (var2 - 25.0F) * 2.0F / 100.0F;
            this.a(var1, (float)var8, (float)var7, this.j, var3);
         }

         if(var2 >= 50.0F && var2 <= 100.0F) {
            var3 = (var2 - 50.0F) * 2.0F / 100.0F;
            this.a(var1, (float)var8, (float)var7, this.k, var3);
         }

         if(var2 >= 75.0F && var2 <= 100.0F) {
            var2 = (var2 - 75.0F) * 2.0F / 100.0F;
            this.a(var1, (float)var8, (float)var7, this.h, var2);
         }

         if(this.d > 0.0F && var16) {
            var1.restoreToCount(var5);
            var5 = var1.save();
            var1.clipRect(this.m);
            this.a(var1, var8, var7);
         }

         at.b(this.l);
         var6 = var5;
      }

      var1.restoreToCount(var6);
   }

   void b() {
      if(this.g) {
         this.d = 0.0F;
         this.f = AnimationUtils.currentAnimationTimeMillis();
         this.g = false;
         this.l.postInvalidate();
      }

   }
}
