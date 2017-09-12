package com.puentenet.smandroid.customdialogs;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class CustomProgressDialog extends DialogFragment {
   public static CustomProgressDialog a(String var0) {
      CustomProgressDialog var2 = new CustomProgressDialog();
      Bundle var1 = new Bundle();
      var1.putString("message", var0);
      var2.g(var1);
      return var2;
   }

   public Dialog c(Bundle var1) {
      String var2 = this.i().getString("message");
      ProgressDialog var3 = new ProgressDialog(this.k());
      var3.setMessage(var2);
      var3.setIndeterminate(true);
      return var3;
   }
}
