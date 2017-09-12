package com.puentenet.a.c;

import com.puentenet.a.c.a;
import com.puentenet.a.c.b;
import java.util.Vector;

public class o {
   boolean a;
   private String b;
   private String c;
   private Vector d;
   private String e;

   private o(String var1, String var2, Vector var3, String var4, boolean var5) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.a = var5;
   }

   public static o a(com.puentenet.b.d.a.c var0) {
      try {
         o var2 = new o(var0.g("idUsuario"), var0.g("apellidoYNombre"), a.a(var0.d("cuentas")), var0.g("tokenSesion"), var0.b("flagTiempoReal"));
         return var2;
      } catch (com.puentenet.b.d.a.b var1) {
         throw new RuntimeException(var1.getMessage());
      }
   }

   public String a() {
      return this.b;
   }

   public void a(long var1, b var3) {
      for(int var4 = 0; var4 < this.d.size(); ++var4) {
         a var5 = (a)this.d.elementAt(var4);
         if(var5.a() == var1) {
            var5.a(var3);
         }
      }

   }

   public Vector b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }

   public String toString() {
      return "ID: " + this.b + " NAME: " + this.c + " ACCOUNTS: " + this.d + " TOKEN: " + this.e + " REALTIME_ENABLED " + this.a;
   }
}
