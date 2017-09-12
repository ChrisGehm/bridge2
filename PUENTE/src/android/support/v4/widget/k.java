package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.v4.widget.l;
import android.support.v4.widget.m;
import android.support.v4.widget.n;

public class k {
   private static final n b;
   private Object a;

   static {
      if(VERSION.SDK_INT >= 14) {
         b = new m();
      } else {
         b = new l();
      }

   }

   public k(Context var1) {
      this.a = b.a(var1);
   }

   public void a(int var1, int var2) {
      b.a(this.a, var1, var2);
   }

   public boolean a() {
      return b.a(this.a);
   }

   public boolean a(float var1) {
      return b.a(this.a, var1);
   }

   public boolean a(Canvas var1) {
      return b.a(this.a, var1);
   }

   public void b() {
      b.b(this.a);
   }

   public boolean c() {
      return b.c(this.a);
   }
}
