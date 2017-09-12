package com.puentenet.smandroid.screens.configure;

import android.os.Bundle;
import android.widget.CheckBox;
import com.puentenet.smandroid.MainFragmentActivity;
import com.puentenet.smandroid.screens.configure.ConfigureMainFragment;
import com.puentenet.smandroid.screens.configure.ConfigureMoreFragment;

public class ConfigureActivity extends MainFragmentActivity implements com.puentenet.smandroid.customdialogs.e {
   private ConfigureMoreFragment n;
   private boolean o;

   public void a(int var1) {
      ((CheckBox)this.findViewById(2131361844)).setChecked(false);
   }

   public void g() {
      if(this.n == null) {
         this.n = new ConfigureMoreFragment();
      }

      this.e().a().b(2131361830, this.n).a("main->more").a();
      this.o = true;
   }

   public void onBackPressed() {
      if(this.o) {
         this.e().a().b(2131361830, new ConfigureMainFragment()).a("more->main").a();
         this.o = false;
      } else {
         super.onBackPressed();
      }

   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903048);
      this.o = false;
      if(var1 == null) {
         this.e().a().a(2131361830, new ConfigureMainFragment()).a();
      }

   }
}
