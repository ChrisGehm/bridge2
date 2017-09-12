package com.puentenet.smandroid.customdialogs;

import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.puentenet.smandroid.customdialogs.h;
import com.puentenet.smandroid.customdialogs.i;

public class TextDialog extends DialogFragment {
   public static TextDialog a(String var0, String var1, String var2, int var3, int var4) {
      TextDialog var5 = new TextDialog();
      Bundle var6 = new Bundle();
      var6.putString("message", var0);
      var6.putString("ok", var1);
      var6.putString("edit", var2);
      var6.putInt("tag", var3);
      var6.putInt("resId", var4);
      var5.g(var6);
      return var5;
   }

   public Dialog c(Bundle var1) {
      Builder var4 = new Builder(this.k());
      String var7 = this.i().getString("message");
      String var5 = this.i().getString("ok");
      String var6 = this.i().getString("edit");
      int var3 = this.i().getInt("resId");
      int var2 = this.i().getInt("tag");
      View var8 = LayoutInflater.from(this.k()).inflate(var3, (ViewGroup)null);
      EditText var9 = (EditText)var8.findViewById(2131361982);
      var9.setText(var6);
      var4.setTitle(var7).setView(var8).setNegativeButton("Cancelar", new h(this)).setPositiveButton(var5, new i(this, var2, var9));
      return var4.create();
   }
}
