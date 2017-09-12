package com.puentenet.smandroid.customdialogs;

import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.puentenet.smandroid.customdialogs.j;
import com.puentenet.smandroid.customdialogs.k;
import java.text.SimpleDateFormat;

public class TradeOperationDialog extends DialogFragment {
   protected static Bundle a(com.puentenet.a.d.j.b var0, String var1, int var2) {
      Bundle var6 = new Bundle();
      String var3;
      if(var0.b() == "C") {
         var3 = "Compra ";
      } else {
         var3 = "Venta ";
      }

      String var7 = var3 + var0.h() + " " + var0.c();
      var3 = "";
      if(var0.i().equals("LI")) {
         var3 = "" + "LIMITE " + var0.j();
      } else if(var0.i().equals("ME")) {
         var3 = "" + "MERCADO";
      } else if(var0.i().equals("SL")) {
         var3 = "" + "STOP LOSS Límite: " + var0.j() + " Activación: " + var0.k();
      }

      String var5;
      if(var0.l() == "EN_EL_DIA") {
         var5 = "" + "DIA";
      } else {
         SimpleDateFormat var4 = new SimpleDateFormat("dd-MM-yyyy");
         var5 = "" + var4.format(Long.valueOf(var0.m().longValue()));
      }

      String var9 = "";
      if(var0.n() == "72") {
         var9 = "" + "72";
      } else if(var0.n() == "48") {
         var9 = "" + "48";
      } else if(var0.n() == "24") {
         var9 = "" + "24";
      }

      String var8 = var9 + " horas";
      var6.putString("operacion", var7);
      var6.putString("tipoOperacion", var3);
      var6.putString("expiracion", var5);
      var6.putString("liquidacion", var8);
      var6.putString("message", var1);
      var6.putInt("tag", var2);
      return var6;
   }

   public static TradeOperationDialog a(String var0, com.puentenet.a.d.j.b var1, int var2) {
      TradeOperationDialog var3 = new TradeOperationDialog();
      var3.g(a(var1, var0, var2));
      return var3;
   }

   protected Dialog a(String var1, View var2) {
      Builder var4 = new Builder(this.k());
      int var3 = this.i().getInt("tag");
      var4.setTitle(var1).setView(var2).setNegativeButton("No", new j(this)).setPositiveButton("Si", new k(this, var3));
      return var4.create();
   }

   protected void b(View var1) {
      String var4 = this.i().getString("operacion");
      String var3 = this.i().getString("tipoOperacion");
      String var5 = this.i().getString("expiracion");
      String var2 = this.i().getString("liquidacion");
      ((TextView)var1.findViewById(2131362013)).setText(var4);
      ((TextView)var1.findViewById(2131362015)).setText(var3);
      ((TextView)var1.findViewById(2131362017)).setText(var5);
      TextView var6 = (TextView)var1.findViewById(2131362019);
      if(var6 != null) {
         var6.setText(var2);
      }

   }

   public Dialog c(Bundle var1) {
      String var2 = this.i().getString("message");
      View var3 = LayoutInflater.from(this.k()).inflate(2130903088, (ViewGroup)null);
      this.b(var3);
      return this.a(var2, var3);
   }
}
