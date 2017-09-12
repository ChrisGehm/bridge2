package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.trade.TradeTopBar;

class af implements OnClickListener {
   // $FF: synthetic field
   final TradeTopBar a;

   af(TradeTopBar var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(TradeTopBar.a(this.a) != null) {
         TradeTopBar.a(this.a).c();
      }

   }
}
