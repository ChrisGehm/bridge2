package com.puentenet.a.c;

import com.puentenet.a.c.c;
import com.puentenet.a.c.g;
import java.util.Vector;

public class f extends c {
   private String a;
   private String b;
   private String c;
   private Float d;
   private Vector e;

   public f() {
   }

   public f(com.puentenet.b.d.a.c var1) {
      super(var1);
      this.a = var1.g("nombreInstrumento");
      this.b = var1.g("moneda");
      this.c = var1.o("mercado");
      this.d = var1.j("cantidadFaltante");
      this.e = g.a(var1.d("ejecuciones"));
   }

   public String n() {
      return this.a;
   }

   public String o() {
      return this.b;
   }

   public Float p() {
      return this.d;
   }

   public Vector q() {
      return this.e;
   }
}
