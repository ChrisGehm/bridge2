package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class z extends MarginLayoutParams {
   private static final int[] e = new int[]{16843137};
   public float a = 0.0F;
   boolean b;
   boolean c;
   Paint d;

   public z() {
      super(-1, -1);
   }

   public z(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, e);
      this.a = var3.getFloat(0, 0.0F);
      var3.recycle();
   }

   public z(LayoutParams var1) {
      super(var1);
   }

   public z(MarginLayoutParams var1) {
      super(var1);
   }
}
