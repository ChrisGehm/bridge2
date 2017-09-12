package com.puentenet.smandroid.customdialogs;

import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.puentenet.smandroid.customdialogs.b;
import com.puentenet.smandroid.customdialogs.c;

public class CustomYesNoDialog extends DialogFragment {
   public static CustomYesNoDialog a(String var0, int var1) {
      CustomYesNoDialog var2 = new CustomYesNoDialog();
      Bundle var3 = new Bundle();
      var3.putString("message", var0);
      var3.putInt("tag", var1);
      var3.putInt("index", -1);
      var2.g(var3);
      return var2;
   }

   public static CustomYesNoDialog a(String var0, int var1, int var2) {
      CustomYesNoDialog var4 = new CustomYesNoDialog();
      Bundle var3 = new Bundle();
      var3.putString("message", var0);
      var3.putInt("tag", var1);
      var3.putInt("index", var2);
      var4.g(var3);
      return var4;
   }

   public Dialog c(Bundle var1) {
      Builder var5 = new Builder(this.k());
      String var4 = this.i().getString("message");
      int var2 = this.i().getInt("tag");
      int var3 = this.i().getInt("index");
      var5.setMessage(var4).setNegativeButton("No", new b(this, var2)).setPositiveButton("Si", new c(this, var2, var3));
      return var5.create();
   }
}
