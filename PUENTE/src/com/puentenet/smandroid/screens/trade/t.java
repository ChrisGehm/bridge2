package com.puentenet.smandroid.screens.trade;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class t implements OnItemSelectedListener {
   // $FF: synthetic field
   final TradeFragment a;

   t(TradeFragment var1) {
      this.a = var1;
   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      this.a.b(var3);
      TradeFragment.a(this.a);
      TradeFragment.b(this.a, var3);
      if(this.a.a != null && this.a.a.equals("Opciones")) {
         TextView var6 = (TextView)this.a.k().findViewById(2131362009);
         if(TradeFragment.b != null) {
            if(var3 == 0) {
               var6.setText(TradeFragment.b.s().toString());
            } else {
               TradeFragment.b(this.a, "-");
            }
         } else {
            if(var3 == 1) {
               TradeFragment.b(this.a, "-");
            }

            var6.setText("-");
         }
      }

   }

   public void onNothingSelected(AdapterView var1) {
   }
}
