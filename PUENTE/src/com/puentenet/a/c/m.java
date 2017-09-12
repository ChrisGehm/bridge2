package com.puentenet.a.c;

public class m {
   private long a;
   private String b;
   private String c;
   private String d;
   private double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   private double k;

   public m(com.puentenet.b.d.a.c var1) {
      this.a = var1.f("numeroCuenta");
      this.b = var1.g("sociedad");
      this.c = var1.g("tipoInstrumento");
      this.d = var1.a("nombre", "");
      this.e = var1.a("cantidadActual", 0.0D);
      this.f = var1.a("cantidadFutura", 0.0D);
      this.g = var1.a("cantidadGarantia", 0.0D);
      this.h = var1.a("precioActual", 0.0D);
      this.i = var1.a("tipoCambio", 0.0D);
      this.j = var1.a("total", -1.0D);
      this.k = var1.a("porcentajeCartera", -1.0D);
   }

   public String a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public double f() {
      return this.g;
   }

   public double g() {
      return this.h;
   }

   public double h() {
      return this.i;
   }

   public double i() {
      return this.j;
   }

   public double j() {
      return this.k;
   }

   public String toString() {
      return "NUMEROCUENTA: " + this.a + " SOCIEDAD: " + this.b + " TIPOINSTRUMENTO: " + this.c + " NOMBRE: " + this.d + " CANTIDADACTUAL: " + this.e + " CANTIDADFUTURA: " + this.f + " CANTIDADGARANTIA: " + this.g + " PRECIOACTUAL: " + this.h + " TIPOCAMBIO: " + this.i + " TOTAL: " + this.j + " PORCENTAJECARTERA: " + this.k;
   }
}
