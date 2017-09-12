package android.support.v4.view;

import android.view.MotionEvent;

class ad {
   public static int a(MotionEvent var0) {
      return var0.getPointerCount();
   }

   public static int a(MotionEvent var0, int var1) {
      return var0.findPointerIndex(var1);
   }

   public static int b(MotionEvent var0, int var1) {
      return var0.getPointerId(var1);
   }

   public static float c(MotionEvent var0, int var1) {
      return var0.getX(var1);
   }

   public static float d(MotionEvent var0, int var1) {
      return var0.getY(var1);
   }
}
