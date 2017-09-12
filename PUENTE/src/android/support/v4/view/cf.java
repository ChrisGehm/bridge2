package android.support.v4.view;

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bv;

class cf extends DataSetObserver {
   // $FF: synthetic field
   final ViewPager a;

   private cf(ViewPager var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   cf(ViewPager var1, bv var2) {
      this(var1);
   }

   public void onChanged() {
      this.a.b();
   }

   public void onInvalidated() {
      this.a.b();
   }
}
