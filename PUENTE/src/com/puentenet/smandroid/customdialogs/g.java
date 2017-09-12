package com.puentenet.smandroid.customdialogs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.DatePicker;
import com.puentenet.smandroid.customdialogs.DateDialog;
import com.puentenet.smandroid.customdialogs.d;
import java.util.GregorianCalendar;

class g implements OnClickListener {
   // $FF: synthetic field
   final DateDialog a;
   // $FF: synthetic field
   private final DatePicker b;
   // $FF: synthetic field
   private final int c;

   g(DateDialog var1, DatePicker var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void onClick(DialogInterface var1, int var2) {
      d var4 = null;
      if(this.a.j() instanceof d) {
         var4 = (d)this.a.j();
      } else if(this.a.k() instanceof d) {
         var4 = (d)this.a.k();
      }

      if(var4 != null) {
         GregorianCalendar var3 = new GregorianCalendar(this.b.getYear(), this.b.getMonth(), this.b.getDayOfMonth());
         var4.a(this.c, var3.getTime());
      }

      this.a.a();
   }
}
