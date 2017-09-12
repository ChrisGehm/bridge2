package android.support.v4.view;

import android.support.v4.view.a;
import android.support.v4.view.b;
import android.support.v4.view.j;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class c implements j {
   // $FF: synthetic field
   final a a;
   // $FF: synthetic field
   final b b;

   c(b var1, a var2) {
      this.b = var1;
      this.a = var2;
   }

   public void a(View var1, int var2) {
      this.a.a(var1, var2);
   }

   public void a(View var1, Object var2) {
      this.a.a(var1, new android.support.v4.view.a.a(var2));
   }

   public boolean a(View var1, AccessibilityEvent var2) {
      return this.a.b(var1, var2);
   }

   public boolean a(ViewGroup var1, View var2, AccessibilityEvent var3) {
      return this.a.a(var1, var2, var3);
   }

   public void b(View var1, AccessibilityEvent var2) {
      this.a.d(var1, var2);
   }

   public void c(View var1, AccessibilityEvent var2) {
      this.a.c(var1, var2);
   }

   public void d(View var1, AccessibilityEvent var2) {
      this.a.a(var1, var2);
   }
}
