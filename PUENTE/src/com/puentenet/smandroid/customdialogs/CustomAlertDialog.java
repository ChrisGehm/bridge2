package com.puentenet.smandroid.customdialogs;

import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.puentenet.smandroid.customdialogs.a;

public class CustomAlertDialog extends DialogFragment {
   public static CustomAlertDialog a(String var0) {
      CustomAlertDialog var1 = new CustomAlertDialog();
      Bundle var2 = new Bundle();
      var2.putString("message", var0);
      var1.g(var2);
      return var1;
   }

   public Dialog c(Bundle var1) {
      Builder var2 = new Builder(this.k());
      var2.setMessage(this.i().getString("message")).setNeutralButton("OK", new a(this));
      return var2.create();
   }
}
