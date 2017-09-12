package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class bg {
   public static void a(View var0, Object var1) {
      var0.setAccessibilityDelegate((AccessibilityDelegate)var1);
   }

   public static boolean a(View var0, int var1) {
      return var0.canScrollHorizontally(var1);
   }

   public static boolean b(View var0, int var1) {
      return var0.canScrollVertically(var1);
   }
}
