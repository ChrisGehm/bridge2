package com.puentenet.smandroid.screens.trade;

import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.customdialogs.DateDialog;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class v implements OnClickListener {
   // $FF: synthetic field
   final TradeFragment a;

   v(TradeFragment var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      DialogFragment var2 = DateDialog.a(this.a.a(2131099718), this.a.a(2131099658), TradeFragment.b(this.a), 2);
      var2.a(this.a, 0);
      var2.a(this.a.m(), "dialog");
   }
}
