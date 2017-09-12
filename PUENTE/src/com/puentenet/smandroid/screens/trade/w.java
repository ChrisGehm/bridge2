package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.customdialogs.TextDialog;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class w implements OnClickListener {
   // $FF: synthetic field
   final TradeFragment a;

   w(TradeFragment var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      TextDialog var2 = TextDialog.a(this.a.a(2131099719), this.a.a(2131099658), TradeFragment.c(this.a), 1, 2130903086);
      var2.a(this.a, 0);
      var2.a(this.a.m(), "dialog");
   }
}
