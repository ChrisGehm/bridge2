package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.puentenet.smandroid.screens.trade.OrderView;
import com.puentenet.smandroid.screens.trade.OrdersFragment;

class i extends ArrayAdapter {
   // $FF: synthetic field
   final OrdersFragment a;

   public i(OrdersFragment var1) {
      super(var1.k(), 0);
      this.a = var1;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      if(var2 == null) {
         var2 = new OrderView(this.getContext());
      }

      OrderView var4 = (OrderView)var2;
      var4.a((com.puentenet.a.c.h)this.getItem(var1));
      return var4;
   }
}
