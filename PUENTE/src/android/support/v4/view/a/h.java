package android.support.v4.view.a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class h {
   public static Object a(Object var0) {
      return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)var0);
   }

   public static void a(Object var0, int var1) {
      ((AccessibilityNodeInfo)var0).addAction(var1);
   }

   public static void a(Object var0, Rect var1) {
      ((AccessibilityNodeInfo)var0).getBoundsInParent(var1);
   }

   public static void a(Object var0, View var1) {
      ((AccessibilityNodeInfo)var0).addChild(var1);
   }

   public static void a(Object var0, CharSequence var1) {
      ((AccessibilityNodeInfo)var0).setClassName(var1);
   }

   public static void a(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setClickable(var1);
   }

   public static int b(Object var0) {
      return ((AccessibilityNodeInfo)var0).getActions();
   }

   public static void b(Object var0, Rect var1) {
      ((AccessibilityNodeInfo)var0).getBoundsInScreen(var1);
   }

   public static void b(Object var0, View var1) {
      ((AccessibilityNodeInfo)var0).setParent(var1);
   }

   public static void b(Object var0, CharSequence var1) {
      ((AccessibilityNodeInfo)var0).setContentDescription(var1);
   }

   public static void b(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setEnabled(var1);
   }

   public static CharSequence c(Object var0) {
      return ((AccessibilityNodeInfo)var0).getClassName();
   }

   public static void c(Object var0, Rect var1) {
      ((AccessibilityNodeInfo)var0).setBoundsInParent(var1);
   }

   public static void c(Object var0, View var1) {
      ((AccessibilityNodeInfo)var0).setSource(var1);
   }

   public static void c(Object var0, CharSequence var1) {
      ((AccessibilityNodeInfo)var0).setPackageName(var1);
   }

   public static void c(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setFocusable(var1);
   }

   public static CharSequence d(Object var0) {
      return ((AccessibilityNodeInfo)var0).getContentDescription();
   }

   public static void d(Object var0, Rect var1) {
      ((AccessibilityNodeInfo)var0).setBoundsInScreen(var1);
   }

   public static void d(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setFocused(var1);
   }

   public static CharSequence e(Object var0) {
      return ((AccessibilityNodeInfo)var0).getPackageName();
   }

   public static void e(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setLongClickable(var1);
   }

   public static CharSequence f(Object var0) {
      return ((AccessibilityNodeInfo)var0).getText();
   }

   public static void f(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setScrollable(var1);
   }

   public static void g(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setSelected(var1);
   }

   public static boolean g(Object var0) {
      return ((AccessibilityNodeInfo)var0).isCheckable();
   }

   public static boolean h(Object var0) {
      return ((AccessibilityNodeInfo)var0).isChecked();
   }

   public static boolean i(Object var0) {
      return ((AccessibilityNodeInfo)var0).isClickable();
   }

   public static boolean j(Object var0) {
      return ((AccessibilityNodeInfo)var0).isEnabled();
   }

   public static boolean k(Object var0) {
      return ((AccessibilityNodeInfo)var0).isFocusable();
   }

   public static boolean l(Object var0) {
      return ((AccessibilityNodeInfo)var0).isFocused();
   }

   public static boolean m(Object var0) {
      return ((AccessibilityNodeInfo)var0).isLongClickable();
   }

   public static boolean n(Object var0) {
      return ((AccessibilityNodeInfo)var0).isPassword();
   }

   public static boolean o(Object var0) {
      return ((AccessibilityNodeInfo)var0).isScrollable();
   }

   public static boolean p(Object var0) {
      return ((AccessibilityNodeInfo)var0).isSelected();
   }

   public static void q(Object var0) {
      ((AccessibilityNodeInfo)var0).recycle();
   }
}
