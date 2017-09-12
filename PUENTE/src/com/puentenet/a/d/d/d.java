package com.puentenet.a.d.d;

import com.puentenet.a.d.d.b;
import java.util.Hashtable;

class d extends com.puentenet.a.d.d {
   // $FF: synthetic field
   final b d;

   public d(b var1, Hashtable var2) {
      super(2, "https://api.puentenet.com/api/rest/login");
      this.d = var1;
      var2.put("idDispositivo", a);
      var2.put("tipoDispositivo", b);
      var2.put("registrationId", c);
      this.a((new com.puentenet.b.d.a.c(var2)).toString());
   }
}
