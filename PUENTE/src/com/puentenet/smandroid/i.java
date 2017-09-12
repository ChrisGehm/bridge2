package com.puentenet.smandroid;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.MainFragmentActivity$CustomExistYesNoDialog;

class i implements OnClickListener {
   // $FF: synthetic field
   final MainFragmentActivity$CustomExistYesNoDialog a;

   i(MainFragmentActivity$CustomExistYesNoDialog var1) {
      this.a = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.a.a();
   }
}
