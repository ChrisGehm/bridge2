package android.support.v4.widget;

import android.view.animation.Interpolator;

final class aq implements Interpolator {
   public float getInterpolation(float var1) {
      --var1;
      return var1 * var1 * var1 * var1 * var1 + 1.0F;
   }
}
