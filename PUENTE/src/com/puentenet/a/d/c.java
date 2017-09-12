package com.puentenet.a.d;

import com.puentenet.a.d.a;
import java.io.IOException;

public abstract class c extends com.puentenet.b.c.b {
   private static a a;

   public c() {
      if(a == null) {
         throw new RuntimeException("Please, call setMessageHandler first");
      }
   }

   private void a(com.puentenet.a.c.a.a var1) {
      a.a("No ha iniciado sesión");
   }

   public static void a(a var0) {
      a = var0;
   }

   protected void a(com.puentenet.a.c.a.b var1) {
      a.a(var1.getMessage());
   }

   protected void a(com.puentenet.a.c.a.c var1) {
      a.a("La sesión ha expirado. Por favor, vuelva a iniciar sesión");
   }

   protected void a(IOException var1) {
      a.b("No se pudo conectar con el servidor");
   }

   public void a(Exception var1) {
      if(var1 instanceof com.puentenet.a.c.a.b) {
         this.a((com.puentenet.a.c.a.b)var1);
      } else if(var1 instanceof com.puentenet.a.c.a.c) {
         this.a((com.puentenet.a.c.a.c)var1);
      } else if(var1 instanceof com.puentenet.a.c.a.a) {
         this.a((com.puentenet.a.c.a.a)var1);
      } else if(var1 instanceof IOException) {
         this.a((IOException)var1);
      } else {
         this.b(var1);
      }

   }

   protected void b(Exception var1) {
      a.a("Error desconocido");
   }
}
