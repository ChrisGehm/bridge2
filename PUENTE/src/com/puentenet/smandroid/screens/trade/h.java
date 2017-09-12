package com.puentenet.smandroid.screens.trade;

import com.puentenet.smandroid.screens.trade.OrdersFragment;
import com.puentenet.smandroid.widget.FixedViewFlipper;

class h extends com.puentenet.b.c.b {
   // $FF: synthetic field
   final OrdersFragment a;
   // $FF: synthetic field
   private final com.puentenet.a.c.h b;

   h(OrdersFragment var1, com.puentenet.a.c.h var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a() {
      ((FixedViewFlipper)this.a.q().findViewById(2131362053)).setDisplayedChild(0);
   }

   public void a(Exception var1) {
   }

   public void a(Object var1) {
      OrdersFragment.a(this.a, (com.puentenet.a.c.f)var1);
      OrdersFragment.a(this.a, OrdersFragment.b(this.a), this.b);
   }
}
