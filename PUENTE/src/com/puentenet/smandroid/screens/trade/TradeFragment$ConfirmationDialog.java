package com.puentenet.smandroid.screens.trade;

import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.puentenet.smandroid.screens.trade.ab;

public class TradeFragment$ConfirmationDialog extends DialogFragment {
   public static TradeFragment$ConfirmationDialog a(String var0) {
      TradeFragment$ConfirmationDialog var1 = new TradeFragment$ConfirmationDialog();
      Bundle var2 = new Bundle();
      var2.putString("message", var0);
      var1.g(var2);
      return var1;
   }

   public Dialog c(Bundle var1) {
      Builder var2 = new Builder(this.k());
      var2.setMessage(this.i().getString("message")).setTitle("Orden enviada exitosamente").setPositiveButton("Aceptar", new ab(this));
      return var2.create();
   }
}
