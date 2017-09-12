package com.puentenet.smandroid;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.InitialHelpHistorialScreen;
import com.puentenet.smandroid.InitialHelpWatchlistScreen;

class h implements OnClickListener {
   // $FF: synthetic field
   final InitialHelpWatchlistScreen a;

   h(InitialHelpWatchlistScreen var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      Intent var2 = new Intent(this.a.getBaseContext(), InitialHelpHistorialScreen.class);
      this.a.startActivityForResult(var2, 0);
   }
}
