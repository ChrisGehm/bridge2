package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.view.ap;
import android.support.v4.view.aq;
import android.support.v4.view.ar;
import android.view.VelocityTracker;

public class ao {
   static final ar a;

   static {
      if(VERSION.SDK_INT >= 11) {
         a = new aq();
      } else {
         a = new ap();
      }

   }

   public static float a(VelocityTracker var0, int var1) {
      return a.a(var0, var1);
   }

   public static float b(VelocityTracker var0, int var1) {
      return a.b(var0, var1);
   }
}
