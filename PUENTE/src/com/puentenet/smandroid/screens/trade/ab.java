package com.puentenet.smandroid.screens.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.screens.trade.TradeFragment$ConfirmationDialog;

class ab implements OnClickListener {
   // $FF: synthetic field
   final TradeFragment$ConfirmationDialog a;

   ab(TradeFragment$ConfirmationDialog var1) {
      this.a = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.a.a();
   }
}
