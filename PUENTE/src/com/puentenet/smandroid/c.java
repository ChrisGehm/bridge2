package com.puentenet.smandroid;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.EulaScreen;

class c implements OnClickListener {
   // $FF: synthetic field
   final EulaScreen a;

   c(EulaScreen var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      this.a.setResult(-1);
      this.a.finish();
   }
}
