package com.puentenet.smandroid.screens.configure;

import android.view.inputmethod.InputMethodManager;
import com.puentenet.a.c.o;
import com.puentenet.smandroid.screens.configure.ConfigureMainFragment;

class h extends com.puentenet.a.d.c {
   // $FF: synthetic field
   final ConfigureMainFragment a;

   h(ConfigureMainFragment var1) {
      this.a = var1;
   }

   public void a() {
      ((InputMethodManager)this.a.k().getSystemService("input_method")).hideSoftInputFromWindow(this.a.k().getCurrentFocus().getWindowToken(), 2);
      com.puentenet.smandroid.a.a().b();
   }

   public void a(Exception var1) {
      com.puentenet.smandroid.a.a().c();
      super.a(var1);
   }

   public void a(Object var1) {
      o var2 = (o)var1;
      com.puentenet.smandroid.a.a().c();
      if(ConfigureMainFragment.e(this.a).isChecked()) {
         ConfigureMainFragment.a(this.a, ConfigureMainFragment.f(this.a).getText().toString(), Integer.valueOf(ConfigureMainFragment.g(this.a).getSelectedItemPosition()), ConfigureMainFragment.h(this.a).getText().toString(), ConfigureMainFragment.i(this.a).getText().toString());
      }

      ConfigureMainFragment.a(this.a, var2);
      ConfigureMainFragment.j(this.a).showNext();
      ConfigureMainFragment.e(this.a).setVisibility(8);
      com.puentenet.a.b.b.a().a("LOGIN");
   }
}
