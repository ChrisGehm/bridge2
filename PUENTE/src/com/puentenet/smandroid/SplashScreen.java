package com.puentenet.smandroid;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.KeyEvent;
import com.puentenet.smandroid.InitialHelpWatchlistScreen;
import com.puentenet.smandroid.MainActivity;
import com.puentenet.smandroid.n;

public class SplashScreen extends Activity {
   private n a;

   protected void onActivityResult(int var1, int var2, Intent var3) {
      super.onActivityResult(var1, var2, var3);
      var1 = var2;
      if(var2 == -1) {
         SharedPreferences var5 = this.getPreferences(0);
         Editor var4 = var5.edit();
         var4.putBoolean("first", false);
         var4.commit();
         if(var5.getBoolean("firstHelp", true)) {
            this.startActivityForResult(new Intent(this.getBaseContext(), InitialHelpWatchlistScreen.class), 0);
            var1 = var2;
         } else {
            var1 = 11;
         }
      }

      if(var1 == 11) {
         Editor var6 = this.getPreferences(0).edit();
         var6.putBoolean("firstHelp", false);
         var6.commit();
         this.startActivity(new Intent(this.getBaseContext(), MainActivity.class));
         this.finish();
      } else if(var1 == 0) {
         this.finish();
      }

   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903084);
      if(this.a == null || !this.a.isAlive()) {
         this.a = new n(this, (n)null);
         this.a.start();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      return false;
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      return false;
   }
}
