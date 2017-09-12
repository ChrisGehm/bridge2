package com.puentenet.a.c;

import java.util.Date;
import java.util.Vector;

public class k {
   private String a;
   private String b;
   private String c;
   private String d;
   private Float e;
   private Integer f;
   private Date g;
   private Float h;
   private Float i;
   private Float j;
   private Float k;
   private Integer l;
   private Integer m;
   private Date n;
   private Float o;
   private Float p;
   private boolean q;
   private Float r;
   private Float s;
   private Float t;
   private Float u;
   private Float v;

   public k() {
   }

   private k(com.puentenet.b.d.a.c var1, boolean var2) {
      this.a = var1.g("ticker");
      this.b = var1.g("nombre");
      this.c = var1.o("moneda");
      this.d = var1.g("tipoInstrumento");
      this.e = var1.j("ultimoOperado");
      this.f = var1.n("volumenUltimoOperado");
      long var5 = var1.m("timestampUltimoOperado");
      if(var5 != 0L) {
         this.g = new Date(var5);
      }

      this.h = var1.j("variacionPorcentual");
      if(this.h != null && this.e != null) {
         double var3 = (double)(this.h.floatValue() / 100.0F);
         this.i = new Float((double)this.e.floatValue() * var3 / (var3 + 1.0D));
      }

      this.j = var1.j("bid");
      this.k = var1.j("ask");
      this.l = var1.n("volumenBid");
      this.m = var1.n("volumenAsk");
      this.o = var1.j("valorResidual");
      this.p = var1.j("tamanioLoteOpciones");
      var5 = var1.m("timestampBidAsk");
      if(var5 != 0L) {
         this.n = new Date(var5);
      }

      if(var2) {
         this.r = var1.j("open");
         this.s = var1.j("high");
         this.t = var1.j("low");
         this.u = var1.j("max52r");
         this.v = var1.j("min52r");
      }

   }

   public k(String var1, boolean var2) {
      this.a = var1;
      this.q = var2;
   }

   public static Vector a(com.puentenet.b.d.a.c param0) {
      // $FF: Couldn't be decompiled
   }

   public static k b(com.puentenet.b.d.a.c var0) {
      return new k(var0, true);
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public String d() {
      return this.d;
   }

   public Float e() {
      return this.e;
   }

   public Integer f() {
      return this.f;
   }

   public Integer g() {
      return this.l;
   }

   public Integer h() {
      return this.m;
   }

   public Float i() {
      return this.h;
   }

   public Float j() {
      return this.i;
   }

   public Float k() {
      return this.j;
   }

   public Float l() {
      return this.k;
   }

   public boolean m() {
      return this.q;
   }

   public Float n() {
      return this.r;
   }

   public Float o() {
      return this.s;
   }

   public Float p() {
      return this.t;
   }

   public Float q() {
      return this.u;
   }

   public Float r() {
      return this.v;
   }

   public Float s() {
      return this.p;
   }

   public boolean t() {
      boolean var2 = false;
      boolean var1 = var2;
      if(this.d != null) {
         if(this.d.equalsIgnoreCase("INDICE")) {
            var1 = var2;
         } else {
            var1 = true;
         }
      }

      return var1;
   }

   public String toString() {
      return "TICKER: " + this.a + " NOMBRE: " + this.b + " TIPO INSTRUMENTO: " + this.d;
   }
}
