package android.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;

class am implements Runnable {
   // $FF: synthetic field
   final SwipeRefreshLayout a;

   am(SwipeRefreshLayout var1) {
      this.a = var1;
   }

   public void run() {
      SwipeRefreshLayout.a(this.a, true);
      if(SwipeRefreshLayout.e(this.a) != null) {
         SwipeRefreshLayout.b(this.a, SwipeRefreshLayout.h(this.a));
         SwipeRefreshLayout.j(this.a).setDuration((long)SwipeRefreshLayout.i(this.a));
         SwipeRefreshLayout.j(this.a).setAnimationListener(SwipeRefreshLayout.k(this.a));
         SwipeRefreshLayout.j(this.a).reset();
         SwipeRefreshLayout.j(this.a).setInterpolator(SwipeRefreshLayout.l(this.a));
         this.a.startAnimation(SwipeRefreshLayout.j(this.a));
      }

      SwipeRefreshLayout.a(this.a, SwipeRefreshLayout.f(this.a) + this.a.getPaddingTop(), SwipeRefreshLayout.g(this.a));
   }
}
