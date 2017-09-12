package com.puentenet.smandroid;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.MainFragmentActivity;
import com.puentenet.smandroid.MainFragmentActivity$CustomExistYesNoDialog;

class j implements OnClickListener {
   // $FF: synthetic field
   final MainFragmentActivity$CustomExistYesNoDialog a;

   j(MainFragmentActivity$CustomExistYesNoDialog var1) {
      this.a = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      ((MainFragmentActivity)this.a.k()).f();
      this.a.a();
   }
}
