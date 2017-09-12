package com.puentenet.smandroid.screens.account;

import com.puentenet.smandroid.k;
import com.puentenet.smandroid.screens.account.g;
import java.util.ArrayList;
import java.util.List;

public class h {
   private String a;
   private List b;
   private k c;
   private g d;
   private g e;
   private g f;
   private g g;

   public h(String var1) {
      this.a = var1;
      this.b = new ArrayList();
      this.d = new g("Actual");
      this.e = new g("Futuro");
      this.f = new g("Garantía");
      this.b.add(this.d);
      this.b.add(this.e);
      this.b.add(this.f);
      this.g = new g("Total");
      this.b.add(this.g);
      this.c = new k(1, 8, 2, 2);
   }

   public String a() {
      return this.a;
   }

   public void a(com.puentenet.a.c.d var1) {
      this.d.a(this.c.format(var1.a()));
      this.e.a(this.c.format(var1.b()));
      this.f.a(this.c.format(var1.c()));
      this.g.a(this.c.format(var1.e() * 100.0D) + "%", this.c.format(var1.d()));
   }

   public List b() {
      return this.b;
   }
}
