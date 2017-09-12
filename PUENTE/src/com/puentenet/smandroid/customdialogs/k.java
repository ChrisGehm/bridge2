package com.puentenet.smandroid.customdialogs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.customdialogs.TradeOperationDialog;
import com.puentenet.smandroid.customdialogs.d;

class k implements OnClickListener {
   // $FF: synthetic field
   final TradeOperationDialog a;
   // $FF: synthetic field
   private final int b;

   k(TradeOperationDialog var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void onClick(DialogInterface var1, int var2) {
      d var3 = null;
      if(this.a.j() instanceof d) {
         var3 = (d)this.a.j();
      } else if(this.a.k() instanceof d) {
         var3 = (d)this.a.k();
      }

      if(var3 != null) {
         var3.a(this.b, "OK");
      }

      this.a.a();
   }
}
