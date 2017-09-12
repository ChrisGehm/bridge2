package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class o {
   public static Object a(Context var0) {
      return new EdgeEffect(var0);
   }

   public static void a(Object var0, int var1, int var2) {
      ((EdgeEffect)var0).setSize(var1, var2);
   }

   public static boolean a(Object var0) {
      return ((EdgeEffect)var0).isFinished();
   }

   public static boolean a(Object var0, float var1) {
      ((EdgeEffect)var0).onPull(var1);
      return true;
   }

   public static boolean a(Object var0, Canvas var1) {
      return ((EdgeEffect)var0).draw(var1);
   }

   public static void b(Object var0) {
      ((EdgeEffect)var0).finish();
   }

   public static boolean c(Object var0) {
      EdgeEffect var1 = (EdgeEffect)var0;
      var1.onRelease();
      return var1.isFinished();
   }
}
