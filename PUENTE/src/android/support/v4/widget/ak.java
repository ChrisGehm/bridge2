package android.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.ah;
import android.support.v4.widget.an;
import android.view.animation.Animation;

class ak extends an {
   // $FF: synthetic field
   final SwipeRefreshLayout a;

   ak(SwipeRefreshLayout var1) {
      super(var1, (ah)null);
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      SwipeRefreshLayout.a(this.a, 0.0F);
   }
}
