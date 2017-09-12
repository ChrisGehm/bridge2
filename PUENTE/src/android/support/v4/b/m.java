package android.support.v4.b;

import android.support.v4.b.c;

public class m implements Cloneable {
   private static final Object a = new Object();
   private boolean b;
   private int[] c;
   private Object[] d;
   private int e;

   public m() {
      this(10);
   }

   public m(int var1) {
      this.b = false;
      if(var1 == 0) {
         this.c = c.a;
         this.d = c.c;
      } else {
         var1 = c.a(var1);
         this.c = new int[var1];
         this.d = new Object[var1];
      }

      this.e = 0;
   }

   private void d() {
      int var4 = this.e;
      int[] var6 = this.c;
      Object[] var7 = this.d;
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var1 < var4; var2 = var3) {
         Object var5 = var7[var1];
         var3 = var2;
         if(var5 != a) {
            if(var1 != var2) {
               var6[var2] = var6[var1];
               var7[var2] = var5;
               var7[var1] = null;
            }

            var3 = var2 + 1;
         }

         ++var1;
      }

      this.b = false;
      this.e = var2;
   }

   public int a(int var1) {
      if(this.b) {
         this.d();
      }

      return this.c[var1];
   }

   public m a() {
      m var1;
      try {
         var1 = (m)super.clone();
      } catch (CloneNotSupportedException var4) {
         var1 = null;
         return var1;
      }

      try {
         var1.c = (int[])this.c.clone();
         var1.d = (Object[])this.d.clone();
      } catch (CloneNotSupportedException var3) {
         ;
      }

      return var1;
   }

   public int b() {
      if(this.b) {
         this.d();
      }

      return this.e;
   }

   public Object b(int var1) {
      if(this.b) {
         this.d();
      }

      return this.d[var1];
   }

   public void c() {
      int var2 = this.e;
      Object[] var3 = this.d;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = null;
      }

      this.e = 0;
      this.b = false;
   }

   // $FF: synthetic method
   public Object clone() {
      return this.a();
   }

   public String toString() {
      String var2;
      if(this.b() <= 0) {
         var2 = "{}";
      } else {
         StringBuilder var3 = new StringBuilder(this.e * 28);
         var3.append('{');

         for(int var1 = 0; var1 < this.e; ++var1) {
            if(var1 > 0) {
               var3.append(", ");
            }

            var3.append(this.a(var1));
            var3.append('=');
            Object var4 = this.b(var1);
            if(var4 != this) {
               var3.append(var4);
            } else {
               var3.append("(this Map)");
            }
         }

         var3.append('}');
         var2 = var3.toString();
      }

      return var2;
   }
}
