package android.support.v4.view.a;

import android.os.Bundle;
import android.support.v4.view.a.a;
import android.support.v4.view.a.k;
import android.support.v4.view.a.o;
import android.support.v4.view.a.w;
import java.util.ArrayList;
import java.util.List;

class p implements w {
   // $FF: synthetic field
   final k a;
   // $FF: synthetic field
   final o b;

   p(o var1, k var2) {
      this.b = var1;
      this.a = var2;
   }

   public Object a(int var1) {
      a var2 = this.a.a(var1);
      Object var3;
      if(var2 == null) {
         var3 = null;
      } else {
         var3 = var2.a();
      }

      return var3;
   }

   public List a(String var1, int var2) {
      List var4 = this.a.a(var1, var2);
      ArrayList var5 = new ArrayList();
      int var3 = var4.size();

      for(var2 = 0; var2 < var3; ++var2) {
         var5.add(((a)var4.get(var2)).a());
      }

      return var5;
   }

   public boolean a(int var1, int var2, Bundle var3) {
      return this.a.a(var1, var2, var3);
   }

   public Object b(int var1) {
      a var2 = this.a.b(var1);
      Object var3;
      if(var2 == null) {
         var3 = null;
      } else {
         var3 = var2.a();
      }

      return var3;
   }
}
