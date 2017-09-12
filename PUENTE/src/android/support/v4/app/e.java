package android.support.v4.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.view.View;

class e implements l {
   // $FF: synthetic field
   final Fragment a;

   e(Fragment var1) {
      this.a = var1;
   }

   public View a(int var1) {
      if(this.a.R == null) {
         throw new IllegalStateException("Fragment does not have a view");
      } else {
         return this.a.R.findViewById(var1);
      }
   }
}
