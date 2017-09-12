package com.puentenet.smandroid.customdialogs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.puentenet.smandroid.customdialogs.TextDialog;
import com.puentenet.smandroid.customdialogs.d;

class i implements OnClickListener {
   // $FF: synthetic field
   final TextDialog a;
   // $FF: synthetic field
   private final int b;
   // $FF: synthetic field
   private final EditText c;

   i(TextDialog var1, int var2, EditText var3) {
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
         var3.a(this.b, this.c.getText().toString());
      }

      this.a.a();
   }
}
