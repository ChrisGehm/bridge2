package android.support.v4.view;

import android.support.v4.view.PagerTabStrip;
import android.view.View;
import android.view.View.OnClickListener;

class af implements OnClickListener {
   // $FF: synthetic field
   final PagerTabStrip a;

   af(PagerTabStrip var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      this.a.a.setCurrentItem(this.a.a.getCurrentItem() - 1);
   }
}
