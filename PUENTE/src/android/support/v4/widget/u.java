package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class u {
   public static Object a(Context var0, Interpolator var1) {
      OverScroller var2;
      if(var1 != null) {
         var2 = new OverScroller(var0, var1);
      } else {
         var2 = new OverScroller(var0);
      }

      return var2;
   }

   public static void a(Object var0, int var1, int var2, int var3, int var4, int var5) {
      ((OverScroller)var0).startScroll(var1, var2, var3, var4, var5);
   }

   public static boolean a(Object var0) {
      return ((OverScroller)var0).isFinished();
   }

   public static int b(Object var0) {
      return ((OverScroller)var0).getCurrX();
   }

   public static int c(Object var0) {
      return ((OverScroller)var0).getCurrY();
   }

   public static boolean d(Object var0) {
      return ((OverScroller)var0).computeScrollOffset();
   }

   public static void e(Object var0) {
      ((OverScroller)var0).abortAnimation();
   }

   public static int f(Object var0) {
      return ((OverScroller)var0).getFinalX();
   }

   public static int g(Object var0) {
      return ((OverScroller)var0).getFinalY();
   }
}
