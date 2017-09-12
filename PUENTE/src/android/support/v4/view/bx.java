package android.support.v4.view;

import android.support.v4.view.ViewPager;

class bx implements Runnable {
   // $FF: synthetic field
   final ViewPager a;

   bx(ViewPager var1) {
      this.a = var1;
   }

   public void run() {
      ViewPager.a(this.a, 0);
      this.a.c();
   }
}
