package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.q;
import android.support.v4.widget.r;
import android.support.v4.widget.s;
import android.support.v4.widget.t;
import android.view.animation.Interpolator;

public class p {
   Object a;
   q b;

   private p(int var1, Context var2, Interpolator var3) {
      if(var1 >= 14) {
         this.b = new t();
      } else if(var1 >= 9) {
         this.b = new s();
      } else {
         this.b = new r();
      }

      this.a = this.b.a(var2, var3);
   }

   p(Context var1, Interpolator var2) {
      this(VERSION.SDK_INT, var1, var2);
   }

   public static p a(Context var0, Interpolator var1) {
      return new p(var0, var1);
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      this.b.a(this.a, var1, var2, var3, var4, var5);
   }

   public boolean a() {
      return this.b.a(this.a);
   }

   public int b() {
      return this.b.b(this.a);
   }

   public int c() {
      return this.b.c(this.a);
   }

   public int d() {
      return this.b.f(this.a);
   }

   public int e() {
      return this.b.g(this.a);
   }

   public boolean f() {
      return this.b.d(this.a);
   }

   public void g() {
      this.b.e(this.a);
   }
}
