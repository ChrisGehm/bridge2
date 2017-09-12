package android.support.v4.view.a;

import android.os.Bundle;
import android.support.v4.view.a.w;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class v extends AccessibilityNodeProvider {
   // $FF: synthetic field
   final w a;

   v(w var1) {
      this.a = var1;
   }

   public AccessibilityNodeInfo createAccessibilityNodeInfo(int var1) {
      return (AccessibilityNodeInfo)this.a.a(var1);
   }

   public List findAccessibilityNodeInfosByText(String var1, int var2) {
      return this.a.a(var1, var2);
   }

   public AccessibilityNodeInfo findFocus(int var1) {
      return (AccessibilityNodeInfo)this.a.b(var1);
   }

   public boolean performAction(int var1, int var2, Bundle var3) {
      return this.a.a(var1, var2, var3);
   }
}
