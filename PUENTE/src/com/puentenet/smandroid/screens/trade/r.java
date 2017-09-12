package com.puentenet.smandroid.screens.trade;

import com.puentenet.smandroid.screens.trade.TradeFragment;
import com.puentenet.smandroid.screens.trade.TradeFragment$ConfirmationDialog;
import java.util.Hashtable;

class r extends com.puentenet.a.d.c {
   // $FF: synthetic field
   final TradeFragment a;
   // $FF: synthetic field
   private final String b;

   r(TradeFragment var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a() {
      com.puentenet.smandroid.a.a().b();
   }

   public void a(Exception var1) {
      com.puentenet.smandroid.a.a().c();
      super.a(var1);
   }

   public void a(Object var1) {
      com.puentenet.smandroid.a.a().c();
      Hashtable var2 = new Hashtable();
      var2.put("CANTIDAD", TradeFragment.f(this.a).h().toString());
      var2.put("MONTO", TradeFragment.c(this.a));
      var2.put("TICKER", TradeFragment.f(this.a).c());
      com.puentenet.a.b.b.a().a(this.b, var2);
      TradeFragment.g(this.a);
      com.puentenet.a.c.i var3 = (com.puentenet.a.c.i)var1;
      StringBuilder var5 = (new StringBuilder("Estado: ")).append(com.puentenet.a.c.j.c(var3.a())).append("\nMonto aprox.: ").append(var3.b());
      String var4;
      if(var3.c().length() > 0) {
         var4 = "\n\n" + var3.c();
      } else {
         var4 = "";
      }

      TradeFragment$ConfirmationDialog.a(var5.append(var4).toString()).a(this.a.m(), "confirmation_order_dialog");
   }
}
