package com.puentenet.smandroid.screens.trade;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.puentenet.smandroid.screens.trade.TradeActivity;

class m implements OnCheckedChangeListener {
   // $FF: synthetic field
   final TradeActivity a;

   m(TradeActivity var1) {
      this.a = var1;
   }

   public void onCheckedChanged(RadioGroup var1, int var2) {
      this.a.a(var2);
   }
}
