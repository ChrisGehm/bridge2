package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.MainActivity;
import com.puentenet.smandroid.screens.trade.TradeActivity;

class n implements OnClickListener {
   // $FF: synthetic field
   final TradeActivity a;

   n(TradeActivity var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      ((MainActivity)this.a.getParent()).a(4);
   }
}
