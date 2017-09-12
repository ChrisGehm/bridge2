package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class bf {
   public static int a(View var0) {
      return var0.getLayerType();
   }

   static long a() {
      return ValueAnimator.getFrameDelay();
   }

   public static void a(View var0, int var1, Paint var2) {
      var0.setLayerType(var1, var2);
   }
}
