package com.puentenet.smandroid;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.InitialHelpOperarScreen;

class g implements OnClickListener {
   // $FF: synthetic field
   final InitialHelpOperarScreen a;

   g(InitialHelpOperarScreen var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      this.a.setResult(-1);
      this.a.finish();
   }
}
