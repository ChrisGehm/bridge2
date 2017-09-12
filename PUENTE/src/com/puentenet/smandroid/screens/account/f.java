package com.puentenet.smandroid.screens.account;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.puentenet.a.c.m;
import com.puentenet.smandroid.screens.account.AccountTenenciasFragment;
import com.puentenet.smandroid.screens.account.TenenciaView;

public class f extends com.puentenet.smandroid.widget.d {
   // $FF: synthetic field
   final AccountTenenciasFragment a;

   public f(AccountTenenciasFragment var1) {
      this.a = var1;
   }

   public View a(m var1, View var2, ViewGroup var3) {
      if(var2 == null) {
         var2 = new TenenciaView(this.a.k());
      }

      TenenciaView var4 = (TenenciaView)var2;
      var4.a(var1);
      return var4;
   }

   public View a(String var1, View var2, ViewGroup var3) {
      if(var2 == null) {
         var2 = LayoutInflater.from(this.a.k()).inflate(2130903082, var3, false);
      }

      ((TextView)var2).setText(var1);
      return var2;
   }

   // $FF: synthetic method
   public View b(Object var1, View var2, ViewGroup var3) {
      return this.a((String)var1, var2, var3);
   }
}
