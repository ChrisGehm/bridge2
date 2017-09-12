package com.puentenet.smandroid;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.InitialHelpLoginScreen;
import com.puentenet.smandroid.InitialHelpOperarScreen;

class f implements OnClickListener {
   // $FF: synthetic field
   final InitialHelpLoginScreen a;

   f(InitialHelpLoginScreen var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      Intent var2 = new Intent(this.a.getBaseContext(), InitialHelpOperarScreen.class);
      this.a.startActivityForResult(var2, 0);
   }
}
