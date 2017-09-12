package com.puentenet.smandroid.screens.account;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.MainActivity;
import com.puentenet.smandroid.screens.account.AccountActivity;

class b implements OnClickListener {
   // $FF: synthetic field
   final AccountActivity a;

   b(AccountActivity var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      ((MainActivity)this.a.getParent()).a(4);
   }
}
