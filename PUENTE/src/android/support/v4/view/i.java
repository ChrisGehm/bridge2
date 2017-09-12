package android.support.v4.view;

import android.support.v4.view.j;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

final class i extends AccessibilityDelegate {
   // $FF: synthetic field
   final j a;

   i(j var1) {
      this.a = var1;
   }

   public boolean dispatchPopulateAccessibilityEvent(View var1, AccessibilityEvent var2) {
      return this.a.a(var1, var2);
   }

   public void onInitializeAccessibilityEvent(View var1, AccessibilityEvent var2) {
      this.a.b(var1, var2);
   }

   public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfo var2) {
      this.a.a(var1, (Object)var2);
   }

   public void onPopulateAccessibilityEvent(View var1, AccessibilityEvent var2) {
      this.a.c(var1, var2);
   }

   public boolean onRequestSendAccessibilityEvent(ViewGroup var1, View var2, AccessibilityEvent var3) {
      return this.a.a(var1, var2, var3);
   }

   public void sendAccessibilityEvent(View var1, int var2) {
      this.a.a(var1, var2);
   }

   public void sendAccessibilityEventUnchecked(View var1, AccessibilityEvent var2) {
      this.a.d(var1, var2);
   }
}
