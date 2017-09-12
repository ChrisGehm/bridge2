package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.support.v4.view.a.aa;
import android.support.v4.view.a.ab;
import android.support.v4.view.a.ac;
import android.support.v4.view.a.y;
import android.support.v4.view.a.z;

public class x {
   private static final aa a;
   private final Object b;

   static {
      if(VERSION.SDK_INT >= 16) {
         a = new ab();
      } else if(VERSION.SDK_INT >= 15) {
         a = new z();
      } else if(VERSION.SDK_INT >= 14) {
         a = new y();
      } else {
         a = new ac();
      }

   }

   public x(Object var1) {
      this.b = var1;
   }

   public static x a() {
      return new x(a.a());
   }

   public void a(int var1) {
      a.b(this.b, var1);
   }

   public void a(boolean var1) {
      a.a(this.b, var1);
   }

   public void b(int var1) {
      a.a(this.b, var1);
   }

   public void c(int var1) {
      a.c(this.b, var1);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if(this != var1) {
         if(var1 == null) {
            var2 = false;
         } else if(this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            x var3 = (x)var1;
            if(this.b == null) {
               if(var3.b != null) {
                  var2 = false;
               }
            } else if(!this.b.equals(var3.b)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int hashCode() {
      int var1;
      if(this.b == null) {
         var1 = 0;
      } else {
         var1 = this.b.hashCode();
      }

      return var1;
   }
}
