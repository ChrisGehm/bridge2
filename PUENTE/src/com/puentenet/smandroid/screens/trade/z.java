package com.puentenet.smandroid.screens.trade;

import android.text.Editable;
import android.text.TextWatcher;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class z implements TextWatcher {
   // $FF: synthetic field
   final TradeFragment a;

   z(TradeFragment var1) {
      this.a = var1;
   }

   public void afterTextChanged(Editable var1) {
   }

   public void beforeTextChanged(CharSequence var1, int var2, int var3, int var4) {
   }

   public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      TradeFragment.a(this.a);
   }
}
