package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class x implements OnItemClickListener {
   // $FF: synthetic field
   final TradeFragment a;

   x(TradeFragment var1) {
      this.a = var1;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      String var6 = ((com.puentenet.a.d.i.b)var1.getItemAtPosition(var3)).c();
      TradeFragment.d(this.a).d();
      this.a.a(var6);
   }
}
