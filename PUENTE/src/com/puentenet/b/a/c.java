package com.puentenet.b.a;

import com.puentenet.b.a.a;
import com.puentenet.b.a.b;
import com.puentenet.b.a.d;
import com.puentenet.b.a.e;

class c implements Runnable {
   // $FF: synthetic field
   final b a;
   // $FF: synthetic field
   private final a b;

   c(b var1, a var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   static b a(c var0) {
      return var0.a;
   }

   public void run() {
      try {
         Object var2 = b.a(this.a).b(b.b(this.a).f());
         a var1 = this.b;
         d var3 = new d(this, var2);
         var1.a((Runnable)var3);
         b.a(this.a, true);
      } catch (Exception var4) {
         this.b.a((Runnable)(new e(this, var4)));
         b.a(this.a, true);
      }

   }
}
