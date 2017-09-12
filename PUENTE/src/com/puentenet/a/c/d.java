package com.puentenet.a.c;

public class d {
   private double a;
   private double b;
   private double c;
   private double d;
   private double e;

   public d(String var1, com.puentenet.b.d.a.c var2) {
      if(!var1.equals("cauciones")) {
         this.d = var2.c("total");
         this.e = var2.c("porcentajeCartera");
      }

      this.c = var2.c("garantia");
      this.b = var2.c("futuro");
      this.a = var2.c("actual");
   }

   public double a() {
      return this.a;
   }

   public double b() {
      return this.b;
   }

   public double c() {
      return this.c;
   }

   public double d() {
      return this.d;
   }

   public double e() {
      return this.e;
   }

   public String toString() {
      return "ACTUAL: " + this.a + " FUTURO: " + this.b + " GARANTIA: " + this.c + " TOTAL: " + this.d + " PORCENTAJECARTERA: " + this.e;
   }
}
