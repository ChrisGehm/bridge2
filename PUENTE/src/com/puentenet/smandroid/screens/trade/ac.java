package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.screens.trade.TradeSearchPanel;
import com.puentenet.smandroid.screens.trade.k;

class ac implements OnItemSelectedListener {
   // $FF: synthetic field
   final TradeSearchPanel a;

   ac(TradeSearchPanel var1) {
      this.a = var1;
   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      String var6 = this.a.getSelectedTypeInstrumento();
      ((k)TradeSearchPanel.a(this.a)).b(var6);
      if(!this.a.i() && !TradeSearchPanel.b(this.a)) {
         this.a.e();
      }

      TradeSearchPanel.a(this.a, false);
      if(TradeSearchPanel.c(this.a) != null && !this.a.i()) {
         TradeSearchPanel.c(this.a).a(var6);
      }

   }

   public void onNothingSelected(AdapterView var1) {
   }
}
