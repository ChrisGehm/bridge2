package android.support.v4.widget;

import android.support.v4.widget.SlidingPaneLayout;
import android.support.v4.widget.as;
import android.support.v4.widget.v;
import android.support.v4.widget.z;
import android.view.View;

class y extends as {
   // $FF: synthetic field
   final SlidingPaneLayout a;

   private y(SlidingPaneLayout var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   y(SlidingPaneLayout var1, v var2) {
      this(var1);
   }

   public int a(View var1) {
      return SlidingPaneLayout.f(this.a);
   }

   public int a(View var1, int var2, int var3) {
      z var5 = (z)SlidingPaneLayout.d(this.a).getLayoutParams();
      int var4;
      if(SlidingPaneLayout.e(this.a)) {
         var3 = this.a.getWidth();
         var4 = this.a.getPaddingRight();
         var4 = var3 - (var5.rightMargin + var4 + SlidingPaneLayout.d(this.a).getWidth());
         var3 = SlidingPaneLayout.f(this.a);
         var2 = Math.max(Math.min(var2, var4), var4 - var3);
      } else {
         var3 = this.a.getPaddingLeft();
         var4 = var5.leftMargin + var3;
         var3 = SlidingPaneLayout.f(this.a);
         var2 = Math.min(Math.max(var2, var4), var3 + var4);
      }

      return var2;
   }

   public void a(int var1) {
      if(SlidingPaneLayout.b(this.a).a() == 0) {
         if(SlidingPaneLayout.c(this.a) == 0.0F) {
            this.a.d(SlidingPaneLayout.d(this.a));
            this.a.c(SlidingPaneLayout.d(this.a));
            SlidingPaneLayout.a(this.a, false);
         } else {
            this.a.b(SlidingPaneLayout.d(this.a));
            SlidingPaneLayout.a(this.a, true);
         }
      }

   }

   public void a(View var1, float var2, float var3) {
      z var6 = (z)var1.getLayoutParams();
      int var4;
      int var5;
      if(SlidingPaneLayout.e(this.a)) {
         label26: {
            var4 = this.a.getPaddingRight();
            var5 = var6.rightMargin + var4;
            if(var2 >= 0.0F) {
               var4 = var5;
               if(var2 != 0.0F) {
                  break label26;
               }

               var4 = var5;
               if(SlidingPaneLayout.c(this.a) <= 0.5F) {
                  break label26;
               }
            }

            var4 = var5 + SlidingPaneLayout.f(this.a);
         }

         var5 = SlidingPaneLayout.d(this.a).getWidth();
         var4 = this.a.getWidth() - var4 - var5;
      } else {
         label20: {
            var4 = this.a.getPaddingLeft();
            var5 = var6.leftMargin + var4;
            if(var2 <= 0.0F) {
               var4 = var5;
               if(var2 != 0.0F) {
                  break label20;
               }

               var4 = var5;
               if(SlidingPaneLayout.c(this.a) <= 0.5F) {
                  break label20;
               }
            }

            var4 = var5 + SlidingPaneLayout.f(this.a);
         }
      }

      SlidingPaneLayout.b(this.a).a(var4, var1.getTop());
      this.a.invalidate();
   }

   public void a(View var1, int var2, int var3, int var4, int var5) {
      SlidingPaneLayout.a(this.a, var2);
      this.a.invalidate();
   }

   public boolean a(View var1, int var2) {
      boolean var3;
      if(SlidingPaneLayout.a(this.a)) {
         var3 = false;
      } else {
         var3 = ((z)var1.getLayoutParams()).b;
      }

      return var3;
   }

   public int b(View var1, int var2, int var3) {
      return var1.getTop();
   }

   public void b(int var1, int var2) {
      SlidingPaneLayout.b(this.a).a(SlidingPaneLayout.d(this.a), var2);
   }

   public void b(View var1, int var2) {
      this.a.a();
   }
}
