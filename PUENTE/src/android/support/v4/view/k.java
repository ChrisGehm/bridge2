package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.l;
import android.support.v4.view.m;
import android.view.View;
import android.view.View.AccessibilityDelegate;

class k {
   public static Object a(m var0) {
      return new l(var0);
   }

   public static Object a(Object var0, View var1) {
      return ((AccessibilityDelegate)var0).getAccessibilityNodeProvider(var1);
   }

   public static boolean a(Object var0, View var1, int var2, Bundle var3) {
      return ((AccessibilityDelegate)var0).performAccessibilityAction(var1, var2, var3);
   }
}
