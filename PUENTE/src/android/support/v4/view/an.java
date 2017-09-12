package android.support.v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

class an extends SingleLineTransformationMethod {
   private Locale a;

   public an(Context var1) {
      this.a = var1.getResources().getConfiguration().locale;
   }

   public CharSequence getTransformation(CharSequence var1, View var2) {
      var1 = super.getTransformation(var1, var2);
      String var3;
      if(var1 != null) {
         var3 = var1.toString().toUpperCase(this.a);
      } else {
         var3 = null;
      }

      return var3;
   }
}
