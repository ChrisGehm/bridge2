package com.puentenet.b.a;

import com.puentenet.b.a.a;
import com.puentenet.b.a.c;

public class b {
   private com.puentenet.b.c.a a;
   private com.puentenet.b.c.b b;
   private com.puentenet.b.c.e c;
   private boolean d = false;
   private boolean e = false;

   protected b() {
   }

   public b(com.puentenet.b.c.e var1, com.puentenet.b.c.b var2) {
      this.c = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   static com.puentenet.b.c.e a(b var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static void a(b var0, boolean var1) {
      var0.e = var1;
   }

   // $FF: synthetic method
   static com.puentenet.b.c.a b(b var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static boolean c(b var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static com.puentenet.b.c.b d(b var0) {
      return var0.b;
   }

   public com.puentenet.b.c.a a(com.puentenet.b.c.a var1, a var2) {
      if(this.a != null) {
         throw new IllegalStateException("An instance of HttpClient can only be used once");
      } else {
         if(var2 == null) {
            var2 = this.b();
         }

         if(var2 == null) {
            throw new IllegalStateException("Attempted to make request with no Executor assigned for this Client");
         } else {
            com.puentenet.b.c.b var3 = this.b;
            this.a = var1;
            var3.a(var1);
            this.b.a();
            var2.b(new c(this, var2));
            return var1;
         }
      }
   }

   public void a() {
      this.d = true;
      if(!this.e) {
         this.c.a();
      }

   }

   public void a(com.puentenet.b.c.a var1) {
      this.a(var1, (a)null);
   }

   protected a b() {
      return a.a();
   }
}
