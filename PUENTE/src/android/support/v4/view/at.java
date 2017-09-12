package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.v4.view.a;
import android.support.v4.view.au;
import android.support.v4.view.aw;
import android.support.v4.view.ax;
import android.support.v4.view.ay;
import android.support.v4.view.az;
import android.support.v4.view.ba;
import android.support.v4.view.bb;
import android.support.v4.view.bc;
import android.view.View;
import android.view.ViewParent;

public class at {
   static final bc a;

   static {
      int var0 = VERSION.SDK_INT;
      if(var0 >= 19) {
         a = new bb();
      } else if(var0 >= 17) {
         a = new ba();
      } else if(var0 >= 16) {
         a = new az();
      } else if(var0 >= 14) {
         a = new ay();
      } else if(var0 >= 11) {
         a = new ax();
      } else if(var0 >= 9) {
         a = new aw();
      } else {
         a = new au();
      }

   }

   public static int a(View var0) {
      return a.a(var0);
   }

   public static void a(View var0, int var1, int var2, int var3, int var4) {
      a.a(var0, var1, var2, var3, var4);
   }

   public static void a(View var0, int var1, Paint var2) {
      a.a(var0, var1, var2);
   }

   public static void a(View var0, Paint var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, a var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, Runnable var1) {
      a.a(var0, var1);
   }

   public static boolean a(View var0, int var1) {
      return a.a(var0, var1);
   }

   public static void b(View var0) {
      a.b(var0);
   }

   public static boolean b(View var0, int var1) {
      return a.b(var0, var1);
   }

   public static int c(View var0) {
      return a.c(var0);
   }

   public static void c(View var0, int var1) {
      a.c(var0, var1);
   }

   public static int d(View var0) {
      return a.d(var0);
   }

   public static int e(View var0) {
      return a.e(var0);
   }

   public static ViewParent f(View var0) {
      return a.f(var0);
   }

   public static boolean g(View var0) {
      return a.g(var0);
   }
}
