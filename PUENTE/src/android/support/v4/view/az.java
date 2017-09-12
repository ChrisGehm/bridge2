package android.support.v4.view;

import android.support.v4.view.ay;
import android.support.v4.view.bh;
import android.view.View;
import android.view.ViewParent;

class az extends ay {
   public void a(View var1, int var2, int var3, int var4, int var5) {
      bh.a(var1, var2, var3, var4, var5);
   }

   public void a(View var1, Runnable var2) {
      bh.a(var1, var2);
   }

   public void b(View var1) {
      bh.a(var1);
   }

   public int c(View var1) {
      return bh.b(var1);
   }

   public void c(View var1, int var2) {
      int var3 = var2;
      if(var2 == 4) {
         var3 = 2;
      }

      bh.a(var1, var3);
   }

   public ViewParent f(View var1) {
      return bh.c(var1);
   }
}
