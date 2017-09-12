package com.puentenet.a.c;

import com.puentenet.a.c.b;
import java.util.Vector;

public class a {
   private long a;
   private String b;
   private String c;
   private String d;
   private b e;

   private a(com.puentenet.b.d.a.c var1) {
      this.a = var1.f("numeroCuenta");

      try {
         this.b = var1.g("nombreApellidoAsesor");
         this.c = var1.g("mailAsesor");
         this.d = var1.g("celularAsesor");
      } catch (com.puentenet.b.d.a.b var2) {
         ;
      }

   }

   public static Vector a(com.puentenet.b.d.a.a var0) {
      Vector var2 = new Vector();
      int var1 = 0;

      while(true) {
         try {
            if(var1 >= var0.a()) {
               return var2;
            }

            com.puentenet.b.d.a.c var4 = var0.b(var1);
            a var3 = new a(var4);
            var2.addElement(var3);
         } catch (com.puentenet.b.d.a.b var5) {
            throw new RuntimeException(var5.getMessage());
         }

         ++var1;
      }
   }

   public long a() {
      return this.a;
   }

   public void a(b var1) {
      this.e = var1;
   }

   public String b() {
      return this.d;
   }

   public String toString() {
      return String.valueOf(this.a);
   }
}
