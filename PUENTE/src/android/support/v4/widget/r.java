package android.support.v4.widget;

import android.content.Context;
import android.support.v4.widget.q;
import android.view.animation.Interpolator;
import android.widget.Scroller;

class r implements q {
   public Object a(Context var1, Interpolator var2) {
      Scroller var3;
      if(var2 != null) {
         var3 = new Scroller(var1, var2);
      } else {
         var3 = new Scroller(var1);
      }

      return var3;
   }

   public void a(Object var1, int var2, int var3, int var4, int var5, int var6) {
      ((Scroller)var1).startScroll(var2, var3, var4, var5, var6);
   }

   public boolean a(Object var1) {
      return ((Scroller)var1).isFinished();
   }

   public int b(Object var1) {
      return ((Scroller)var1).getCurrX();
   }

   public int c(Object var1) {
      return ((Scroller)var1).getCurrY();
   }

   public boolean d(Object var1) {
      return ((Scroller)var1).computeScrollOffset();
   }

   public void e(Object var1) {
      ((Scroller)var1).abortAnimation();
   }

   public int f(Object var1) {
      return ((Scroller)var1).getFinalX();
   }

   public int g(Object var1) {
      return ((Scroller)var1).getFinalY();
   }
}
