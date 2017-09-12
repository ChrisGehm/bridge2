package android.support.v4.view;

import android.os.Bundle;
import android.os.Build.VERSION;
import android.support.v4.view.b;
import android.support.v4.view.d;
import android.support.v4.view.e;
import android.support.v4.view.g;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a {
   private static final d b;
   private static final Object c;
   final Object a;

   static {
      if(VERSION.SDK_INT >= 16) {
         b = new e();
      } else if(VERSION.SDK_INT >= 14) {
         b = new b();
      } else {
         b = new g();
      }

      c = b.a();
   }

   public a() {
      this.a = b.a(this);
   }

   public android.support.v4.view.a.k a(View var1) {
      return b.a(c, var1);
   }

   Object a() {
      return this.a;
   }

   public void a(View var1, int var2) {
      b.a(c, var1, var2);
   }

   public void a(View var1, android.support.v4.view.a.a var2) {
      b.a(c, var1, var2);
   }

   public void a(View var1, AccessibilityEvent var2) {
      b.d(c, var1, var2);
   }

   public boolean a(View var1, int var2, Bundle var3) {
      return b.a(c, var1, var2, var3);
   }

   public boolean a(ViewGroup var1, View var2, AccessibilityEvent var3) {
      return b.a(c, var1, var2, var3);
   }

   public boolean b(View var1, AccessibilityEvent var2) {
      return b.a(c, var1, var2);
   }

   public void c(View var1, AccessibilityEvent var2) {
      b.c(c, var1, var2);
   }

   public void d(View var1, AccessibilityEvent var2) {
      b.b(c, var1, var2);
   }
}
