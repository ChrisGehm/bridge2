package com.puentenet.a.d;

import com.puentenet.a.d.f;
import com.puentenet.a.d.g;
import java.util.Hashtable;

public class e extends com.puentenet.b.f.a {
   private Hashtable a() {
      Hashtable var3 = com.puentenet.a.e.b.h();
      Hashtable var2 = new Hashtable();
      var2.put("numeroDocumento", var3.get("numeroDocumento"));
      var2.put("username", var3.get("username"));
      var2.put("password", var3.get("password"));
      int var1 = ((Integer)var3.get("tipoDocumento")).intValue();
      var2.put("tipoDocumento", (new String[]{"DNI", "CI", "LE", "LC", "PAS"})[var1]);
      return var2;
   }

   // $FF: synthetic method
   static Hashtable a(e var0) {
      return var0.a();
   }

   protected com.puentenet.b.a.b a(com.puentenet.b.c.e var1, com.puentenet.b.c.b var2, com.puentenet.b.c.a var3) {
      com.puentenet.b.a.b var4;
      if(!com.puentenet.a.e.b.a() && com.puentenet.a.e.b.h() != null) {
         com.puentenet.a.d.d.b.a().a(new f(this, var1, var2, var3), this.a());
         var4 = null;
      } else {
         var4 = super.a(var1, new g(this, var1, var2, var3), var3);
      }

      return var4;
   }

   protected com.puentenet.b.a.b b(com.puentenet.b.c.e var1, com.puentenet.b.c.b var2, com.puentenet.b.c.a var3) {
      return super.a(var1, var2, var3);
   }
}
