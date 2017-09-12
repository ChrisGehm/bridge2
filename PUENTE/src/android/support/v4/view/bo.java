package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.view.bp;
import android.support.v4.view.bq;
import android.support.v4.view.br;
import android.support.v4.view.bs;
import android.support.v4.view.bt;
import android.view.ViewGroup;

public class bo {
   static final br a;

   static {
      int var0 = VERSION.SDK_INT;
      if(var0 >= 18) {
         a = new bs();
      } else if(var0 >= 14) {
         a = new bq();
      } else if(var0 >= 11) {
         a = new bp();
      } else {
         a = new bt();
      }

   }

   public static void a(ViewGroup var0, boolean var1) {
      a.a(var0, var1);
   }
}
