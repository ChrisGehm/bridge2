package android.support.v4.view;

import android.support.v4.view.bz;
import java.util.Comparator;

final class bv implements Comparator {
   public int a(bz var1, bz var2) {
      return var1.b - var2.b;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((bz)var1, (bz)var2);
   }
}
