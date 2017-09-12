package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class p implements OnItemSelectedListener {
   // $FF: synthetic field
   final TradeFragment a;

   p(TradeFragment var1) {
      this.a = var1;
   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      TradeFragment.a(this.a, var3);
      TradeFragment.a(this.a, this.a.a);
   }

   public void onNothingSelected(AdapterView var1) {
   }
}
