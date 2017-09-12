package android.support.v4.view;

import android.support.v4.view.i;
import android.support.v4.view.j;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class h {
   public static Object a() {
      return new AccessibilityDelegate();
   }

   public static Object a(j var0) {
      return new i(var0);
   }

   public static void a(Object var0, View var1, int var2) {
      ((AccessibilityDelegate)var0).sendAccessibilityEvent(var1, var2);
   }

   public static void a(Object var0, View var1, Object var2) {
      ((AccessibilityDelegate)var0).onInitializeAccessibilityNodeInfo(var1, (AccessibilityNodeInfo)var2);
   }

   public static boolean a(Object var0, View var1, AccessibilityEvent var2) {
      return ((AccessibilityDelegate)var0).dispatchPopulateAccessibilityEvent(var1, var2);
   }

   public static boolean a(Object var0, ViewGroup var1, View var2, AccessibilityEvent var3) {
      return ((AccessibilityDelegate)var0).onRequestSendAccessibilityEvent(var1, var2, var3);
   }

   public static void b(Object var0, View var1, AccessibilityEvent var2) {
      ((AccessibilityDelegate)var0).onInitializeAccessibilityEvent(var1, var2);
   }

   public static void c(Object var0, View var1, AccessibilityEvent var2) {
      ((AccessibilityDelegate)var0).onPopulateAccessibilityEvent(var1, var2);
   }

   public static void d(Object var0, View var1, AccessibilityEvent var2) {
      ((AccessibilityDelegate)var0).sendAccessibilityEventUnchecked(var1, var2);
   }
}
