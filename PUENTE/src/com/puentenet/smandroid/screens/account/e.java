package com.puentenet.smandroid.screens.account;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.puentenet.smandroid.screens.account.AccountResumenFragment;
import com.puentenet.smandroid.screens.account.g;

public class e extends com.puentenet.smandroid.widget.d {
   // $FF: synthetic field
   final AccountResumenFragment a;

   public e(AccountResumenFragment var1) {
      this.a = var1;
   }

   public View a(g var1, View var2, ViewGroup var3) {
      View var4 = var2;
      if(var2 == null) {
         var4 = LayoutInflater.from(this.a.k()).inflate(2130903042, var3, false);
      }

      TextView var5 = (TextView)var4.findViewById(2131361803);
      TextView var6 = (TextView)var4.findViewById(2131361804);
      TextView var7 = (TextView)var4.findViewById(2131361805);
      var5.setText(var1.a());
      var6.setText(var1.b());
      var7.setText(var1.c());
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
