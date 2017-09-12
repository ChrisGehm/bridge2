package android.support.v4.view;

import android.graphics.Paint;
import android.support.v4.view.aw;
import android.support.v4.view.bf;
import android.view.View;

class ax extends aw {
   long a() {
      return bf.a();
   }

   public void a(View var1, int var2, Paint var3) {
      bf.a(var1, var2, var3);
   }

   public void a(View var1, Paint var2) {
      this.a(var1, this.d(var1), var2);
      var1.invalidate();
   }

   public int d(View var1) {
      return bf.a(var1);
   }
}
