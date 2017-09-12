package com.puentenet.smandroid.screens.trade;

import android.content.Context;
import com.puentenet.smandroid.screens.trade.l;
import com.puentenet.smandroid.widget.search.puentesearch.SearchResultLayout;
import java.util.Vector;

public class k extends com.puentenet.smandroid.widget.search.puentesearch.a {
   String a;
   private com.puentenet.a.d.i.a e;

   public k(Context var1, SearchResultLayout var2) {
      super(var1, var2);
   }

   // $FF: synthetic method
   static com.puentenet.a.d.i.a a(k var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static void a(k var0, com.puentenet.a.d.i.a var1) {
      var0.e = var1;
   }

   // $FF: synthetic method
   static void a(k var0, Vector var1) {
      var0.a((Vector)var1);
   }

   public void a() {
      this.e = null;
   }

   public void a(String var1) {
      com.puentenet.a.d.i.c.a().a(var1, new l(this));
   }

   public void b(String var1) {
      this.a = var1;
      if(this.e != null) {
         this.a((Vector)this.e.a(var1));
      }

   }
}
