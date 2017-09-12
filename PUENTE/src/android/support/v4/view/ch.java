package android.support.v4.view;

import android.support.v4.view.ca;
import android.view.View;
import java.util.Comparator;

class ch implements Comparator {
   public int a(View var1, View var2) {
      ca var4 = (ca)var1.getLayoutParams();
      ca var5 = (ca)var2.getLayoutParams();
      int var3;
      if(var4.a != var5.a) {
         if(var4.a) {
            var3 = 1;
         } else {
            var3 = -1;
         }
      } else {
         var3 = var4.e - var5.e;
      }

      return var3;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((View)var1, (View)var2);
   }
}
