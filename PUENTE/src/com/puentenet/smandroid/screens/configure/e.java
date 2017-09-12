package com.puentenet.smandroid.screens.configure;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.screens.configure.ConfigureMainFragment;

class e implements OnItemSelectedListener {
   // $FF: synthetic field
   final ConfigureMainFragment a;

   e(ConfigureMainFragment var1) {
      this.a = var1;
   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      ConfigureMainFragment.c(this.a);
   }

   public void onNothingSelected(AdapterView var1) {
   }
}
