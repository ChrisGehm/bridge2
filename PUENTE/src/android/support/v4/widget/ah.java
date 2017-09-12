package android.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class ah extends Animation {
   // $FF: synthetic field
   final SwipeRefreshLayout a;

   ah(SwipeRefreshLayout var1) {
      this.a = var1;
   }

   public void applyTransformation(float var1, Transformation var2) {
      int var3 = 0;
      if(SwipeRefreshLayout.a(this.a) != SwipeRefreshLayout.b(this.a)) {
         var3 = SwipeRefreshLayout.a(this.a) + (int)((float)(SwipeRefreshLayout.b(this.a) - SwipeRefreshLayout.a(this.a)) * var1);
      }

      int var4 = var3 - SwipeRefreshLayout.c(this.a).getTop();
      int var5 = SwipeRefreshLayout.c(this.a).getTop();
      var3 = var4;
      if(var4 + var5 < 0) {
         var3 = 0 - var5;
      }

      SwipeRefreshLayout.a(this.a, var3);
   }
}
