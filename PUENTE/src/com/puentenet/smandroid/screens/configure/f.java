package com.puentenet.smandroid.screens.configure;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.puentenet.smandroid.customdialogs.CustomYesNoDialog;
import com.puentenet.smandroid.screens.configure.ConfigureMainFragment;

class f implements OnCheckedChangeListener {
   // $FF: synthetic field
   final ConfigureMainFragment a;

   f(ConfigureMainFragment var1) {
      this.a = var1;
   }

   public void onCheckedChanged(CompoundButton var1, boolean var2) {
      if(!var2) {
         ConfigureMainFragment.d(this.a);
      } else {
         CustomYesNoDialog var3 = CustomYesNoDialog.a(this.a.a(2131099675), 1);
         var3.a(this.a.j(), 0);
         var3.a(this.a.m(), "password_message");
      }

   }
}
