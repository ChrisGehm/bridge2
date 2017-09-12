package com.puentenet.smandroid.screens.account;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.t;
import com.puentenet.smandroid.screens.account.AccountActivity;
import com.puentenet.smandroid.screens.account.AccountResumenFragment;
import com.puentenet.smandroid.screens.account.AccountTenenciasFragment;

class d extends t {
   // $FF: synthetic field
   final AccountActivity a;

   public d(AccountActivity var1, m var2) {
      super(var2);
      this.a = var1;
   }

   public Fragment a(int var1) {
      Object var2 = null;
      switch(var1) {
      case 0:
         var2 = new AccountResumenFragment();
         break;
      case 1:
         var2 = new AccountTenenciasFragment();
      }

      return (Fragment)var2;
   }

   public int b() {
      return 2;
   }
}
