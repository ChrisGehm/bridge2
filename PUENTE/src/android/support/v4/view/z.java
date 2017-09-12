package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.view.aa;
import android.support.v4.view.ab;
import android.support.v4.view.ac;
import android.view.MotionEvent;

public class z {
   static final ac a;

   static {
      if(VERSION.SDK_INT >= 5) {
         a = new ab();
      } else {
         a = new aa();
      }

   }

   public static int a(MotionEvent var0) {
      return var0.getAction() & 255;
   }

   public static int a(MotionEvent var0, int var1) {
      return a.a(var0, var1);
   }

   public static int b(MotionEvent var0) {
      return (var0.getAction() & '\uff00') >> 8;
   }

   public static int b(MotionEvent var0, int var1) {
      return a.b(var0, var1);
   }

   public static float c(MotionEvent var0, int var1) {
      return a.c(var0, var1);
   }

   public static int c(MotionEvent var0) {
      return a.a(var0);
   }

   public static float d(MotionEvent var0, int var1) {
      return a.d(var0, var1);
   }
}
