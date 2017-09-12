package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.y;
import android.view.View;
import android.view.ViewGroup;

public abstract class t extends android.support.v4.view.ae {
   private final m a;
   private y b = null;
   private Fragment c = null;

   public t(m var1) {
      this.a = var1;
   }

   private static String a(int var0, long var1) {
      return "android:switcher:" + var0 + ":" + var1;
   }

   public Parcelable a() {
      return null;
   }

   public abstract Fragment a(int var1);

   public Object a(ViewGroup var1, int var2) {
      if(this.b == null) {
         this.b = this.a.a();
      }

      long var3 = this.b(var2);
      String var5 = a(var1.getId(), var3);
      Fragment var6 = this.a.a(var5);
      Fragment var7;
      if(var6 != null) {
         this.b.c(var6);
         var7 = var6;
      } else {
         var6 = this.a(var2);
         this.b.a(var1.getId(), var6, a(var1.getId(), var3));
         var7 = var6;
      }

      if(var7 != this.c) {
         var7.d(false);
         var7.e(false);
      }

      return var7;
   }

   public void a(Parcelable var1, ClassLoader var2) {
   }

   public void a(ViewGroup var1) {
   }

   public void a(ViewGroup var1, int var2, Object var3) {
      if(this.b == null) {
         this.b = this.a.a();
      }

      this.b.b((Fragment)var3);
   }

   public boolean a(View var1, Object var2) {
      boolean var3;
      if(((Fragment)var2).q() == var1) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public long b(int var1) {
      return (long)var1;
   }

   public void b(ViewGroup var1) {
      if(this.b != null) {
         this.b.b();
         this.b = null;
         this.a.b();
      }

   }

   public void b(ViewGroup var1, int var2, Object var3) {
      Fragment var4 = (Fragment)var3;
      if(var4 != this.c) {
         if(this.c != null) {
            this.c.d(false);
            this.c.e(false);
         }

         if(var4 != null) {
            var4.d(true);
            var4.e(true);
         }

         this.c = var4;
      }

   }
}
