package com.puentenet.a.d;

import com.puentenet.a.d.c;
import com.puentenet.a.d.g;

class h extends c {
   // $FF: synthetic field
   final g a;
   // $FF: synthetic field
   private final Exception b;

   h(g var1, Exception var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(Exception var1) {
      System.out.println("NO SE PUDO RELOGUEAR");
      this.c.a(this.b);
   }

   public void a(Object var1) {
      System.out.println("HACIENDO RELOGIN...");
      g.c(this.a).b(g.a(this.a), this.c, g.b(this.a));
   }
}
