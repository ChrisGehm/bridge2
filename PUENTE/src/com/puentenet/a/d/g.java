package com.puentenet.a.d;

import com.puentenet.a.d.e;
import com.puentenet.a.d.h;

class g extends com.puentenet.b.c.b {
   // $FF: synthetic field
   final e a;
   private com.puentenet.b.c.e b;
   private com.puentenet.b.c.a d;

   public g(e var1, com.puentenet.b.c.e var2, com.puentenet.b.c.b var3, com.puentenet.b.c.a var4) {
      super(var3);
      this.a = var1;
      this.b = var2;
      this.d = var4;
   }

   // $FF: synthetic method
   static com.puentenet.b.c.e a(g var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static com.puentenet.b.c.a b(g var0) {
      return var0.d;
   }

   private void b(Exception var1) {
      com.puentenet.a.d.d.b.a().a(new h(this, var1), e.a(this.a));
   }

   // $FF: synthetic method
   static e c(g var0) {
      return var0.a;
   }

   public void a(Exception var1) {
      if(var1 instanceof com.puentenet.a.c.a.c && com.puentenet.a.e.b.h() != null) {
         this.b(var1);
      } else {
         super.a(var1);
      }

   }
}
