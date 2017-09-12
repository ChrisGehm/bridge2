package com.puentenet.smandroid.customdialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.puentenet.smandroid.customdialogs.TradeOperationDialog;

public class TradeOptionOperationDialog extends TradeOperationDialog {
   protected static Bundle b(com.puentenet.a.d.j.b var0, String var1, int var2) {
      Bundle var3 = TradeOperationDialog.a(var0, var1, var2);
      if(var0.d().equals("C")) {
         var1 = "CALL";
      } else {
         var1 = "PUT";
      }

      var3.putString("tipo_opcion", var1);
      var3.putString("vencimiento", com.puentenet.b.e.b.a(var0.e().intValue()) + ", " + var0.f());
      var3.putString("precio_ejercicio", var0.g().toString());
      return var3;
   }

   public static TradeOptionOperationDialog b(String var0, com.puentenet.a.d.j.b var1, int var2) {
      TradeOptionOperationDialog var3 = new TradeOptionOperationDialog();
      var3.g(b(var1, var0, var2));
      return var3;
   }

   protected void b(View var1) {
      super.b(var1);
      String var2 = this.i().getString("tipo_opcion");
      String var4 = this.i().getString("vencimiento");
      String var3 = this.i().getString("precio_ejercicio");
      ((TextView)var1.findViewById(2131362021)).setText(var2);
      ((TextView)var1.findViewById(2131362023)).setText(var4);
      ((TextView)var1.findViewById(2131362025)).setText(var3);
   }

   public Dialog c(Bundle var1) {
      String var3 = this.i().getString("message");
      View var2 = LayoutInflater.from(this.k()).inflate(2130903089, (ViewGroup)null);
      this.b(var2);
      return this.a(var3, var2);
   }
}
