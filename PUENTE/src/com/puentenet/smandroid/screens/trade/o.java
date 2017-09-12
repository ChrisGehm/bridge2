package com.puentenet.smandroid.screens.trade;

import android.support.v4.app.Fragment;
import com.puentenet.smandroid.screens.trade.OrdersFragment;
import com.puentenet.smandroid.screens.trade.TradeActivity;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class o extends android.support.v4.app.t {
   // $FF: synthetic field
   final TradeActivity a;

   public o(TradeActivity var1, android.support.v4.app.m var2) {
      super(var2);
      this.a = var1;
   }

   public Fragment a(int var1) {
      Object var2 = null;
      switch(var1) {
      case 0:
         var2 = new TradeFragment();
         break;
      case 1:
         var2 = new OrdersFragment();
      }

      return (Fragment)var2;
   }

   public int b() {
      return 2;
   }
}
