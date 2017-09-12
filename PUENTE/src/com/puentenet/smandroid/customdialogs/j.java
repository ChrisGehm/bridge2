package com.puentenet.smandroid.customdialogs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.customdialogs.TradeOperationDialog;

class j implements OnClickListener {
   // $FF: synthetic field
   final TradeOperationDialog a;

   j(TradeOperationDialog var1) {
      this.a = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.a.a();
   }
}
