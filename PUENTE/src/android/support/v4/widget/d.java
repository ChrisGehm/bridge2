package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.at;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

class d extends android.support.v4.view.a {
   // $FF: synthetic field
   final DrawerLayout b;
   private final Rect c;

   d(DrawerLayout var1) {
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
   }

   private void a(android.support.v4.view.a.a var1, ViewGroup var2) {
      int var4 = var2.getChildCount();

      for(int var3 = 0; var3 < var4; ++var3) {
         View var5 = var2.getChildAt(var3);
         if(DrawerLayout.k(var5)) {
            var1.b(var5);
         }
      }

   }

   public void a(View var1, android.support.v4.view.a.a var2) {
      android.support.v4.view.a.a var3 = android.support.v4.view.a.a.a(var2);
      super.a(var1, var3);
      var2.b((CharSequence)DrawerLayout.class.getName());
      var2.a(var1);
      ViewParent var4 = at.f(var1);
      if(var4 instanceof View) {
         var2.c((View)var4);
      }

      this.a(var2, var3);
      var3.t();
      this.a(var2, (ViewGroup)var1);
   }

   public boolean a(ViewGroup var1, View var2, AccessibilityEvent var3) {
      boolean var4;
      if(DrawerLayout.k(var2)) {
         var4 = super.a(var1, var2, var3);
      } else {
         var4 = false;
      }

      return var4;
   }

   public boolean b(View var1, AccessibilityEvent var2) {
      boolean var4;
      if(var2.getEventType() == 32) {
         List var5 = var2.getText();
         View var6 = DrawerLayout.a(this.b);
         if(var6 != null) {
            int var3 = this.b.e(var6);
            CharSequence var7 = this.b.a(var3);
            if(var7 != null) {
               var5.add(var7);
            }
         }

         var4 = true;
      } else {
         var4 = super.b(var1, var2);
      }

      return var4;
   }

   public void d(View var1, AccessibilityEvent var2) {
      super.d(var1, var2);
      var2.setClassName(DrawerLayout.class.getName());
   }
}
