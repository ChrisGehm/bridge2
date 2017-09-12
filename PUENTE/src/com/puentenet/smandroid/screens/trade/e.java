package com.puentenet.smandroid.screens.trade;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.puentenet.smandroid.screens.trade.OrdersFragment;

class e implements OnCheckedChangeListener {
   // $FF: synthetic field
   final OrdersFragment a;

   e(OrdersFragment var1) {
      this.a = var1;
   }

   public void onCheckedChanged(RadioGroup var1, int var2) {
      OrdersFragment.a(this.a, var2);
   }
}
