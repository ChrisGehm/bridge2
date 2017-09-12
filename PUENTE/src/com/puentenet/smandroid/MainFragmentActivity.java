package com.puentenet.smandroid;

import android.support.v4.app.FragmentActivity;
import com.puentenet.smandroid.MainFragmentActivity$CustomExistYesNoDialog;

public abstract class MainFragmentActivity extends FragmentActivity {
   public void f() {
      this.finish();
   }

   public void onBackPressed() {
      MainFragmentActivity$CustomExistYesNoDialog.a("Salir", 0).a(this.e(), "exit_dialog");
   }
}
