package com.puentenet.smandroid.customdialogs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.customdialogs.TextDialog;

class h implements OnClickListener {
   // $FF: synthetic field
   final TextDialog a;

   h(TextDialog var1) {
      this.a = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      this.a.a();
   }
}
