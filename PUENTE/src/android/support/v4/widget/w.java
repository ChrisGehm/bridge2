package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.at;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

class w extends android.support.v4.view.a {
   // $FF: synthetic field
   final SlidingPaneLayout b;
   private final Rect c;

   w(SlidingPaneLayout var1) {
      this.b = var1;
      this.c = new Rect();
   }

   private void a(android.support.v4.view.a.a var1, android.support.v4.view.a.a var2) {
      Rect var3 = this.c;
      var2.a(var3);
      var1.b(var3);
      var2.c(var3);
      var1.d(var3);
      var1.c(var2.h());
      var1.a(var2.p());
      var1.b(var2.q());
      var1.c(var2.s());
      var1.h(var2.m());
      var1.f(var2.k());
      var1.a(var2.f());
      var1.b(var2.g());
      var1.d(var2.i());
      var1.e(var2.j());
      var1.g(var2.l());
      var1.a(var2.b());
      var1.b(var2.c());
   }

   public void a(View var1, android.support.v4.view.a.a var2) {
      android.support.v4.view.a.a var5 = android.support.v4.view.a.a.a(var2);
      super.a(var1, var5);
      this.a(var2, var5);
      var5.t();
      var2.b((CharSequence)SlidingPaneLayout.class.getName());
      var2.a(var1);
      ViewParent var6 = at.f(var1);
      if(var6 instanceof View) {
         var2.c((View)var6);
      }

      int var4 = this.b.getChildCount();

      for(int var3 = 0; var3 < var4; ++var3) {
         var1 = this.b.getChildAt(var3);
         if(!this.b(var1) && var1.getVisibility() == 0) {
            at.c(var1, 1);
            var2.b(var1);
         }
      }

   }

   public boolean a(ViewGroup var1, View var2, AccessibilityEvent var3) {
      boolean var4;
      if(!this.b(var2)) {
         var4 = super.a(var1, var2, var3);
      } else {
         var4 = false;
      }

      return var4;
   }

   public boolean b(View var1) {
      return this.b.e(var1);
   }

   public void d(View var1, AccessibilityEvent var2) {
      super.d(var1, var2);
      var2.setClassName(SlidingPaneLayout.class.getName());
   }
}
