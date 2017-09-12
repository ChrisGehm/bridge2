package android.support.v4.widget;

import android.graphics.Paint;
import android.support.v4.view.at;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;

class x implements Runnable {
   final View a;
   // $FF: synthetic field
   final SlidingPaneLayout b;

   x(SlidingPaneLayout var1, View var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      if(this.a.getParent() == this.b) {
         at.a(this.a, 0, (Paint)null);
         SlidingPaneLayout.a(this.b, this.a);
      }

      SlidingPaneLayout.g(this.b).remove(this);
   }
}
