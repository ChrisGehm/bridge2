package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class u implements OnItemSelectedListener {
   // $FF: synthetic field
   final TradeFragment a;

   u(TradeFragment var1) {
      this.a = var1;
   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      TradeFragment.c(this.a, var3);
   }

   public void onNothingSelected(AdapterView var1) {
   }
}
