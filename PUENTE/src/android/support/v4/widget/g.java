package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class g extends MarginLayoutParams {
   public int a = 0;
   float b;
   boolean c;
   boolean d;

   public g(int var1, int var2) {
      super(var1, var2);
   }

   public g(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, DrawerLayout.d());
      this.a = var3.getInt(0, 0);
      var3.recycle();
   }

   public g(g var1) {
      super(var1);
      this.a = var1.a;
   }

   public g(LayoutParams var1) {
      super(var1);
   }

   public g(MarginLayoutParams var1) {
      super(var1);
   }
}
