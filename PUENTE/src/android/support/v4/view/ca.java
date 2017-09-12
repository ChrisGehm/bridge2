package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class ca extends LayoutParams {
   public boolean a;
   public int b;
   float c = 0.0F;
   boolean d;
   int e;
   int f;

   public ca() {
      super(-1, -1);
   }

   public ca(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, ViewPager.f());
      this.b = var3.getInteger(0, 48);
      var3.recycle();
   }
}
