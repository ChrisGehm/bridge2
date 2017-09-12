package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.m;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

final class l extends AccessibilityDelegate {
   // $FF: synthetic field
   final m a;

   l(m var1) {
      this.a = var1;
   }

   public boolean dispatchPopulateAccessibilityEvent(View var1, AccessibilityEvent var2) {
      return this.a.a(var1, var2);
   }

   public AccessibilityNodeProvider getAccessibilityNodeProvider(View var1) {
      return (AccessibilityNodeProvider)this.a.a(var1);
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

   public boolean performAccessibilityAction(View var1, int var2, Bundle var3) {
      return this.a.a(var1, var2, var3);
   }

   public void sendAccessibilityEvent(View var1, int var2) {
      this.a.a(var1, var2);
   }

   public void sendAccessibilityEventUnchecked(View var1, AccessibilityEvent var2) {
      this.a.d(var1, var2);
   }
}
