package com.puentenet.smandroid.screens.configure;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.puentenet.smandroid.fragments.StockManagerFragment;

public class ConfigureMoreFragment extends StockManagerFragment {
   private CheckBox a;

   private void b(View var1) {
      this.a = (CheckBox)var1.findViewById(2131361849);
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2130903050, var2, false);
      this.b(var4);
      return var4;
   }

   protected void b() {
      SharedPreferences var1 = this.a().a();
      this.a.setChecked(var1.getBoolean("displayBASize", true));
   }

   protected void c() {
      this.a().a().edit().putBoolean("displayBASize", this.a.isChecked()).commit();
   }

   public void r() {
      super.r();
      this.b();
   }

   public void s() {
      super.s();
      this.c();
   }
}
