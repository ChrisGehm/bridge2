package com.puentenet.a.d.h;

import com.puentenet.a.d.h.b;
import java.util.Vector;

class c extends com.puentenet.a.d.d {
   // $FF: synthetic field
   final b d;

   public c(b var1, Vector var2) {
      super(2, "https://api.puentenet.com/api/rest/cotizaciones");
      this.d = var1;
      com.puentenet.b.d.a.c var4 = new com.puentenet.b.d.a.c();

      try {
         var4.a("tickers", var2);
      } catch (com.puentenet.b.d.a.b var3) {
         ;
      }

      this.a(var4.toString());
   }
}
