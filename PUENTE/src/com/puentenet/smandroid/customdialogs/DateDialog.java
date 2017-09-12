package com.puentenet.smandroid.customdialogs;

import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.puentenet.smandroid.customdialogs.f;
import com.puentenet.smandroid.customdialogs.g;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDialog extends DialogFragment {
   public static DialogFragment a(String var0, String var1, Date var2, int var3) {
      DateDialog var8 = new DateDialog();
      Bundle var7 = new Bundle();
      GregorianCalendar var9 = new GregorianCalendar();
      var9.setTime(var2);
      int var6 = var9.get(5);
      int var4 = var9.get(2);
      int var5 = var9.get(1);
      var7.putString("message", var0);
      var7.putString("ok", var1);
      var7.putInt("day", var6);
      var7.putInt("month", var4);
      var7.putInt("year", var5);
      var7.putInt("tag", var3);
      var8.g(var7);
      return var8;
   }

   public Dialog c(Bundle var1) {
      Builder var10 = new Builder(this.k());
      String var8 = this.i().getString("message");
      String var6 = this.i().getString("ok");
      int var5 = this.i().getInt("day");
      int var2 = this.i().getInt("month");
      int var3 = this.i().getInt("year");
      int var4 = this.i().getInt("tag");
      View var7 = LayoutInflater.from(this.k()).inflate(2130903053, (ViewGroup)null);
      DatePicker var9 = (DatePicker)var7.findViewById(2131361852);
      var9.updateDate(var3, var2, var5);
      var10.setTitle(var8).setView(var7).setNegativeButton(this.a(2131099657), new f(this)).setPositiveButton(var6, new g(this, var9, var4));
      return var10.create();
   }
}
