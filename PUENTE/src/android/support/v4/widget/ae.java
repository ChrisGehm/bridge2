package android.support.v4.widget;

import android.support.v4.widget.SlidingPaneLayout;
import android.support.v4.widget.ad;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ae extends ad {
   private Method a;
   private Field b;

   ae() {
      try {
         this.a = View.class.getDeclaredMethod("getDisplayList", (Class[])null);
      } catch (NoSuchMethodException var3) {
         Log.e("SlidingPaneLayout", "Couldn\'t fetch getDisplayList method; dimming won\'t work right.", var3);
      }

      try {
         this.b = View.class.getDeclaredField("mRecreateDisplayList");
         this.b.setAccessible(true);
      } catch (NoSuchFieldException var2) {
         Log.e("SlidingPaneLayout", "Couldn\'t fetch mRecreateDisplayList field; dimming will be slow.", var2);
      }

   }

   public void a(SlidingPaneLayout var1, View var2) {
      if(this.a != null && this.b != null) {
         try {
            this.b.setBoolean(var2, true);
            this.a.invoke(var2, (Object[])null);
         } catch (Exception var4) {
            Log.e("SlidingPaneLayout", "Error refreshing display list state", var4);
         }

         super.a(var1, var2);
      } else {
         var2.invalidate();
      }

   }
}
