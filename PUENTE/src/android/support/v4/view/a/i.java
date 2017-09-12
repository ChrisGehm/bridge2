package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

class i {
   public static void a(Object var0, int var1) {
      ((AccessibilityNodeInfo)var0).setMovementGranularities(var1);
   }

   public static void a(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setVisibleToUser(var1);
   }

   public static boolean a(Object var0) {
      return ((AccessibilityNodeInfo)var0).isVisibleToUser();
   }

   public static int b(Object var0) {
      return ((AccessibilityNodeInfo)var0).getMovementGranularities();
   }

   public static void b(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setAccessibilityFocused(var1);
   }

   public static boolean c(Object var0) {
      return ((AccessibilityNodeInfo)var0).isAccessibilityFocused();
   }
}
