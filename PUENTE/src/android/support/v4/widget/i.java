package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.ap;
import android.support.v4.widget.as;
import android.support.v4.widget.g;
import android.support.v4.widget.j;
import android.view.View;

class i extends as {
   // $FF: synthetic field
   final DrawerLayout a;
   private final int b;
   private ap c;
   private final Runnable d;

   public i(DrawerLayout var1, int var2) {
      this.a = var1;
      this.d = new j(this);
      this.b = var2;
   }

   // $FF: synthetic method
   static void a(i var0) {
      var0.c();
   }

   private void b() {
      byte var1 = 3;
      if(this.b == 3) {
         var1 = 5;
      }

      View var2 = this.a.b(var1);
      if(var2 != null) {
         this.a.i(var2);
      }

   }

   private void c() {
      int var2 = 0;
      int var3 = this.c.b();
      boolean var1;
      if(this.b == 3) {
         var1 = true;
      } else {
         var1 = false;
      }

      View var4;
      if(var1) {
         var4 = this.a.b(3);
         if(var4 != null) {
            var2 = -var4.getWidth();
         }

         var2 += var3;
      } else {
         var4 = this.a.b(5);
         var2 = this.a.getWidth();
         var2 -= var3;
      }

      if(var4 != null && (var1 && var4.getLeft() < var2 || !var1 && var4.getLeft() > var2) && this.a.a(var4) == 0) {
         g var5 = (g)var4.getLayoutParams();
         this.c.a(var4, var2, var4.getTop());
         var5.c = true;
         this.a.invalidate();
         this.b();
         this.a.c();
      }

   }

   public int a(View var1) {
      return var1.getWidth();
   }

   public int a(View var1, int var2, int var3) {
      if(this.a.a(var1, 3)) {
         var2 = Math.max(-var1.getWidth(), Math.min(var2, 0));
      } else {
         var3 = this.a.getWidth();
         var2 = Math.max(var3 - var1.getWidth(), Math.min(var2, var3));
      }

      return var2;
   }

   public void a() {
      this.a.removeCallbacks(this.d);
   }

   public void a(int var1) {
      this.a.a(this.b, var1, this.c.c());
   }

   public void a(int var1, int var2) {
      this.a.postDelayed(this.d, 160L);
   }

   public void a(ap var1) {
      this.c = var1;
   }

   public void a(View var1, float var2, float var3) {
      var3 = this.a.d(var1);
      int var6 = var1.getWidth();
      int var4;
      if(this.a.a(var1, 3)) {
         if(var2 <= 0.0F && (var2 != 0.0F || var3 <= 0.5F)) {
            var4 = -var6;
         } else {
            var4 = 0;
         }
      } else {
         label20: {
            int var5 = this.a.getWidth();
            if(var2 >= 0.0F) {
               var4 = var5;
               if(var2 != 0.0F) {
                  break label20;
               }

               var4 = var5;
               if(var3 <= 0.5F) {
                  break label20;
               }
            }

            var4 = var5 - var6;
         }
      }

      this.c.a(var4, var1.getTop());
      this.a.invalidate();
   }

   public void a(View var1, int var2, int var3, int var4, int var5) {
      var3 = var1.getWidth();
      float var6;
      if(this.a.a(var1, 3)) {
         var6 = (float)(var3 + var2) / (float)var3;
      } else {
         var6 = (float)(this.a.getWidth() - var2) / (float)var3;
      }

      this.a.b(var1, var6);
      byte var7;
      if(var6 == 0.0F) {
         var7 = 4;
      } else {
         var7 = 0;
      }

      var1.setVisibility(var7);
      this.a.invalidate();
   }

   public boolean a(View var1, int var2) {
      boolean var3;
      if(this.a.g(var1) && this.a.a(var1, this.b) && this.a.a(var1) == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public int b(View var1, int var2, int var3) {
      return var1.getTop();
   }

   public void b(int var1, int var2) {
      View var3;
      if((var1 & 1) == 1) {
         var3 = this.a.b(3);
      } else {
         var3 = this.a.b(5);
      }

      if(var3 != null && this.a.a(var3) == 0) {
         this.c.a(var3, var2);
      }

   }

   public void b(View var1, int var2) {
      ((g)var1.getLayoutParams()).c = false;
      this.b();
   }

   public boolean b(int var1) {
      return false;
   }
}
