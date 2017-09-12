package com.puentenet.smandroid;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.InitialHelpHistorialScreen;
import com.puentenet.smandroid.InitialHelpLoginScreen;

class e implements OnClickListener {
   // $FF: synthetic field
   final InitialHelpHistorialScreen a;

   e(InitialHelpHistorialScreen var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      Intent var2 = new Intent(this.a.getBaseContext(), InitialHelpLoginScreen.class);
      this.a.startActivityForResult(var2, 0);
   }
}
