package android.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class ai extends Animation {
   // $FF: synthetic field
   final SwipeRefreshLayout a;

   ai(SwipeRefreshLayout var1) {
      this.a = var1;
   }

   public void applyTransformation(float var1, Transformation var2) {
      float var4 = SwipeRefreshLayout.d(this.a);
      float var3 = SwipeRefreshLayout.d(this.a);
      SwipeRefreshLayout.e(this.a).a(var4 + (0.0F - var3) * var1);
   }
}
