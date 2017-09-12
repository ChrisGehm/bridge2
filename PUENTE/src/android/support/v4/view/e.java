package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.b;
import android.support.v4.view.f;
import android.support.v4.view.k;
import android.view.View;

class e extends b {
   public android.support.v4.view.a.k a(Object var1, View var2) {
      var1 = k.a(var1, var2);
      android.support.v4.view.a.k var3;
      if(var1 != null) {
         var3 = new android.support.v4.view.a.k(var1);
      } else {
         var3 = null;
      }

      return var3;
   }

   public Object a(a var1) {
      return k.a(new f(this, var1));
   }

   public boolean a(Object var1, View var2, int var3, Bundle var4) {
      return k.a(var1, var2, var3, var4);
   }
}
