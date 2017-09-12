package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class y implements OnClickListener {
   // $FF: synthetic field
   final TradeFragment a;

   y(TradeFragment var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      TradeFragment.d(this.a).setSelectedTypeInstrumento("Acciones");
      TradeFragment.a(this.a, "Acciones");
      this.a.a();
   }
}
