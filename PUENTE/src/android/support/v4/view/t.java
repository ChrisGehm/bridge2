package android.support.v4.view;

import android.support.v4.view.w;
import android.view.KeyEvent;

class t implements w {
   private static int a(int var0, int var1, int var2, int var3, int var4) {
      boolean var6 = true;
      boolean var5;
      if((var1 & var2) != 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      var4 |= var3;
      boolean var7;
      if((var1 & var4) != 0) {
         var7 = var6;
      } else {
         var7 = false;
      }

      if(var5) {
         if(var7) {
            throw new IllegalArgumentException("bad arguments");
         }

         var1 = var0 & ~var4;
      } else {
         var1 = var0;
         if(var7) {
            var1 = var0 & ~var2;
         }
      }

      return var1;
   }

   public int a(int var1) {
      if((var1 & 192) != 0) {
         var1 |= 1;
      }

      int var2 = var1;
      if((var1 & 48) != 0) {
         var2 = var1 | 2;
      }

      return var2 & 247;
   }

   public void a(KeyEvent var1) {
   }

   public boolean a(int var1, int var2) {
      boolean var3 = true;
      if(a(a(this.a(var1) & 247, var2, 1, 64, 128), var2, 2, 16, 32) != var2) {
         var3 = false;
      }

      return var3;
   }

   public boolean b(int var1) {
      boolean var2;
      if((this.a(var1) & 247) == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }
}
