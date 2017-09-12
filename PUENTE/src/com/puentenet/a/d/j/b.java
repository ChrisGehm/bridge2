package com.puentenet.a.d.j;

public class b {
   private long a;
   private String b;
   private String c;
   private String d;
   private String e;
   private Integer f;
   private Integer g;
   private Double h;
   private Long i;
   private Double j;
   private String k;
   private Double l;
   private Double m;
   private String n;
   private Long o;
   private String p;

   public b() {
      if(com.puentenet.a.e.b.a()) {
         this.a = com.puentenet.a.e.b.d().a();
      } else {
         throw new RuntimeException("Shouldnt get here");
      }
   }

   public void a(Double var1) {
      this.h = var1;
   }

   public void a(Integer var1) {
      this.f = var1;
   }

   public void a(Long var1) {
      this.i = var1;
   }

   public void a(String var1) {
      this.b = var1;
   }

   public boolean a() {
      boolean var2 = false;
      boolean var1;
      if(this.c.equals("OPCION")) {
         if(!this.e.equals("C") && !this.e.equals("V")) {
            var1 = var2;
            return var1;
         }

         var1 = var2;
         if(this.f == null) {
            return var1;
         }

         var1 = var2;
         if(this.f.intValue() < 1) {
            return var1;
         }

         var1 = var2;
         if(this.f.intValue() > 12) {
            return var1;
         }

         var1 = var2;
         if(this.g == null) {
            return var1;
         }

         var1 = var2;
         if(this.g.intValue() < 2000) {
            return var1;
         }

         var1 = var2;
         if(this.g.intValue() > 2100) {
            return var1;
         }

         var1 = var2;
         if(this.h == null) {
            return var1;
         }
      }

      if(!this.c.equals("OPCION") && !this.c.equals("ACCION") && !this.c.equals("BONO")) {
         var1 = var2;
         if(!this.c.equals("ETF")) {
            return var1;
         }
      }

      if(this.i == null) {
         var1 = var2;
         if(this.j == null) {
            return var1;
         }
      }

      var1 = var2;
      if(this.k != null) {
         if(!this.k.equals("ME") && !this.k.equals("LI")) {
            var1 = var2;
            if(!this.k.equals("SL")) {
               return var1;
            }
         }

         if(this.l == null) {
            var1 = var2;
            if(this.k.equals("LI")) {
               return var1;
            }

            var1 = var2;
            if(this.k.equals("SL")) {
               return var1;
            }
         }

         if(this.m == null) {
            var1 = var2;
            if(this.k.equals("SL")) {
               return var1;
            }
         }

         var1 = var2;
         if(this.n != null) {
            if(!this.n.equals("SELECCIONAR")) {
               var1 = var2;
               if(!this.n.equals("EN_EL_DIA")) {
                  return var1;
               }
            }

            if(this.o == null) {
               var1 = var2;
               if(this.n.equals("SELECCIONAR")) {
                  return var1;
               }
            }

            if(this.p != null && !this.p.equals("00") && !this.p.equals("24") && !this.p.equals("48")) {
               var1 = var2;
               if(!this.p.equals("72")) {
                  return var1;
               }
            }

            var1 = true;
         }
      }

      return var1;
   }

   public String b() {
      return this.b;
   }

   public void b(Double var1) {
      this.l = var1;
   }

   public void b(Integer var1) {
      this.g = var1;
   }

   public void b(Long var1) {
      this.o = var1;
   }

   public void b(String var1) {
      this.c = var1;
   }

   public String c() {
      return this.d;
   }

   public void c(Double var1) {
      this.m = var1;
   }

   public void c(String var1) {
      this.d = var1;
   }

   public String d() {
      return this.e;
   }

   public void d(String var1) {
      this.e = var1;
   }

   public Integer e() {
      return this.f;
   }

   public void e(String var1) {
      this.k = var1;
   }

   public Integer f() {
      return this.g;
   }

   public void f(String var1) {
      this.n = var1;
   }

   public Double g() {
      return this.h;
   }

   public void g(String var1) {
      this.p = var1;
   }

   public Long h() {
      return this.i;
   }

   public String i() {
      return this.k;
   }

   public Double j() {
      return this.l;
   }

   public Double k() {
      return this.m;
   }

   public String l() {
      return this.n;
   }

   public Long m() {
      return this.o;
   }

   public String n() {
      return this.p;
   }

   public com.puentenet.b.d.a.c o() {
      com.puentenet.b.d.a.c var1 = new com.puentenet.b.d.a.c();
      var1.b("numeroCuenta", this.a);
      var1.a("tipoOperacion", (Object)this.b);
      var1.a("tipoInstrumento", (Object)this.c);
      var1.a("ticker", (Object)this.d);
      var1.a("tipoOpcion", (Object)this.e);
      var1.a("mesVencimientoOpcion", (Object)this.f);
      var1.a("anioVencimientoOpcion", (Object)this.g);
      var1.a("precioEjercicioOpcion", (Object)this.h);
      var1.a("cantidad", (Object)this.i);
      var1.a("monto", (Object)this.j);
      var1.a("tipoPrecio", (Object)this.k);
      var1.a("precioLimite", (Object)this.l);
      var1.a("precioDisparo", (Object)this.m);
      var1.a("tipoValidez", (Object)this.n);
      var1.a("fechaValidez", (Object)this.o);
      var1.a("tipoLiquidacion", (Object)this.p);
      return var1;
   }
}
