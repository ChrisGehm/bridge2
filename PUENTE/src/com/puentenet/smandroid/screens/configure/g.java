package com.puentenet.smandroid.screens.configure;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.configure.ConfigureMainFragment;

class g implements OnClickListener {
   // $FF: synthetic field
   final ConfigureMainFragment a;

   g(ConfigureMainFragment var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      String var3 = null;
      if(com.puentenet.a.e.b.a()) {
         var3 = com.puentenet.a.e.b.d().b();
      }

      String var2 = var3;
      if(var3 == null) {
         var2 = "0-810-666-4717";
      }

      Intent var4 = new Intent("android.intent.action.CALL", Uri.parse("tel:" + var2));
      this.a.a((Intent)var4);
   }
}
