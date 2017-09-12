package com.puentenet.smandroid.screens.quotes;

import com.puentenet.smandroid.screens.quotes.a;
import com.puentenet.smandroid.screens.quotes.q;
import java.util.Vector;

public class p {
   private com.puentenet.a.d.h.d a;
   private a b;

   public p(a var1) {
      this.b = var1;
      this.d();
   }

   // $FF: synthetic method
   static a a(p var0) {
      return var0.b;
   }

   private void d() {
      Vector var2 = com.puentenet.a.e.b.e().a();
      this.b.setNotifyOnChange(false);
      this.b.clear();

      for(int var1 = 0; var1 < var2.size(); ++var1) {
         this.b.add((String)var2.elementAt(var1));
      }

      this.b.notifyDataSetChanged();
   }

   public void a(String var1) {
      if(com.puentenet.a.e.b.e().a(var1)) {
         this.a.a();
         this.b.add(var1);
      }

   }

   public boolean a() {
      boolean var1;
      if(this.a != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void b() {
      if(this.a == null) {
         this.a = com.puentenet.a.d.h.d.a(30000L, new q(this));
      }

   }

   public void b(String var1) {
      com.puentenet.a.e.b.e().b(var1);
      this.b.remove(var1);
   }

   public void c() {
      this.a.a();
      this.d();
   }
}
