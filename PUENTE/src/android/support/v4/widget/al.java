package android.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;

class al implements Runnable {
   // $FF: synthetic field
   final SwipeRefreshLayout a;

   al(SwipeRefreshLayout var1) {
      this.a = var1;
   }

   public void run() {
      SwipeRefreshLayout.a(this.a, true);
      SwipeRefreshLayout.a(this.a, SwipeRefreshLayout.f(this.a) + this.a.getPaddingTop(), SwipeRefreshLayout.g(this.a));
   }
}
