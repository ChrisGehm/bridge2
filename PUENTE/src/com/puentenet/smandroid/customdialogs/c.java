package com.puentenet.smandroid.customdialogs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.puentenet.smandroid.customdialogs.CustomYesNoDialog;
import com.puentenet.smandroid.customdialogs.d;

class c implements OnClickListener {
   // $FF: synthetic field
   final CustomYesNoDialog a;
   // $FF: synthetic field
   private final int b;
   // $FF: synthetic field
   private final int c;

   c(CustomYesNoDialog var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void onClick(DialogInterface var1, int var2) {
      d var3 = null;
      if(this.a.j() instanceof d) {
         var3 = (d)this.a.j();
      } else if(this.a.k() instanceof d) {
         var3 = (d)this.a.k();
      }

      if(var3 != null) {
         var3.a(this.b, Integer.valueOf(this.c));
      }

      this.a.a();
   }
}
