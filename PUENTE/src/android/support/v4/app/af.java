package android.support.v4.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

class af extends FrameLayout {
   public af(Context var1) {
      super(var1);
   }

   static ViewGroup a(View var0) {
      af var1 = new af(var0.getContext());
      LayoutParams var2 = var0.getLayoutParams();
      if(var2 != null) {
         var1.setLayoutParams(var2);
      }

      var0.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
      var1.addView(var0);
      return var1;
   }

   protected void dispatchRestoreInstanceState(SparseArray var1) {
      this.dispatchThawSelfOnly(var1);
   }

   protected void dispatchSaveInstanceState(SparseArray var1) {
      this.dispatchFreezeSelfOnly(var1);
   }
}
