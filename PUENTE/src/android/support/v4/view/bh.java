package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class bh {
   public static void a(View var0) {
      var0.postInvalidateOnAnimation();
   }

   public static void a(View var0, int var1) {
      var0.setImportantForAccessibility(var1);
   }

   public static void a(View var0, int var1, int var2, int var3, int var4) {
      var0.postInvalidate(var1, var2, var3, var4);
   }

   public static void a(View var0, Runnable var1) {
      var0.postOnAnimation(var1);
   }

   public static int b(View var0) {
      return var0.getImportantForAccessibility();
   }

   public static ViewParent c(View var0) {
      return var0.getParentForAccessibility();
   }
}
