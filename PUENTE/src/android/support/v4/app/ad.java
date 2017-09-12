package android.support.v4.app;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ab;
import android.support.v4.app.ae;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class ad extends ab {
   static boolean a = false;
   final android.support.v4.b.m b = new android.support.v4.b.m();
   final android.support.v4.b.m c = new android.support.v4.b.m();
   final String d;
   FragmentActivity e;
   boolean f;
   boolean g;

   ad(String var1, FragmentActivity var2, boolean var3) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
   }

   void a(FragmentActivity var1) {
      this.e = var1;
   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      byte var6 = 0;
      int var5;
      if(this.b.b() > 0) {
         var3.print(var1);
         var3.println("Active Loaders:");
         String var8 = var1 + "    ";

         for(var5 = 0; var5 < this.b.b(); ++var5) {
            ae var7 = (ae)this.b.b(var5);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.b.a(var5));
            var3.print(": ");
            var3.println(var7.toString());
            var7.a(var8, var2, var3, var4);
         }
      }

      if(this.c.b() > 0) {
         var3.print(var1);
         var3.println("Inactive Loaders:");
         String var9 = var1 + "    ";

         for(var5 = var6; var5 < this.c.b(); ++var5) {
            ae var10 = (ae)this.c.b(var5);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.c.a(var5));
            var3.print(": ");
            var3.println(var10.toString());
            var10.a(var9, var2, var3, var4);
         }
      }

   }

   public boolean a() {
      int var3 = this.b.b();
      int var1 = 0;

      boolean var4;
      for(var4 = false; var1 < var3; ++var1) {
         ae var5 = (ae)this.b.b(var1);
         boolean var2;
         if(var5.h && !var5.f) {
            var2 = true;
         } else {
            var2 = false;
         }

         var4 |= var2;
      }

      return var4;
   }

   void b() {
      if(a) {
         Log.v("LoaderManager", "Starting in " + this);
      }

      if(this.f) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doStart when already started: " + this, var2);
      } else {
         this.f = true;

         for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
            ((ae)this.b.b(var1)).a();
         }
      }

   }

   void c() {
      if(a) {
         Log.v("LoaderManager", "Stopping in " + this);
      }

      if(!this.f) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doStop when not started: " + this, var2);
      } else {
         for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
            ((ae)this.b.b(var1)).e();
         }

         this.f = false;
      }

   }

   void d() {
      if(a) {
         Log.v("LoaderManager", "Retaining in " + this);
      }

      if(!this.f) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doRetain when not started: " + this, var2);
      } else {
         this.g = true;
         this.f = false;

         for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
            ((ae)this.b.b(var1)).b();
         }
      }

   }

   void e() {
      if(this.g) {
         if(a) {
            Log.v("LoaderManager", "Finished Retaining in " + this);
         }

         this.g = false;

         for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
            ((ae)this.b.b(var1)).c();
         }
      }

   }

   void f() {
      for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
         ((ae)this.b.b(var1)).k = true;
      }

   }

   void g() {
      for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
         ((ae)this.b.b(var1)).d();
      }

   }

   void h() {
      int var1;
      if(!this.g) {
         if(a) {
            Log.v("LoaderManager", "Destroying Active in " + this);
         }

         for(var1 = this.b.b() - 1; var1 >= 0; --var1) {
            ((ae)this.b.b(var1)).f();
         }

         this.b.c();
      }

      if(a) {
         Log.v("LoaderManager", "Destroying Inactive in " + this);
      }

      for(var1 = this.c.b() - 1; var1 >= 0; --var1) {
         ((ae)this.c.b(var1)).f();
      }

      this.c.c();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("LoaderManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      android.support.v4.b.d.a(this.e, var1);
      var1.append("}}");
      return var1.toString();
   }
}
