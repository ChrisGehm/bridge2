package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.view.a;
import android.support.v4.view.bc;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

class au implements bc {
   WeakHashMap a = null;

   public int a(View var1) {
      return 2;
   }

   long a() {
      return 10L;
   }

   public void a(View var1, int var2, int var3, int var4, int var5) {
      var1.invalidate(var2, var3, var4, var5);
   }

   public void a(View var1, int var2, Paint var3) {
   }

   public void a(View var1, Paint var2) {
   }

   public void a(View var1, a var2) {
   }

   public void a(View var1, Runnable var2) {
      var1.postDelayed(var2, this.a());
   }

   public boolean a(View var1, int var2) {
      return false;
   }

   public void b(View var1) {
      var1.invalidate();
   }

   public boolean b(View var1, int var2) {
      return false;
   }

   public int c(View var1) {
      return 0;
   }

   public void c(View var1, int var2) {
   }

   public int d(View var1) {
      return 0;
   }

   public int e(View var1) {
      return 0;
   }

   public ViewParent f(View var1) {
      return var1.getParent();
   }

   public boolean g(View var1) {
      boolean var3 = false;
      Drawable var4 = var1.getBackground();
      boolean var2 = var3;
      if(var4 != null) {
         var2 = var3;
         if(var4.getOpacity() == -1) {
            var2 = true;
         }
      }

      return var2;
   }
}
