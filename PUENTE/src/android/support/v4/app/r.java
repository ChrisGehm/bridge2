package android.support.v4.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class r implements AnimationListener {
   // $FF: synthetic field
   final Fragment a;
   // $FF: synthetic field
   final o b;

   r(o var1, Fragment var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onAnimationEnd(Animation var1) {
      if(this.a.k != null) {
         this.a.k = null;
         this.b.a(this.a, this.a.l, 0, 0, false);
      }

   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
   }
}
