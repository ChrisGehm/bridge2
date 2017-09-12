package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.view.o;
import android.support.v4.view.p;
import android.support.v4.view.q;

public class n {
   static final o a;

   static {
      if(VERSION.SDK_INT >= 17) {
         a = new q();
      } else {
         a = new p();
      }

   }

   public static int a(int var0, int var1) {
      return a.a(var0, var1);
   }
}
