package android.support.v4.view;

import android.view.animation.Interpolator;

final class bw implements Interpolator {
   public float getInterpolation(float var1) {
      --var1;
      return var1 * var1 * var1 * var1 * var1 + 1.0F;
   }
}
