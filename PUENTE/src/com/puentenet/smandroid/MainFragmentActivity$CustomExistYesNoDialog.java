package com.puentenet.smandroid;

import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.puentenet.smandroid.i;
import com.puentenet.smandroid.j;

public class MainFragmentActivity$CustomExistYesNoDialog extends DialogFragment {
   public static MainFragmentActivity$CustomExistYesNoDialog a(String var0, int var1) {
      MainFragmentActivity$CustomExistYesNoDialog var2 = new MainFragmentActivity$CustomExistYesNoDialog();
      var2.g(new Bundle());
      return var2;
   }

   public Dialog c(Bundle var1) {
      Builder var2 = new Builder(this.k());
      var2.setMessage(2131099774).setNegativeButton(2131099776, new i(this)).setPositiveButton(2131099775, new j(this));
      return var2.create();
   }
}
