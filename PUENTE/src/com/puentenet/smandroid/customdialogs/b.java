package com.puentenet.smandroid.customdialogs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.customdialogs.CustomYesNoDialog;
import com.puentenet.smandroid.customdialogs.e;

class b implements OnClickListener {
   // $FF: synthetic field
   final CustomYesNoDialog a;
   // $FF: synthetic field
   private final int b;

   b(CustomYesNoDialog var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void onClick(DialogInterface var1, int var2) {
      e var3 = null;
      if(this.a.j() instanceof e) {
         var3 = (e)this.a.j();
      } else if(this.a.k() instanceof e) {
         var3 = (e)this.a.k();
      }

      if(var3 != null) {
         var3.a(this.b);
      }

      this.a.a();
   }
}
