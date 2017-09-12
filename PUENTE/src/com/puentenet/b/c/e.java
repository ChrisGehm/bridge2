package com.puentenet.b.c;

import com.puentenet.b.c.d;
import java.io.IOException;

public abstract class e {
   private d a;

   private void c(d var1) {
      this.a = var1;
   }

   public abstract Object a(d var1);

   public void a() {
      d var1 = this.b();
      if(var1 != null) {
         var1.d();
      }

   }

   public d b() {
      return this.a;
   }

   public final Object b(d var1) {
      this.c(var1);

      Object var2;
      try {
         var2 = this.a(var1);
      } finally {
         try {
            var1.c().close();
         } catch (IOException var6) {
            ;
         }

      }

      return var2;
   }
}
