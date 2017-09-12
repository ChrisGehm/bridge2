package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.view.t;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.view.KeyEvent;

public class s {
   static final w a;

   static {
      if(VERSION.SDK_INT >= 11) {
         a = new v();
      } else {
         a = new t();
      }

   }

   public static boolean a(KeyEvent var0) {
      return a.b(var0.getMetaState());
   }

   public static boolean a(KeyEvent var0, int var1) {
      return a.a(var0.getMetaState(), var1);
   }

   public static void b(KeyEvent var0) {
      a.a(var0);
   }
}
